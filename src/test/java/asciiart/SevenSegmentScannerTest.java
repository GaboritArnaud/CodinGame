package asciiart;

import common.CodinGameTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class SevenSegmentScannerTest extends CodinGameTest {

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of(
                Arguments.of(SevenSegmentScannerTestCase.INPUT1, SevenSegmentScannerTestCase.EXPECTED1)

        );
    }
}
