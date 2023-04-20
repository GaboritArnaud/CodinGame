package asciiart;

import common.CodinGameTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class CardCastleTest extends CodinGameTest {

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of(
                Arguments.of(CardCastleTestCase.INPUT1, CardCastleTestCase.EXPECTED1),
                Arguments.of(CardCastleTestCase.INPUT2, CardCastleTestCase.EXPECTED2),
                Arguments.of(CardCastleTestCase.INPUT3, CardCastleTestCase.EXPECTED3),
                Arguments.of(CardCastleTestCase.INPUT4, CardCastleTestCase.EXPECTED4),
                Arguments.of(CardCastleTestCase.INPUT5, CardCastleTestCase.EXPECTED5),
                Arguments.of(CardCastleTestCase.INPUT6, CardCastleTestCase.EXPECTED6),
                Arguments.of(CardCastleTestCase.INPUT7, CardCastleTestCase.EXPECTED7),
                Arguments.of(CardCastleTestCase.INPUT8, CardCastleTestCase.EXPECTED8),
                Arguments.of(CardCastleTestCase.INPUT9, CardCastleTestCase.EXPECTED9),
                Arguments.of(CardCastleTestCase.INPUT10, CardCastleTestCase.EXPECTED10),
                Arguments.of(CardCastleTestCase.INPUT11, CardCastleTestCase.EXPECTED11),
                Arguments.of(CardCastleTestCase.INPUT12, CardCastleTestCase.EXPECTED12),
                Arguments.of(CardCastleTestCase.INPUT13, CardCastleTestCase.EXPECTED13),
                Arguments.of(CardCastleTestCase.INPUT14, CardCastleTestCase.EXPECTED14),
                Arguments.of(CardCastleTestCase.INPUT15, CardCastleTestCase.EXPECTED15),
                Arguments.of(CardCastleTestCase.INPUT16, CardCastleTestCase.EXPECTED16),
                Arguments.of(CardCastleTestCase.INPUT17, CardCastleTestCase.EXPECTED17),
                Arguments.of(CardCastleTestCase.INPUT18, CardCastleTestCase.EXPECTED18),
                Arguments.of(CardCastleTestCase.INPUT19, CardCastleTestCase.EXPECTED19),
                Arguments.of(CardCastleTestCase.INPUT20, CardCastleTestCase.EXPECTED20),
                Arguments.of(CardCastleTestCase.INPUT21, CardCastleTestCase.EXPECTED21)
        );
    }
}
