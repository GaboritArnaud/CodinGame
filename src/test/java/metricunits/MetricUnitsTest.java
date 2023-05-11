package metricunits;

import common.CodinGameTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class MetricUnitsTest extends CodinGameTest {

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of(
                Arguments.of(MetricUnitsTestCase.INPUT1, MetricUnitsTestCase.EXPECTED1),
                Arguments.of(MetricUnitsTestCase.INPUT2, MetricUnitsTestCase.EXPECTED2),
                Arguments.of(MetricUnitsTestCase.INPUT3, MetricUnitsTestCase.EXPECTED3),
                Arguments.of(MetricUnitsTestCase.INPUT4, MetricUnitsTestCase.EXPECTED4),
                Arguments.of(MetricUnitsTestCase.INPUT5, MetricUnitsTestCase.EXPECTED5),
                Arguments.of(MetricUnitsTestCase.INPUT6, MetricUnitsTestCase.EXPECTED6),
                Arguments.of(MetricUnitsTestCase.INPUT7, MetricUnitsTestCase.EXPECTED7),
                Arguments.of(MetricUnitsTestCase.INPUT8, MetricUnitsTestCase.EXPECTED8),
                Arguments.of(MetricUnitsTestCase.INPUT9, MetricUnitsTestCase.EXPECTED9),
                Arguments.of(MetricUnitsTestCase.INPUT10, MetricUnitsTestCase.EXPECTED10),
                Arguments.of(MetricUnitsTestCase.INPUT11, MetricUnitsTestCase.EXPECTED11),
                Arguments.of(MetricUnitsTestCase.INPUT12, MetricUnitsTestCase.EXPECTED12)
        );
    }
}
