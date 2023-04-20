package asciiart;

import common.CodinGameTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class UlamSpiralTest extends CodinGameTest {

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of(
                Arguments.of(UlamSpiralTestCase.INPUT1, UlamSpiralTestCase.EXPECTED1),
                Arguments.of(UlamSpiralTestCase.INPUT2, UlamSpiralTestCase.EXPECTED2),
                Arguments.of(UlamSpiralTestCase.INPUT3, UlamSpiralTestCase.EXPECTED3),
                Arguments.of(UlamSpiralTestCase.INPUT4, UlamSpiralTestCase.EXPECTED4)
        );
    }
}
