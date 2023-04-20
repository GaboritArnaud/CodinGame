package common;

import asciiart.*;
import chainedecaractere.TableOfContent;
import chainedecaractere.TableOfContentTest;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import statemachine.IsThatAPossibleWord;
import statemachine.IsThatAPossibleWordTest;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public abstract class CodinGameTest {

    @ParameterizedTest
    @MethodSource("provideParamsForMainTest")
    void mainTest(String input, String expected) {
        // GIVEN
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
        // WHEN
        executeMain();
        // THEN
        assertEquals(expected, outContent.toString().replace("\r", ""));
    }


    private void executeMain() {
        if (this instanceof CardCastleTest) {
            CardCastle.main(null);
        } else if (this instanceof CropCircleTest) {
            CropCircle.main(null);
        } else if (this instanceof GlassStackingTest) {
            GlassStacking.main(null);
        } else if (this instanceof MayTheTriforceBeWithYouTest) {
            MayTheTriforceBeWithYou.main(null);
        } else if (this instanceof MountainMapTest) {
            MountainMap.main(null);
        } else if (this instanceof RetroTypewriterArtTest) {
            RetroTypewriterArt.main(null);
        } else if (this instanceof SevenSegmentScannerTest) {
            SevenSegmentScanner.main(null);
        } else if (this instanceof UlamSpiralTest) {
            UlamSpiral.main(null);
        } else if (this instanceof TableOfContentTest) {
            TableOfContent.main(null);
        } else if (this instanceof IsThatAPossibleWordTest) {
            IsThatAPossibleWord.main(null);
        } else {
            throw new RuntimeException(String.format("Unable to execute tests for %s", this.getClass()));
        }
    }

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of();
    }
}
