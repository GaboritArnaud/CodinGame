package math;

import common.CodinGameTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

import java.io.ByteArrayInputStream;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class GreatestCommonDivisorTest extends CodinGameTest {

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of(
                Arguments.of(GreatestCommonDivisorTestCase.INPUT1, GreatestCommonDivisorTestCase.EXPECTED1),
                Arguments.of(GreatestCommonDivisorTestCase.INPUT2, GreatestCommonDivisorTestCase.EXPECTED2),
                Arguments.of(GreatestCommonDivisorTestCase.INPUT3, GreatestCommonDivisorTestCase.EXPECTED3),
                Arguments.of(GreatestCommonDivisorTestCase.INPUT4, GreatestCommonDivisorTestCase.EXPECTED4)
        );
    }

    @Test
    void when_invalid_input_then_throw_IllegalArgumentException() {
        // GIVEN
        System.setIn(new ByteArrayInputStream("-1 0".getBytes(StandardCharsets.UTF_8)));
        // WHEN // THEN
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            GreatestCommonDivisor.main(null);
        });
        var expected = """
                a(-1) must be > 0
                b(0) must be > 0
                a(-1) must be > b(0)""";
        assertEquals(expected, exception.getMessage());
    }
}
