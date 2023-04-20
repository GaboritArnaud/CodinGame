package asciiart;

public class UlamSpiralTestCase {
    public final static String INPUT1 = "3";
    public final static String EXPECTED1 = """
            #   #
                #
            #   \s
            """;

    public final static String INPUT2 = "9";
    public final static String EXPECTED2 = """
                    #   #   \s
              #           # \s
            #   #       #   \s
                  #   #   # \s
                #     # #   #
              #   #         \s
            #       #       \s
              #       #     \s
            #           #   \s
            """;

    public final static String INPUT3 = "15";
    public final static String EXPECTED3 = """
            #       #   #               \s
                          #   #         \s
            #   #       #               #
                          #   #       # \s
                #   #           #   #   #
              #   #   #       #         \s
                        #   #   #       \s
              #       #     # #   #   # \s
                #   #   #               \s
                  #       #             \s
                #   #       #       #   #
                  #           #         \s
                    #                   \s
              #           #       #     \s
            #                       #   \s
            """;

    public final static String INPUT4 = "21";
    public final static String EXPECTED4 = """
            #       #               #           #   \s
                              #       #   #       # \s
                #           #                   #   #
                  #       #   #                     \s
                                #   #           #   \s
                  #   #       #               #     \s
                                #   #       #       \s
              #       #   #           #   #   #     \s
            #   #   #   #   #       #               #
                              #   #   #             \s
                    #       #     # #   #   #   #   \s
                      #   #   #                     \s
                        #       #                   \s
              #       #   #       #       #   #     \s
                #       #           #           #   #
                          #                       # \s
                #   #           #       #       #   \s
                  #                       #         \s
            #           #       #   #               \s
                      #   #       #           #     \s
            #                   #   #           #   \s
            """;
}
