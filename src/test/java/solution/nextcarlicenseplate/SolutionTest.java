package solution.nextcarlicenseplate;

import org.junit.jupiter.api.Test;
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
import static org.junit.jupiter.api.Assertions.assertThrows;

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
        assertEquals(expected, outContent.toString().replace("\r", ""));
    }

    @Test
    void when_wrong_immat_format_throw_IllegalArgumentException() {
        // GIVEN
        var wrongImmat = "wrong-format";
        // WHEN
        var exception = assertThrows(IllegalArgumentException.class, () -> {
            new Solution.Immat(wrongImmat);
        });
        // THEN
        var expected = String.format("L'immatriculation %s est invalide, exemple d'immatriculation valide : AB-123-CD", wrongImmat);
        assertEquals(expected, exception.getMessage());
    }

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of(
                Arguments.of(SolutionTestCase.INPUT_1, SolutionTestCase.EXPECTED_1),
                Arguments.of(SolutionTestCase.INPUT_2, SolutionTestCase.EXPECTED_2),
                Arguments.of(SolutionTestCase.INPUT_3, SolutionTestCase.EXPECTED_3),
                Arguments.of(SolutionTestCase.INPUT_4, SolutionTestCase.EXPECTED_4),
                Arguments.of(SolutionTestCase.INPUT_5, SolutionTestCase.EXPECTED_5),
                Arguments.of(SolutionTestCase.INPUT_6, SolutionTestCase.EXPECTED_6),
                Arguments.of(SolutionTestCase.INPUT_7, SolutionTestCase.EXPECTED_7),
                Arguments.of(SolutionTestCase.INPUT_8, SolutionTestCase.EXPECTED_8)
        );
    }
}