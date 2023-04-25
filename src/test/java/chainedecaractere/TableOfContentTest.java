package chainedecaractere;

import common.CodinGameTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class TableOfContentTest extends CodinGameTest {

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of(
                Arguments.of(TableOfContentTestCase.INPUT1, TableOfContentTestCase.EXPECTED1),
                Arguments.of(TableOfContentTestCase.INPUT2, TableOfContentTestCase.EXPECTED2),
                Arguments.of(TableOfContentTestCase.INPUT3, TableOfContentTestCase.EXPECTED3),
                Arguments.of(TableOfContentTestCase.INPUT4, TableOfContentTestCase.EXPECTED4)
        );
    }
}
