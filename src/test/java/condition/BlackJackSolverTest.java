package condition;

import common.CodinGameTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

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

    @Test
    void when_card_does_not_exist_then_should_throw_IllegalArgumentException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            new BlackJackSolver.Card("A Z", BlackJackSolver.TypePlayer.BANK);
        });
        var expected = "Unable to map card Z";
        assertEquals(expected, exception.getMessage());
    }

    @Test
    void when_getWinner_with_two_banks_then_should_throw_IllegalArgumentException() {
        // GIVEN
        var bank1 = new BlackJackSolver.Card("A", BlackJackSolver.TypePlayer.BANK);
        var bank2 = new BlackJackSolver.Card("A", BlackJackSolver.TypePlayer.BANK);

        // WHEN
        var exception = assertThrows(IllegalArgumentException.class, () -> {
            bank1.getWinner(bank2);
        });
        // THEN
        var expected = "this method can find a winner only between bank and player";
        assertEquals(expected, exception.getMessage());
    }

    @Test
    void when_getWinner_with_two_players_then_should_throw_IllegalArgumentException() {
        // GIVEN
        var player1 = new BlackJackSolver.Card("A", BlackJackSolver.TypePlayer.PLAYER);
        var player2 = new BlackJackSolver.Card("A", BlackJackSolver.TypePlayer.PLAYER);

        // WHEN
        var exception = assertThrows(IllegalArgumentException.class, () -> {
            player1.getWinner(player2);
        });
        // THEN
        var expected = "this method can find a winner only between bank and player";
        assertEquals(expected, exception.getMessage());
    }

    @Test
    void when_isDraw_with_two_banks_then_should_throw_IllegalArgumentException() {
        // GIVEN
        var bank1 = new BlackJackSolver.Card("A", BlackJackSolver.TypePlayer.BANK);
        var bank2 = new BlackJackSolver.Card("A", BlackJackSolver.TypePlayer.BANK);

        // WHEN
        var exception = assertThrows(IllegalArgumentException.class, () -> {
            bank1.isDraw(bank2);
        });
        // THEN
        var expected = "this method can find a winner only between bank and player";
        assertEquals(expected, exception.getMessage());
    }

    @Test
    void when_isDraw_with_two_players_then_should_throw_IllegalArgumentException() {
        // GIVEN
        var player1 = new BlackJackSolver.Card("A", BlackJackSolver.TypePlayer.PLAYER);
        var player2 = new BlackJackSolver.Card("A", BlackJackSolver.TypePlayer.PLAYER);

        // WHEN
        var exception = assertThrows(IllegalArgumentException.class, () -> {
            player1.isDraw(player2);
        });
        // THEN
        var expected = "this method can find a winner only between bank and player";
        assertEquals(expected, exception.getMessage());
    }
}
