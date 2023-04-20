package asciiart;

public class GlassStackingTestCase {
    public final static String INPUT1 = "4";
    public final static String EXPECTED1 = """
                ***   \s
                * *   \s
                * *   \s
               *****  \s
             ***   ***\s
             * *   * *\s
             * *   * *\s
            ***** *****
            """;

    public final static String INPUT2 = "10";
    public final static String EXPECTED2 = """
                      ***         \s
                      * *         \s
                      * *         \s
                     *****        \s
                   ***   ***      \s
                   * *   * *      \s
                   * *   * *      \s
                  ***** *****     \s
                ***   ***   ***   \s
                * *   * *   * *   \s
                * *   * *   * *   \s
               ***** ***** *****  \s
             ***   ***   ***   ***\s
             * *   * *   * *   * *\s
             * *   * *   * *   * *\s
            ***** ***** ***** *****
            """;

    public final static String INPUT3 = "25";
    public final static String EXPECTED3 = """
                            ***               \s
                            * *               \s
                            * *               \s
                           *****              \s
                         ***   ***            \s
                         * *   * *            \s
                         * *   * *            \s
                        ***** *****           \s
                      ***   ***   ***         \s
                      * *   * *   * *         \s
                      * *   * *   * *         \s
                     ***** ***** *****        \s
                   ***   ***   ***   ***      \s
                   * *   * *   * *   * *      \s
                   * *   * *   * *   * *      \s
                  ***** ***** ***** *****     \s
                ***   ***   ***   ***   ***   \s
                * *   * *   * *   * *   * *   \s
                * *   * *   * *   * *   * *   \s
               ***** ***** ***** ***** *****  \s
             ***   ***   ***   ***   ***   ***\s
             * *   * *   * *   * *   * *   * *\s
             * *   * *   * *   * *   * *   * *\s
            ***** ***** ***** ***** ***** *****
            """;

    public final static String INPUT4 = "1";
    public final static String EXPECTED4 = """
             ***\s
             * *\s
             * *\s
            *****
            """;
}
