package asciiart;

import common.CodinGameTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class RetroTypewriterArtTest extends CodinGameTest {

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of(
                Arguments.of(RetroTypewriterArtTestCase.INPUT1, RetroTypewriterArtTestCase.EXPECTED1),
                Arguments.of(RetroTypewriterArtTestCase.INPUT2, RetroTypewriterArtTestCase.EXPECTED2),
                Arguments.of(RetroTypewriterArtTestCase.INPUT3, RetroTypewriterArtTestCase.EXPECTED3),
                Arguments.of(RetroTypewriterArtTestCase.INPUT4, RetroTypewriterArtTestCase.EXPECTED4),
                Arguments.of(RetroTypewriterArtTestCase.INPUT5, RetroTypewriterArtTestCase.EXPECTED5),
                Arguments.of(RetroTypewriterArtTestCase.INPUT6, RetroTypewriterArtTestCase.EXPECTED6),
                Arguments.of(RetroTypewriterArtTestCase.INPUT7, RetroTypewriterArtTestCase.EXPECTED7),
                Arguments.of(RetroTypewriterArtTestCase.INPUT8, RetroTypewriterArtTestCase.EXPECTED8),
                Arguments.of(RetroTypewriterArtTestCase.INPUT9, RetroTypewriterArtTestCase.EXPECTED9),
                Arguments.of(RetroTypewriterArtTestCase.INPUT10, RetroTypewriterArtTestCase.EXPECTED10)
        );
    }
}
