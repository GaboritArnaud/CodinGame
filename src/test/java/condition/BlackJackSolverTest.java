package condition;

import common.CodinGameTest;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BlackJackSolverTest extends CodinGameTest {

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of(
                Arguments.of(BlackJackSolverTestCase.INPUT1, BlackJackSolverTestCase.EXPECTED1),
                Arguments.of(BlackJackSolverTestCase.INPUT2, BlackJackSolverTestCase.EXPECTED2),
                Arguments.of(BlackJackSolverTestCase.INPUT3, BlackJackSolverTestCase.EXPECTED3),
                Arguments.of(BlackJackSolverTestCase.INPUT4, BlackJackSolverTestCase.EXPECTED4),
                Arguments.of(BlackJackSolverTestCase.INPUT5, BlackJackSolverTestCase.EXPECTED5),
                Arguments.of(BlackJackSolverTestCase.INPUT6, BlackJackSolverTestCase.EXPECTED6),
                Arguments.of(BlackJackSolverTestCase.INPUT7, BlackJackSolverTestCase.EXPECTED7),
                Arguments.of(BlackJackSolverTestCase.INPUT8, BlackJackSolverTestCase.EXPECTED8),
                Arguments.of(BlackJackSolverTestCase.INPUT9, BlackJackSolverTestCase.EXPECTED9),
                Arguments.of(BlackJackSolverTestCase.INPUT10, BlackJackSolverTestCase.EXPECTED10)
        );
    }
}
