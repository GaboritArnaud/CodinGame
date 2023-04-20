package asciiart;

import common.CodinGameTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class MayTheTriforceBeWithYouTest extends CodinGameTest {

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of(
                Arguments.of(MayTheTriforceBeWithYouTestCase.INPUT1, MayTheTriforceBeWithYouTestCase.EXPECTED1),
                Arguments.of(MayTheTriforceBeWithYouTestCase.INPUT2, MayTheTriforceBeWithYouTestCase.EXPECTED2),
                Arguments.of(MayTheTriforceBeWithYouTestCase.INPUT3, MayTheTriforceBeWithYouTestCase.EXPECTED3),
                Arguments.of(MayTheTriforceBeWithYouTestCase.INPUT4, MayTheTriforceBeWithYouTestCase.EXPECTED4)
        );
    }
}
