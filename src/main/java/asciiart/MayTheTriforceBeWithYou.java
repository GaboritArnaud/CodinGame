package asciiart;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MayTheTriforceBeWithYou {

    private static final String WHITE_SPACE = " ";
    private static final String STAR = "*";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();

        IntStream.rangeClosed(1, size)
                .mapToObj(line -> mapLineForFirst(size, line))
                .forEach(System.out::println);
        IntStream.rangeClosed(1, size)
                .mapToObj(line -> mapLineForSecond(size, line))
                .forEach(System.out::println);
    }

    private static String mapLineForFirst(int size, int line) {
        String firstLine;
        if(line == 1) {
            firstLine = "." + WHITE_SPACE.repeat(size-1);
        } else {
            firstLine = WHITE_SPACE.repeat(size);
        }
        return firstLine +
                WHITE_SPACE.repeat(size - line) +
                STAR.repeat((2 * line) - 1);
    }

    private static String mapLineForSecond(int size, int line) {
        return WHITE_SPACE.repeat(size - line) +
                STAR.repeat((2 * line) - 1) +
                WHITE_SPACE.repeat((2*(size-line))+1) +
                STAR.repeat((2 * line) - 1);
    }
}
