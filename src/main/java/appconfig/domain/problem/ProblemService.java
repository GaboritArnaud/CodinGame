package appconfig.domain.problem;

import appconfig.conf.CodinGamePropertie;
import appconfig.domain.codingame.CodingameService;
import appconfig.domain.codingame.model.Problem;
import appconfig.domain.codingame.model.Test;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.util.Strings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.function.Predicate.not;

@Service
@Log4j2
public class ProblemService {

    private static final String LINE_SEPARATOR = Strings.LINE_SEPARATOR;
    private static final String TAB = "\t";
    private static final String PATH_PACKAGE_SOLUTION = "src/main/java/solution/";
    private static final String PATH_PACKAGE_SOLUTION_TEST = "src/test/java/solution/";
    private static final String FILE_NAME = "Solution.java";
    private static final String FILE_TEST_NAME = "SolutionTest.java";
    private static final String FILE_TEST_CASE_NAME = "SolutionTestCase.java";
    private static final String PACKAGE_LINE = "package solution.%s;" + LINE_SEPARATOR;
    private static final String JAVA_FILE_TEMPLATE = """
            import java.util.*;
            import java.io.*;
            // id=%s            
            public class Solution {
                        
                public static void main(String args[]) {
                    Scanner in = new Scanner(System.in);
                        
                    System.out.println("");
                }
            }""";
    private static final String README_TEMPLATE = """
            # CodinGame
                        
            ### Description :
                        
            Ce projet se découpe en deux partie :
             - Une application qui permet d'ajouter un problème codingame (class solution + class de test avec les cas de test du problème).
             - Mes solution au problème codingame en java 17.
                        
                        
            ## Problèmes traités :
            """;
    @Autowired
    private CodingameService codingameService;
    @Autowired
    private CodinGamePropertie codinGamePropertie;

    public void createPackage(Integer id) {

        var problem = codingameService.findAllByIds(List.of(id)).stream().findFirst().orElseThrow();

        var packageName = problem.getPackageName();
        var dirPath = Paths.get(PATH_PACKAGE_SOLUTION, packageName).toString();

        if (new File(dirPath).isDirectory()) {
            throw new IllegalArgumentException("Problem " + problem.getTitle() + " is alraedy init");
        }

        createFile(packageName, FILE_NAME, PATH_PACKAGE_SOLUTION, getContent(problem));
        createFile(packageName, FILE_TEST_NAME, PATH_PACKAGE_SOLUTION_TEST, getTestContent(problem));
        createFile(packageName, FILE_TEST_CASE_NAME, PATH_PACKAGE_SOLUTION_TEST, getTestCaseContent(problem));
        generateReadMe();
    }

    public List<Problem> findAllProblemToDo() {
        var excludedId = getCurrentProblemIds();
        return codingameService.findAllProblem().stream()
                .filter(not(problem -> excludedId.stream().anyMatch(id -> Objects.equals(id, problem.getId()))))
                .toList();
    }

    private Integer getProblemId(File solution) {
        Integer id = null;
        try (var sc = new Scanner(solution);) {
            while (sc.hasNextLine() && id == null) {
                var line = sc.nextLine();
                if (line.contains("id=")) {
                    var splittedLine = line.split("id=");
                    id = Integer.parseInt(splittedLine[splittedLine.length - 1]);
                }
            }
        } catch (Exception e) {
            log.error("cannot read file " + solution.getPath());
        }

        return id;
    }

    private void generateReadMe() {
        try (var fileWriter = new FileWriter(new File("./README.md"), false);) {
            var ids = getCurrentProblemIds();
            var problemReadmeContent = codingameService.findAllByIds(ids).stream()
                    .map(problem -> "- [" + problem.getTitle() + "](" + codinGamePropertie.getBaseUrl() + problem.getDetailsPageUrl() + ")")
                    .collect(Collectors.joining("\n"));
            fileWriter.write(README_TEMPLATE + LINE_SEPARATOR + problemReadmeContent);
        } catch (Exception e) {
            log.error("can't update README.md for problem : " + e.getMessage());
        }
    }

