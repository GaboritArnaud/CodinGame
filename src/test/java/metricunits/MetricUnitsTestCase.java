package metricunits;

public class MetricUnitsTestCase {
    public final static String INPUT1 = """
            1m + 1cm""";
    public final static String EXPECTED1 = """
            101cm
            """;

    public final static String INPUT2 = """
            459m + 132m""";
    public final static String EXPECTED2 = """
            591m
            """;

    public final static String INPUT3 = """
            1km + 14dm""";
    public final static String EXPECTED3 = """
            10014dm
            """;

    public final static String INPUT4 = """
            0.02km + 450mm""";
    public final static String EXPECTED4 = """
            20450mm
            """;

    public final static String INPUT5 = """
            2.55m + 35cm""";
    public final static String EXPECTED5 = """
            290cm
            """;

    public final static String INPUT6 = """
            0.22532m + 90mm""";
    public final static String EXPECTED6 = """
            315.32mm
            """;

    public final static String INPUT7 = """
            0.00098cm + 10mm""";
    public final static String EXPECTED7 = """
            10.0098mm
            """;

    public final static String INPUT8 = """
            0.01dm + 3210um""";
    public final static String EXPECTED8 = """
            4210um
            """;

    public final static String INPUT9 = """
            16.0408mm + 11um""";
    public final static String EXPECTED9 = """
            16051.8um
            """;

    public final static String INPUT10 = """
            1m + 1cm + 1mm""";
    public final static String EXPECTED10 = """
            1011mm
            """;

    public final static String INPUT11 = """
            1m + 1cm - 1mm""";
    public final static String EXPECTED11 = """
            1009mm
            """;

    public final static String INPUT12 = """
            1mm - 1m""";
    public final static String EXPECTED12 = """
            -999mm
            """;
}
