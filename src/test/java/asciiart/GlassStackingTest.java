package asciiart;

import common.CodinGameTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class GlassStackingTest extends CodinGameTest {

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of(
                Arguments.of(GlassStackingTestCase.INPUT1, GlassStackingTestCase.EXPECTED1),
                Arguments.of(GlassStackingTestCase.INPUT2, GlassStackingTestCase.EXPECTED2),
                Arguments.of(GlassStackingTestCase.INPUT3, GlassStackingTestCase.EXPECTED3),
                Arguments.of(GlassStackingTestCase.INPUT4, GlassStackingTestCase.EXPECTED4)
        );
    }
}