    private void createFile(String packageName, String fileName, String basePath, String content) {
        var dirPath = Paths.get(basePath, packageName);


        Path file = null;
        try {
            Files.createDirectories(dirPath);
            file = Files.createFile(Paths.get(basePath, packageName, fileName));
        } catch (Exception e) {
            log.error("can't create file '" + fileName + "' : " + e.getMessage());
        }

        try (var writer = new BufferedWriter(new FileWriter(String.valueOf(file)))) {
            writer.write(content);
        } catch (Exception e) {
            log.error("can't create file '" + fileName + "' : " + e.getMessage());
        }
    }

    private String getContent(Problem problem) {
        return String.format(PACKAGE_LINE, problem.getPackageName()) +
                LINE_SEPARATOR +
                String.format(JAVA_FILE_TEMPLATE, problem.getId());
    }

    private String getTestContent(Problem problem) {
        var provideParamsArgument = problem.getTests().stream()
                .map(test -> TAB.repeat(4) + test.toProvideParam())
                .collect(Collectors.joining(",\n"));

        return String.format(PACKAGE_LINE, problem.getPackageName()) +
                LINE_SEPARATOR +
                """
                        import org.junit.jupiter.api.TestInstance;
                        import org.junit.jupiter.params.ParameterizedTest;
                        import org.junit.jupiter.params.provider.Arguments;
                        import org.junit.jupiter.params.provider.MethodSource;
                                                import java.io.ByteArrayInputStream;
                        import java.io.ByteArrayOutputStream;
                        import java.io.PrintStream;
                        import java.nio.charset.StandardCharsets;
                        import java.util.stream.Stream;
                                                
                        import static org.junit.jupiter.api.Assertions.assertEquals;
                                                
                        @TestInstance(TestInstance.Lifecycle.PER_CLASS)                      
                        public class SolutionTest {
                                                
                                                
                            @ParameterizedTest
                            @MethodSource("provideParamsForMainTest")
                            void mainTest(String input, String expected) {
                                // GIVEN
                                ByteArrayOutputStream outContent = new ByteArrayOutputStream();
                                System.setOut(new PrintStream(outContent));
                                System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
                                // WHEN
                                Solution.main(null);
                                // THEN
                                assertEquals(expected, outContent.toString().replace("\\r", ""));
                            }
                        """ +
                LINE_SEPARATOR +
                """
                        public Stream<Arguments> provideParamsForMainTest() {
                            return Stream.of(
                            """ +
                provideParamsArgument +
                LINE_SEPARATOR +
                "   );" + LINE_SEPARATOR +
                "   }" + LINE_SEPARATOR +
                "}";
    }

    private String getTestCaseContent(Problem problem) {
        var content = new StringBuilder().append("package solution.").append(problem.getPackageName()).append(";").append(LINE_SEPARATOR)
                .append(LINE_SEPARATOR)
                .append("public class SolutionTestCase {").append(LINE_SEPARATOR);

        var testCases = problem.getTests().stream()
                .map(Test::toTestCase)
                .collect(Collectors.joining(LINE_SEPARATOR));

        content.append(testCases);
        content.append(LINE_SEPARATOR);
        content.append("}");

        return content.toString();
    }

    private List<Integer> getCurrentProblemIds() {
        var solutions = new File(PATH_PACKAGE_SOLUTION);
        if (solutions.exists()) {
            return Arrays.stream(Objects.requireNonNull(solutions.listFiles()))
                    .map(file -> Arrays.stream(Objects.requireNonNull(file.listFiles())).findFirst())
                    .flatMap(Optional::stream)
                    .map(this::getProblemId)
                    .toList();
        } else {
            return Collections.emptyList();
        }
    }

}
