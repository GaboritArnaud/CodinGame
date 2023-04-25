package metricinits;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MetricUnits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var expressions = Arrays.stream(in.nextLine().replace(" ", "").split("\\+"))
                .map(Value::new)
                .sorted(Comparator.comparing(v -> v.unite.puissance))
                .toList();

        var unite = expressions.get(0).unite.label;
        var pow = expressions.get(1).unite.puissance - expressions.get(0).unite.puissance;

        expressions.get(1).pow(pow);

        var result = expressions.get(0).val + expressions.get(1).val;

        System.out.println(format(result) + unite);
    }

    private static String format(float result) {
        var res = String.valueOf(result);
        var values = res.split("\\.");
        if (values.length == 2 && values[1].chars().allMatch(c -> c == '0')) {
            return values[0];
        }
        return res;

    }

    private enum Unite {

        UM("um", 0),
        MM("mm", 3),
        CM("cm", 4),
        DM("dm", 5),
        M("m", 6),
        KM("km", 9);

        public final String label;
        public final int puissance;

        Unite(String label, int puissance) {
            this.label = label;
            this.puissance = puissance;
        }
    }

    private static class Value {

        private final Unite unite;
        private float val;

        public Value(String val) {
            var unitValue = val.substring(val.length() - 2).chars()
                    .filter(this::isLetter)
                    .mapToObj(c -> Character.toString((char) c))
                    .collect(Collectors.joining());

            this.unite = Arrays.stream(Unite.values())
                    .filter(u -> u.label.equals(unitValue))
                    .findFirst()
                    .orElseThrow(IllegalArgumentException::new);

            this.val = Float.parseFloat(
                    val.substring(0, val.length() - 1).chars()
                            .filter(this::isNumber)
                            .mapToObj(c -> Character.toString((char) c)).collect(Collectors.joining())
            );
        }

        private boolean isNumber(int c) {
            return (c >= '0' && c <= '9') || c == '.';
        }

        private boolean isLetter(int c) {
            return c >= 'A' && c <= 'z';
        }

        public void pow(int pow) {
            this.val = (float) (this.val * Math.pow(10, pow));
        }
    }
}
