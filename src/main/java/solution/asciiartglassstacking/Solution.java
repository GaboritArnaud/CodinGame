package solution.asciiartglassstacking;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

// id=150
public class Solution {

    private static final List<String> glass = Arrays.asList(
            " *** ",
            " * * ",
            " * * ",
            "*****");

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int N = in.nextInt();
        int  size = (int) Math.floor(Math.sqrt(0.25 + 2*N) - 0.5);
        final int L = 5*size + size-1;

        IntStream.rangeClosed(1, size).forEach(floor ->
                IntStream.range(0, glass.size()).forEach(line -> {
                    int l = (L - (5 * floor + floor - 1)) / 2;
                    String res = " ".repeat(l) +
                            IntStream.rangeClosed(1, floor)
                                    .mapToObj(n -> glass.get(line))
                                    .collect(Collectors.joining(" ")) +
                            " ".repeat(l);
                    System.out.println(res);
                })
        );
    }
}