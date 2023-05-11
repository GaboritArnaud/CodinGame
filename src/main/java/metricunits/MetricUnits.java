package metricunits;

import java.util.*;

import static java.util.stream.Collectors.joining;

public class MetricUnits {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var expressions = expressionToValues(in.nextLine().replace(" ", "")).stream()
                .map(Value::new)
                .sorted(Comparator.comparing(v -> v.unite.puissance))
                .toList();

        var minimalUnit = expressions.get(0).unite;

        var result = expressions.stream()
                .map(value -> value.convertion(minimalUnit))
                .reduce(Float::sum)
                .orElse(0F);

        System.out.println(format(result) + minimalUnit.label);
    }

    private static List<String> expressionToValues(String expression) {
        var currentValue = new StringBuilder();
        List<String> values = new ArrayList<>();
        for (char c : expression.toCharArray()) {
            if (c == '+' || c == '-') {
                if (!currentValue.isEmpty()) {
                    values.add(currentValue.toString());
                }
                currentValue = new StringBuilder(String.valueOf(c));
            } else {
                currentValue.append(c);
            }
        }
        values.add(currentValue.toString());
        return values;
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
                    .filter(Character::isLetter)
                    .mapToObj(c -> String.valueOf((char) c))
                    .collect(joining());

            this.unite = Arrays.stream(Unite.values())
                    .filter(u -> u.label.equals(unitValue))
                    .findFirst()
                    .orElseThrow(() -> new IllegalArgumentException(String.format("L'unité %s n'existe pas ou n'est pas gérée par le programme", unitValue)));

            this.val = Float.parseFloat(val.replace(unite.label, ""));
        }

        public float convertion(Unite uniteCible) {
            var pow = this.unite.puissance - uniteCible.puissance;
            this.val = (float) (this.val * Math.pow(10, pow));
            return this.val;
        }
    }
}
