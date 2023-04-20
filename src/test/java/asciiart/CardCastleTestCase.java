package asciiart;

public class CardCastleTestCase {
    public final static String INPUT1 = """
            4
            .../\\...
            ../\\/\\..
            ./\\/\\/\\.
            /\\/\\/\\/\\""";
    public final static String EXPECTED1 = """
            STABLE
            """;

    public final static String INPUT2 = """
            2
            ./\\.
            /\\/\\""";
    public final static String EXPECTED2 = """
            STABLE
            """;

    public final static String INPUT3 = """
            2
            ./\\.
            /./\\""";
    public final static String EXPECTED3 = """
            UNSTABLE
            """;

    public final static String INPUT4 = """
            6
            ...../\\.....
            ..../\\/\\....
            .../\\/\\/\\...
            ../\\/\\/\\/\\..
            ./\\/\\/\\/\\/\\.
            /\\/\\/\\/\\/\\/\\
            """;
    public final static String EXPECTED4 = """
            STABLE
            """;

    public final static String INPUT5 = """
            5
            ..../\\....
            .../\\/\\...
            ../\\/./\\..
            ./\\.\\/\\/\\.
            /\\/\\/\\/\\/\\""";
    public final static String EXPECTED5 = """
            UNSTABLE
            """;

    public final static String INPUT6 = """
            4
            ........
            ../\\/\\..
            ./\\/\\/\\.
            /\\/\\/\\/\\""";
    public final static String EXPECTED6 = """
            STABLE
            """;

    public final static String INPUT7 = """
            4
            ........
            ../\\....
            ./\\/\\...
            /\\/\\/\\/\\""";
    public final static String EXPECTED7 = """
            STABLE
            """;

    public final static String INPUT8 = """
            7
            ..............
            ...../\\/......
            ..../\\/\\/\\....
            .../\\/\\/\\/\\...
            ../\\/\\/\\/\\/\\..
            ./\\/\\/\\/\\/\\/\\.
            /\\/\\/\\/\\/\\/\\/\\""";
    public final static String EXPECTED8 = """
            UNSTABLE
            """;

    public final static String INPUT9 = """
            4
            .../\\.\\/
            \\./\\/\\./
            ./\\/\\/\\.
            /\\/\\/\\/\\""";
    public final static String EXPECTED9 = """
            UNSTABLE
            """;

    public final static String INPUT10 = """
            5
            ..........
            ....\\/....
            ../\\/\\/\\..
            ./\\/\\/\\/\\.
            /\\/\\/\\/\\/\\""";
    public final static String EXPECTED10 = """
            UNSTABLE
            """;

    public final static String INPUT11 = """
            8
            ................
            ................
            ................
            ................
            ................
            ................
            ...../\\../\\.....
            /\\/\\/\\/\\/\\/\\/\\/\\""";
    public final static String EXPECTED11 = """
            STABLE
            """;

    public final static String INPUT12 = """
            7
            ..............
            ..............
            ..../\\./\\.....
            .../\\/\\/\\/\\...
            ../\\/\\/\\/\\/\\..
            ./\\/\\/\\/\\/\\/\\.
            /\\/\\/\\/\\/\\/\\/\\""";
    public final static String EXPECTED12 = """
            UNSTABLE
            """;

    public final static String INPUT13 = """
            5
            ..........
            ..........
            ..........
            ./\\..../\\.
            /\\/\\../\\/\\""";
    public final static String EXPECTED13 = """
            STABLE
            """;

    public final static String INPUT14 = """
            5
            ..........
            ..........
            ..........
            ../\\......
            ./\\/\\.../\\""";
    public final static String EXPECTED14 = """
            STABLE
            """;

    public final static String INPUT15 = """
            7
            ....../\\......
            ...../\\/\\.....
            ..............
            .../\\/\\/\\/\\...
            ../\\/\\/\\/\\/\\..
            ./\\/\\/\\/\\/\\/\\.
            /\\/\\/\\/\\/\\/\\/\\""";
    public final static String EXPECTED15 = """
            UNSTABLE
            """;

    public final static String INPUT16 = """
            5
            ..........
            ....//\\...
            ../\\/\\/\\..
            ./\\/\\/\\/\\.
            /\\/\\/\\/\\/\\""";
    public final static String EXPECTED16 = """
            UNSTABLE
            """;

    public final static String INPUT17 = """
            5
            ..........
            ..//\\.....
            ../\\/\\/\\..
            ./\\/\\/\\/\\.
            /\\/\\/\\/\\/\\""";
    public final static String EXPECTED17 = """
            UNSTABLE
            """;

    public final static String INPUT18 = """
            6
            ............
            ............
            ..\\/\\.......
            ../\\/\\/\\/\\..
            ./\\/\\/\\/\\/\\.
            /\\/\\/\\/\\/\\/\\""";
    public final static String EXPECTED18 = """
            UNSTABLE
            """;

    public final static String INPUT19 = """
            3
            ......
            ......
            .../\\.""";
    public final static String EXPECTED19 = """
            STABLE
            """;

    public final static String INPUT20 = """
            4
            ........
            ........
            ........
            ........""";
    public final static String EXPECTED20 = """
            STABLE
            """;

    public final static String INPUT21 = """
            15
            ..............................
            ..............................
            ..............................
            ..............................
            ..............................
            ..............................
            ..............................
            ..............................
            ..............................
            ..............................
            ....../\\......../\\............
            ...../\\/\\..../\\/\\/\\....../\\...
            ..../\\/\\/\\../\\/\\/\\/\\/\\../\\/\\..
            ./\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\.
            /\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\""";
    public final static String EXPECTED21 = """
            STABLE
            """;
}
