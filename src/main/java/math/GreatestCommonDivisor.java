package math;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GreatestCommonDivisor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        checkInput(a, b);
        List<String> result = new ArrayList<>();

        int modulo;
        int currentA = a;
        int currentB = b;

        do {
            modulo = currentA % currentB;
            result.add(currentA + "=" + currentB + "*" + currentA / currentB + "+" + modulo);
            currentA = currentB;
            currentB = modulo;
        } while (modulo > 0);

        result.add("GCD(" + a + "," + b + ")=" + currentA);
        result.forEach(System.out::println);
    }

    private static void checkInput(int a, int b) {
        List<String> errors = new ArrayList<>();
        if (a <= 0) {
            errors.add(String.format("a(%s) must be > 0", a));
        }
        if (b <= 0) {
            errors.add(String.format("b(%s) must be > 0", b));
        }
        if (a <= b) {
            errors.add(String.format("a(%s) must be > b(%s)", a, b));
        }
        if (!errors.isEmpty()) {
            throw new IllegalArgumentException(String.join("\n", errors));
        }
    }
}
