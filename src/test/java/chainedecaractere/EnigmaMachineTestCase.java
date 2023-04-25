package chainedecaractere;

public class EnigmaMachineTestCase {
    public final static String INPUT1 = """
            ENCODE
            4
            BDFHJLCPRTXVZNYEIWGAKMUSQO
            AJDKSIRUXBLHWTMCQGZNPYFVOE
            EKMFLGDQVZNTOWYHXUSPAIBRCJ
            AAA""";
    public final static String EXPECTED1 = """
            KQF
            """;

    public final static String INPUT2 = """
            DECODE
            4
            BDFHJLCPRTXVZNYEIWGAKMUSQO
            AJDKSIRUXBLHWTMCQGZNPYFVOE
            EKMFLGDQVZNTOWYHXUSPAIBRCJ
            KQF""";
    public final static String EXPECTED2 = """
            AAA
            """;

    public final static String INPUT3 = """
            ENCODE
            7
            BDFHJLCPRTXVZNYEIWGAKMUSQO
            AJDKSIRUXBLHWTMCQGZNPYFVOE
            EKMFLGDQVZNTOWYHXUSPAIBRCJ
            WEATHERREPORTWINDYTODAY""";
    public final static String EXPECTED3 = """
            ALWAURKQEQQWLRAWZHUYKVN
            """;

    public final static String INPUT4 = """
            DECODE
            9
            BDFHJLCPRTXVZNYEIWGAKMUSQO
            AJDKSIRUXBLHWTMCQGZNPYFVOE
            EKMFLGDQVZNTOWYHXUSPAIBRCJ
            PQSACVVTOISXFXCIAMQEM""";
    public final static String EXPECTED4 = """
            EVERYONEISWELCOMEHERE
            """;

    public final static String INPUT5 = """
            ENCODE
            9
            BDFHJLCPRTXVZNYEIWGAKMUSQO
            AJDKSIRUXBLHWTMCQGZNPYFVOE
            EKMFLGDQVZNTOWYHXUSPAIBRCJ
            EVERYONEISWELCOMEHERE""";
    public final static String EXPECTED5 = """
            PQSACVVTOISXFXCIAMQEM
            """;

    public final static String INPUT6 = """
            ENCODE
            9
            BDFHJLCPRTXVZNYEIWGAKMUSQO
            AJDKSIRUXBLHWTMCQGZNPYFVOE
            EKMFLGDQVZNTOWYHXUSPAIBRCJ
            EVERYONEISWELCOMEHEREEVERYONEISWELCOMEHERE""";
    public final static String EXPECTED6 = """
            PQSACVVTOISXFXCIAMQEMDZIXFJJSTQIENEFQXVZYV
            """;

    public final static String INPUT7 = """
            DECODE
            5
            BDFHJLCPRTXVZNYEIWGAKMUSQO
            AJDKSIRUXBLHWTMCQGZNPYFVOE
            EKMFLGDQVZNTOWYHXUSPAIBRCJ
            XPCXAUPHYQALKJMGKRWPGYHFTKRFFFNOUTZCABUAEHQLGXREZ""";
    public final static String EXPECTED7 = """
            THEQUICKBROWNFOXJUMPSOVERALAZYSPHINXOFBLACKQUARTZ
            """;
}
