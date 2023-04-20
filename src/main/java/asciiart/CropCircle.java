package asciiart;

import java.util.*;

public class CropCircle {

    private static Map<Point, String> field;

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String instructions = in.nextLine();

        generateField();

        Arrays.stream(instructions.split(" "))
                .map(Circle::new)
                .forEach(c -> field.forEach((point, value) -> {
                            if (c.isInCircle(point)) {
                                field.put(point, c.getNewValue(point));
                            }
                        })
                );

        for (int y = 0; y < 25; y++) {
            StringBuilder res = new StringBuilder();
            for (int x = 0; x < 19; x++) {
                res.append(field.get(new Point(x, y)));
            }
            System.out.println(res);
        }

    }

    private static void generateField() {
        field = new HashMap<>();
        for (int y = 0; y < 25; y++) {
            for (int x = 0; x < 19; x++) {
                field.put(new Point(x, y), "{}");
            }
        }
    }

    public static class Circle {
        private final Point point;
        private final int size;
        private final Type type;

        public Circle(Point point, int size, Type type) {
            this.point = point;
            this.size = size;
            this.type = type;
        }

        public Circle(String circle) {
            if (circle.contains(Type.PLANT.name())) {
                type = circle.contains(Type.PLANTMOW.name()) ? Type.PLANTMOW : Type.PLANT;
                circle = circle.replace(type.name(), "");
            } else {
                type = Type.BASIC;
            }
            int x = circle.charAt(0) - 'a';
            int y = circle.charAt(1) - 'a';
            point = new Point(x, y);
            try {
                size = Integer.parseInt(circle.substring(2));
            } catch (Exception e) {
                throw new IllegalArgumentException(String.format("Impossible de convertir %s en cercle", circle));
            }
        }

        public boolean isInCircle(Point p) {
            int r = size / 2;
            double d = Math.sqrt(Math.pow(p.x - point.x, 2) + Math.pow(p.y - point.y, 2));
            return Math.round(d) <= r;
        }

        public String getNewValue(Point point) {
            if (Type.BASIC.equals(type)) {
                return "  ";
            } else if (Type.PLANT.equals(type)) {
                return "{}";
            } else if (Type.PLANTMOW.equals(type)) {
                return "{}".equals(field.get(point)) ? "  " : "{}";
            }
            throw new IllegalStateException(String.format("Le type de cercle %s est inconnu", type));
        }
    }

    public record Point(double x, double y) {}

    public enum Type { BASIC, PLANT, PLANTMOW }
}
