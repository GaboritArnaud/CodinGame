package solution.nextcarlicenseplate;

import java.util.Scanner;

// id=234
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String immat = in.nextLine();
        var shift = in.nextInt();

        var result = new Immat(immat)
                .nextImmat(shift)
                .format();

        System.out.println(result);
    }

    public static class Immat {

        private static final String IMMAT_FORMAT = "%s-%03d-%s";
        private static final String IMMAT_REGEX = "[A-Z]{2}-\\d{3}-[A-Z]{2}";
        private static final String IMMAT_SEPARATOR = "-";

        private String firstLetters;
        private Integer numbers;
        private String lastLetters;

        public Immat(String immat) {
            if (!immat.matches(IMMAT_REGEX)) {
                throw new IllegalArgumentException(String.format("L'immatriculation %s est invalide, exemple d'immatriculation valide : AB-123-CD", immat));
            }
            String[] splitedImmat = immat.split(IMMAT_SEPARATOR);
            this.firstLetters = splitedImmat[0];
            this.numbers = Integer.parseInt(splitedImmat[1]);
            this.lastLetters = splitedImmat[2];
        }

        public Immat nextImmat(int shift) {
            var shiftLetter = this.numbers + shift == 999
                    ? 0
                    : (this.numbers + shift) / 999;

            this.numbers = numbers + shift > 999
                    ? (numbers + shift) % 999
                    : numbers + shift;

            var letters = new StringBuilder()
                    .append(firstLetters)
                    .append(lastLetters)
                    .reverse()
                    .toString();


            StringBuilder shiftedStr = new StringBuilder();

            for (char c : letters.toCharArray()) {
                if (Character.isLetter(c)) {
                    char base = 'A';
                    int numLetters = 26;

                    int shiftedValue = (c - base + shiftLetter) > numLetters
                            ? (c - base + shiftLetter) % numLetters
                            : (c - base + shiftLetter);

                    char shiftedChar = (char) (base + shiftedValue);

                    shiftedStr.append(shiftedChar);

                    shiftLetter = (c - base + shiftLetter) / (numLetters);
                }
            }

            shiftedStr.reverse();

            this.firstLetters = shiftedStr.substring(0, 2);
            this.lastLetters = shiftedStr.substring(2);
            return this;
        }

        public String format() {
            return String.format(IMMAT_FORMAT, this.firstLetters, this.numbers, this.lastLetters);
        }
    }
}