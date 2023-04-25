package common;

import asciiart.*;
import chainedecaractere.EnigmaMachine;
import chainedecaractere.EnigmaMachineTest;
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
        switch (this) {
            case CardCastleTest ignored -> CardCastle.main(null);
            case CropCircleTest ignored -> CropCircle.main(null);
            case GlassStackingTest ignored -> GlassStacking.main(null);
            case MayTheTriforceBeWithYouTest ignored -> MayTheTriforceBeWithYou.main(null);
            case MountainMapTest ignored -> MountainMap.main(null);
            case RetroTypewriterArtTest ignored -> RetroTypewriterArt.main(null);
            case SevenSegmentScannerTest ignored -> SevenSegmentScanner.main(null);
            case UlamSpiralTest ignored -> UlamSpiral.main(null);
            case TableOfContentTest ignored -> TableOfContent.main(null);
            case IsThatAPossibleWordTest ignored -> IsThatAPossibleWord.main(null);
            case EnigmaMachineTest ignored -> EnigmaMachine.main(null);
            default -> throw new IllegalStateException(String.format("Unable to execute tests for %s", this.getClass()));
        }
    }

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of();
    }
}
