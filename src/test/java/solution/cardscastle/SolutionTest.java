package solution.cardscastle;

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
        assertEquals(expected, outContent.toString().replace("\r", ""));
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
                Arguments.of(SolutionTestCase.INPUT_8, SolutionTestCase.EXPECTED_8),
                Arguments.of(SolutionTestCase.INPUT_9, SolutionTestCase.EXPECTED_9),
                Arguments.of(SolutionTestCase.INPUT_10, SolutionTestCase.EXPECTED_10),
                Arguments.of(SolutionTestCase.INPUT_11, SolutionTestCase.EXPECTED_11),
                Arguments.of(SolutionTestCase.INPUT_12, SolutionTestCase.EXPECTED_12),
                Arguments.of(SolutionTestCase.INPUT_13, SolutionTestCase.EXPECTED_13),
                Arguments.of(SolutionTestCase.INPUT_14, SolutionTestCase.EXPECTED_14),
                Arguments.of(SolutionTestCase.INPUT_15, SolutionTestCase.EXPECTED_15),
                Arguments.of(SolutionTestCase.INPUT_16, SolutionTestCase.EXPECTED_16),
                Arguments.of(SolutionTestCase.INPUT_17, SolutionTestCase.EXPECTED_17),
                Arguments.of(SolutionTestCase.INPUT_18, SolutionTestCase.EXPECTED_18),
                Arguments.of(SolutionTestCase.INPUT_19, SolutionTestCase.EXPECTED_19),
                Arguments.of(SolutionTestCase.INPUT_20, SolutionTestCase.EXPECTED_20),
                Arguments.of(SolutionTestCase.INPUT_21, SolutionTestCase.EXPECTED_21)
        );
    }
}