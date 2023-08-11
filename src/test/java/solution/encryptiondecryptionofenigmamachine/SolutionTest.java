package solution.encryptiondecryptionofenigmamachine;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static solution.encryptiondecryptionofenigmamachine.Solution.charShiftingLeft;
import static solution.encryptiondecryptionofenigmamachine.Solution.charShiftingRight;

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

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of(
                Arguments.of(SolutionTestCase.INPUT_1, SolutionTestCase.EXPECTED_1),
                Arguments.of(SolutionTestCase.INPUT_2, SolutionTestCase.EXPECTED_2),
                Arguments.of(SolutionTestCase.INPUT_3, SolutionTestCase.EXPECTED_3),
                Arguments.of(SolutionTestCase.INPUT_4, SolutionTestCase.EXPECTED_4),
                Arguments.of(SolutionTestCase.INPUT_5, SolutionTestCase.EXPECTED_5),
                Arguments.of(SolutionTestCase.INPUT_6, SolutionTestCase.EXPECTED_6)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCharShiftingLeftTest")
    public void charShiftingLeftTest(int input, int expected) {
        assertEquals(expected, charShiftingLeft('A', input));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCharShiftingRightTest")
    public void charShiftingRightTest(int input, int expected) {
        assertEquals(expected, charShiftingRight('A', input));
    }

    public Stream<Arguments> provideParamsForCharShiftingLeftTest() {
        char c = 'A';
        List<Arguments> args = new ArrayList<>();
        for (int j = 0; j >= -100; j--) {
            args.add(Arguments.of(Math.abs(j), c));
            c = c - 1 >= 'A' ? (char) (c - 1) : 'Z';
        }
        return args.stream();
    }

    public Stream<Arguments> provideParamsForCharShiftingRightTest() {
        char c = 'A';
        List<Arguments> args = new ArrayList<>();
        for (int j = 0; j <= 100; j++) {
            args.add(Arguments.of(j, c));
            c = c + 1 <= 'Z' ? (char) (c + 1) : 'A';
        }
        return args.stream();
    }
}