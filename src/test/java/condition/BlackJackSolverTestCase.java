package condition;

public class BlackJackSolverTestCase {
    public final static String INPUT1 = """
            8 2 2
            7 6""";
    public final static String EXPECTED1 = """
            Player
            """;

    public final static String INPUT2 = """
            Q 4 5
            K 10""";
    public final static String EXPECTED2 = """
            Player
            """;

    public final static String INPUT3 = """
            7 Q
            6 2 9""";
    public final static String EXPECTED3 = """
            Draw
            """;

    public final static String INPUT4 = """
            A 3 5
            10 4 4""";
    public final static String EXPECTED4 = """
            Bank
            """;

    public final static String INPUT5 = """
            6 9 8
            5 7""";
    public final static String EXPECTED5 = """
            Player
            """;

    public final static String INPUT6 = """
            A J 10
            4 6 5""";
    public final static String EXPECTED6 = """
            Bank
            """;

    public final static String INPUT7 = """
            Q 10 A
            A Q""";
    public final static String EXPECTED7 = """
            Blackjack!
            """;

    public final static String INPUT8 = """
            A Q
            A 10""";
    public final static String EXPECTED8 = """
            Draw
            """;

    public final static String INPUT9 = """
            A 9
            A A 5""";
    public final static String EXPECTED9 = """
            Bank
            """;

    public final static String INPUT10 = """
            10 4 Q
            J 9 5""";
    public final static String EXPECTED10 = """
            Bank
            """;
}
