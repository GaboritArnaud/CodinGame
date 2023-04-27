package condition;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class BlackJackSolver {

    private static final String BANK = "Bank";
    private static final String PLAYER = "Player";
    private static final String DRAW = "Draw";
    private static final String BLACK_JACK = "Blackjack!";

    public static void main(String[] args) {
        var in = new Scanner(System.in);
        var bank = new Card(in.nextLine(), TypePlayer.BANK);
        var player = new Card(in.nextLine(), TypePlayer.PLAYER);

        System.out.println(bank.getWinner(player));
    }

    private static int getValueByCard(String card) {
        return switch (card) {
            case "2" -> 2;
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            case "6" -> 6;
            case "7" -> 7;
            case "8" -> 8;
            case "9" -> 9;
            case "10", "J", "Q", "K" -> 10;
            case "A" -> 11;
            default -> throw new IllegalArgumentException(String.format("Unable to map card %s", card));
        };
    }

    private enum TypePlayer {BANK, PLAYER}

    private static class Card {

        private final int value;
        private final int countOfcard;
        private final TypePlayer typePlayer;

        public Card(String cards, TypePlayer typePlayer) {
            var cardsList = List.of(cards.split(" "));
            this.value = computeScore(cardsList);
            this.countOfcard = cardsList.size();
            this.typePlayer = typePlayer;
        }

        public int getValue() {
            return this.value;
        }

        public boolean isBlackjack() {
            return this.value == 21 && this.countOfcard == 2;
        }

        public boolean isDraw(Card card) {
            if (Stream.of(this.typePlayer, card.typePlayer).filter(TypePlayer.BANK::equals).count() != 1) {
                throw new IllegalArgumentException("this method can find a winner only between bank and player");
            }
            var player = this.isBank() ? card : this;
            var bank = this.isBank() ? this : card;

            return player.getValue() <= 21 &&
                    ((bank.isBlackjack() && player.isBlackjack()) ||
                            (!bank.isBlackjack() && !player.isBlackjack() && bank.getValue() == player.getValue()));
        }

        public String getWinner(Card card) {
            if (Stream.of(this.typePlayer, card.typePlayer).filter(TypePlayer.BANK::equals).count() != 1) {
                throw new IllegalArgumentException("this method can find a winner only between bank and player");
            }
            if (this.isDraw(card)) {
                return DRAW;
            }
            if (isBank() && (
                    card.getValue() > 21 || (this.getValue() <= 21 && card.getValue() < this.getValue()))) {
                return BANK;
            }
            if (this.isBank() && !this.isBlackjack() && card.isBlackjack()) {
                return BLACK_JACK;
            }
            return PLAYER;
        }

        public boolean isBank() {
            return TypePlayer.BANK.equals(this.typePlayer);
        }

        private int computeScore(List<String> cards) {
            var cardsValue = cards.stream().mapToInt(BlackJackSolver::getValueByCard).sum();
            var countOfAs = cards.stream().filter("A"::equals).count();
            while (cardsValue > 21 && countOfAs > 0) {
                cardsValue -= 10;
                countOfAs--;
            }
            return cardsValue;
        }

    }
}
