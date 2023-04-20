package chainedecaractere;

import common.CodinGameTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class TableOfContentTest extends CodinGameTest {

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of(
                Arguments.of(IsThatAPossibleWordTestCase.INPUT1, IsThatAPossibleWordTestCase.EXPECTED1),
                Arguments.of(IsThatAPossibleWordTestCase.INPUT2, IsThatAPossibleWordTestCase.EXPECTED2),
                Arguments.of(IsThatAPossibleWordTestCase.INPUT3, IsThatAPossibleWordTestCase.EXPECTED3),
                Arguments.of(IsThatAPossibleWordTestCase.INPUT4, IsThatAPossibleWordTestCase.EXPECTED4)
        );
    }
}
