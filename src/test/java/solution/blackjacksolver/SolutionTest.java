package solution.blackjacksolver;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static solution.blackjacksolver.Solution.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class SolutionTest {


    @ParameterizedTest
    @MethodSource("provideParamsForMainTest")
    void mainTest(String input, String expected) {
        // GIVEN
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        System.setIn(new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8)));
        // WHEN
        main(null);
        // THEN
        assertEquals(expected, outContent.toString().replace("\r", ""));
    }

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of(
                Arguments.of(SolutionTestCase.INPUT_1, SolutionTestCase.EXPECTED_1),
                Arguments.of(SolutionTestCase.INPUT_2, SolutionTestCase.EXPECTED_2),
                Arguments.of(SolutionTestCase.INPUT_3, SolutionTestCase.EXPECTED_3),
                Arguments.of(SolutionTestCase.INPUT_4, SolutionTestCase.EXPECTED_4),
                Arguments.of(SolutionTestCase.INPUT_5, SolutionTestCase.EXPECTED_5),
                Arguments.of(SolutionTestCase.INPUT_6, SolutionTestCase.EXPECTED_6),
                Arguments.of(SolutionTestCase.INPUT_7, SolutionTestCase.EXPECTED_7),
                Arguments.of(SolutionTestCase.INPUT_8, SolutionTestCase.EXPECTED_8),
                Arguments.of(SolutionTestCase.INPUT_9, SolutionTestCase.EXPECTED_9),
                Arguments.of(SolutionTestCase.INPUT_10, SolutionTestCase.EXPECTED_10)
        );
    }

    @Test
    void when_card_does_not_exist_then_should_throw_IllegalArgumentException() {
        // GIVEN
        var cards = "A Z";
        // WHEN
        var exception = assertThrows(IllegalArgumentException.class, () -> {
            new Card(cards, TypePlayer.BANK);
        });
        // THEN
        var expected = "Unable to map card Z";
        assertEquals(expected, exception.getMessage());
    }

    @Test
    void when_getWinner_with_two_banks_then_should_throw_IllegalArgumentException() {
        // GIVEN
        var bank1 = new Card("A", TypePlayer.BANK);
        var bank2 = new Card("A", TypePlayer.BANK);

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
        var player1 = new Card("A", TypePlayer.PLAYER);
        var player2 = new Card("A", TypePlayer.PLAYER);

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
        var bank1 = new Card("A", TypePlayer.BANK);
        var bank2 = new Card("A", TypePlayer.BANK);

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
        var player1 = new Card("A", TypePlayer.PLAYER);
        var player2 = new Card("A", TypePlayer.PLAYER);

        // WHEN
        var exception = assertThrows(IllegalArgumentException.class, () -> {
            player1.isDraw(player2);
        });
        // THEN
        var expected = "this method can find a winner only between bank and player";
        assertEquals(expected, exception.getMessage());
    }
}