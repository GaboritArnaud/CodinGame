package asciiart;

public class MountainMapTestCase {
    public final static String INPUT1 = """
            3
            1
            2
            1
            """;
    public final static String EXPECTED1 = """
               /\\
            /\\/  \\/\\
            """;

    public final static String INPUT2 = """
            1
            1
            """;
    public final static String EXPECTED2 = """
            /\\
            """;

    public final static String INPUT3 = """
            4
            3 7 2 9
            """;
    public final static String EXPECTED3 = """
                                            /\\
                                           /  \\
                        /\\                /    \\
                       /  \\              /      \\
                      /    \\            /        \\
                     /      \\          /          \\
              /\\    /        \\        /            \\
             /  \\  /          \\  /\\  /              \\
            /    \\/            \\/  \\/                \\
            """;

    public final static String INPUT4 = """
            7
            7 2 3 4 1 2 3
            """;
    public final static String EXPECTED4 = """
                  /\\
                 /  \\
                /    \\
               /      \\                /\\
              /        \\        /\\    /  \\          /\\
             /          \\  /\\  /  \\  /    \\    /\\  /  \\
            /            \\/  \\/    \\/      \\/\\/  \\/    \\
            """;
}
