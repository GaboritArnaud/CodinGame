package solution.ulamspiral;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

// id=3046
public class Solution {

    private static int x;
    private static int y;
    private static Direction d;
    private static String[][] res;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        final int N = in.nextInt();

        res = new String[N][N];

        int currentValue = N * N;
        x = N - 1;
        y = N - 1;
        d = Direction.LEFT;

        do {
            res[x][y] = isPrime(currentValue) ? "#" : " ";
            if (currentValue > 1) {
                nextCase(N);
            }
            currentValue--;
        } while ((currentValue != 0));

        for (int i = 0; i < N; i++) {
            System.out.println(
                    Arrays.stream(res[i], 0, N).collect(Collectors.joining(" "))

            );
        }
    }

    private static void nextCase(int max) {
        switch (d) {
            case DOWN -> nextCaseDown(max);
            case LEFT -> nextCaseLEFT(max);
            case RIGHT -> nextCaseRIGHT(max);
            case UP -> nextCaseUP(max);
        }
    }

    private static void nextCaseDown(int max) {
        if (x + 1 == max || res[x + 1][y] != null) {
            d = newDirection(d);
            nextCase(max);
        } else {
            x++;
        }
    }

    private static void nextCaseLEFT(int max) {
        if (y - 1 < 0 || res[x][y - 1] != null) {
            d = newDirection(d);
            nextCase(max);
        } else {
            y--;
        }
    }

    private static void nextCaseRIGHT(int max) {
        if (y + 1 == max || res[x][y + 1] != null) {
            d = newDirection(d);
            nextCase(max);
        } else {
            y++;
        }
    }
    private static void nextCaseUP(int max) {
        if (x - 1 < 0 || res[x - 1][y] != null) {
            d = newDirection(d);
            nextCase(max);
        } else {
            x--;
        }
    }

    private static Direction newDirection(Direction d) {
        return Arrays.stream(Direction.values())
                .filter(dir -> Objects.equals(dir.name(), d.next))
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }

    private enum Direction {
        RIGHT("DOWN"),
        UP("RIGHT"),
        LEFT("UP"),
        DOWN("LEFT");

        public final String next;

        Direction(String next) {
            this.next = next;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}