package solution.segmentscanner;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// id=644
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line1 = in.nextLine();
        String line2 = in.nextLine();
        String line3 = in.nextLine();

        String number = IntStream.iterate(0, i -> i + 3)
                .limit(line1.length() / 3)
                .mapToObj(i -> Arrays.stream(DigitNumber.values())
                        .filter(digitNumber -> digitNumber.digitalValue.equals(line1.substring(i, i+3) + line2.substring(i, i+3) + line3.substring(i, i+3)))
                        .findFirst()
                        .orElseThrow(RuntimeException::new).numericValue)
                .collect(Collectors.joining());

        System.out.println(number);
    }

    private enum DigitNumber {
        ZERO("0", " _ | ||_|"),
        UN("1", "     |  |"),
        DEUX("2", " _  _||_ "),
        TROIS("3", " _  _| _|"),
        QUATRE("4", "   |_|  |"),
        CINQ("5", " _ |_  _|"),
        SIX("6", " _ |_ |_|"),
        SEPT("7", " _   |  |"),
        HUIT("8", " _ |_||_|"),
        NEUF("9", " _ |_| _|");

        public final String numericValue;
        public final String digitalValue;

        DigitNumber(String numericValue, String digitalValue) {
            this.numericValue = numericValue;
            this.digitalValue = digitalValue;
        }
    }
}