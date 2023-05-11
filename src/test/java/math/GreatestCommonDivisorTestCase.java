package math;

public class GreatestCommonDivisorTestCase {
    public final static String INPUT1 = """
            25 3""";
    public final static String EXPECTED1 = """
            25=3*8+1
            3=1*3+0
            GCD(25,3)=1
            """;

    public final static String INPUT2 = """
            50 14""";
    public final static String EXPECTED2 = """
            50=14*3+8
            14=8*1+6
            8=6*1+2
            6=2*3+0
            GCD(50,14)=2
            """;

    public final static String INPUT3 = """
            115 47""";
    public final static String EXPECTED3 = """
            115=47*2+21
            47=21*2+5
            21=5*4+1
            5=1*5+0
            GCD(115,47)=1
            """;

    public final static String INPUT4 = """
            4857 147""";
    public final static String EXPECTED4 = """
            4857=147*33+6
            147=6*24+3
            6=3*2+0
            GCD(4857,147)=3
            """;
}
