package asciiart;

public class MayTheTriforceBeWithYouTestCase {
    public final static String INPUT1 = "1";
    public final static String EXPECTED1 = """
            .*
            * *
            """;

    public final static String INPUT2 = "3";
    public final static String EXPECTED2 = """
            .    *
                ***
               *****
              *     *
             ***   ***
            ***** *****
            """;

    public final static String INPUT3 = "5";
    public final static String EXPECTED3 = """
            .        *
                    ***
                   *****
                  *******
                 *********
                *         *
               ***       ***
              *****     *****
             *******   *******
            ********* *********
            """;

    public final static String INPUT4 = "10";
    public final static String EXPECTED4 = """
            .                  *
                              ***
                             *****
                            *******
                           *********
                          ***********
                         *************
                        ***************
                       *****************
                      *******************
                     *                   *
                    ***                 ***
                   *****               *****
                  *******             *******
                 *********           *********
                ***********         ***********
               *************       *************
              ***************     ***************
             *****************   *****************
            ******************* *******************
            """;
}
