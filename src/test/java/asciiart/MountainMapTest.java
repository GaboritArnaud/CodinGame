package asciiart;

import common.CodinGameTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class MountainMapTest extends CodinGameTest {

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of(
                Arguments.of(MountainMapTestCase.INPUT1, MountainMapTestCase.EXPECTED1),
                Arguments.of(MountainMapTestCase.INPUT2, MountainMapTestCase.EXPECTED2),
                Arguments.of(MountainMapTestCase.INPUT3, MountainMapTestCase.EXPECTED3),
                Arguments.of(MountainMapTestCase.INPUT4, MountainMapTestCase.EXPECTED4)
        );
    }
}
