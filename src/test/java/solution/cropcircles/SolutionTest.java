package solution.cropcircles;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

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
    void when_cropCircle_circle_getNewValue_withoutType_then_should_throw_illegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Solution.Circle("TESTag11"));
        var expected = String.format("Impossible de convertir %s en cercle", "TESTag11");
        assertEquals(expected, exception.getMessage());
    }

    @Test
    void when_cropCircle_circle_getNewValue_withoutType_then_should_throw_illegalStateException() {
        var circle = new Solution.Circle(null, 0, null);
        var exception = "";
        try {
            circle.getNewValue(Mockito.any());
        } catch (Exception e) {
            exception = e.getMessage();
        }
        var expected = String.format("Le type de cercle %s est inconnu", (Object) null);
        assertEquals(expected, exception);
    }

    @Test
    void when_cropCircle_circle_getX_then_should_return_x() {
        int excpectedX = 1;
        Solution.Point point = new Solution.Point(excpectedX, Mockito.anyInt());
        assertEquals(excpectedX, point.x());
    }

    @Test
    void when_cropCircle_circle_getY_then_should_return_y() {
        int excpectedY = 1;
        Solution.Point point = new Solution.Point(Mockito.anyInt(), excpectedY);
        assertEquals(excpectedY, point.y());
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
                Arguments.of(SolutionTestCase.INPUT_12, SolutionTestCase.EXPECTED_12)
        );
    }
}