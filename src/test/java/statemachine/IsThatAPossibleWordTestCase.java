package statemachine;

public class IsThatAPossibleWordTestCase {

    public static String INPUT1 = """
            a b c
            A B
            6
            A a B
            A b B
            A c B
            B a A
            B b A
            B c A
            A
            B
            10
            a
            ab
            abc
            abcd
            abcde
            aabbcc
            aabbcca
            abcabcabc
            z
            abcabcabo""";
    public static String EXPECTED1 = """
            true
            false
            true
            false
            false
            false
            true
            true
            false
            false
            """;

    public static String INPUT2 = """
            a b c d
            A B C D
            16
            A a A
            A b B
            A c A
            A d A
            B a A
            B b B
            B c C
            B d A
            C a A
            C b B
            C c A
            C d D
            D a A
            D b B
            D c A
            D d A
            A
            D
            5
            bcd
            abacdb
            aaabbccadbcd
            aaabcdbdebcd
            bcdbcdbcdbcd""";
    public static String EXPECTED2 = """
            true
            false
            true
            false
            true
            """;

    public static String INPUT3 = """
            a b c d
            A B C
            6
            A a B
            B c C
            C a C
            C b C
            C c C
            C d C
            A
            C
            7
            ac
            ab
            acabcd
            acabcde
            a
            acaaacca
            cafds""";
    public static String EXPECTED3 = """
            true
            false
            true
            false
            false
            true
            false
            """;

    public static String INPUT4 = """
            a b c
            A B C
            5
            A a A
            A b B
            B a B
            B b A
            B c C
            A
            A B
            6
            bc
            bbabc
            aaaabababaac
            aaaaabaaaabbaa
            abbabacc
            abababababbadabbba""";
    public static String EXPECTED4 = """
            false
            false
            false
            true
            false
            false
            """;
}
