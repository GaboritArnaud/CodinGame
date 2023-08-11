package solution.cardscastle;

import java.util.*;
import java.util.stream.IntStream;

// id=245
public class Solution {

    private static final String STABLE = "STABLE";
    private static final String UNSTABLE = "UNSTABLE";
    private static final List<String> UNSTABLE_PATTERN = Arrays.asList("/.", ".\\", "//\\", "/\\\\");

    private static Map<Integer, String> castle;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        in.nextLine();

        castle = new HashMap<>();
        for (int i = 0; i < h; i++) {
            castle.put(i, in.nextLine());
        }

        boolean isUnstable = castle.entrySet().stream().anyMatch((line ->
                UNSTABLE_PATTERN.stream().anyMatch(pattern -> line.getValue().contains(pattern))
                        || isFlyingCard(line.getKey(), line.getValue()))
        );

        System.out.println(isUnstable ? UNSTABLE : STABLE);
    }

    private static boolean isFlyingCard(Integer line, String value) {
        return IntStream.range(0, value.length()-1).anyMatch(i ->
                (value.charAt(i) == '/' || value.charAt(i) == '\\')
                        && Optional.ofNullable(castle.get(line + 1))
                        .map(v -> v.charAt(i) == '.' || v.charAt(i) == value.charAt(i))
                        .orElse(false));
    }
}