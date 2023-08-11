package solution.isthatapossibleword;

public class SolutionTestCase {
    public final static String INPUT_1 = "a b c\nA B\n6\nA a B\nA b B\nA c B\nB a A\nB b A\nB c A\nA\nB\n10\na\nab\nabc\nabcd\nabcde\naabbcc\naabbcca\nabcabcabc\nz\nabcabcabo\n";

    public final static String EXPECTED_1 = "true\nfalse\ntrue\nfalse\nfalse\nfalse\ntrue\ntrue\nfalse\nfalse\n";

    public final static String INPUT_2 = "a b c d\nA B C D\n16\nA a A\nA b B\nA c A\nA d A\nB a A\nB b B\nB c C\nB d A\nC a A\nC b B\nC c A\nC d D\nD a A\nD b B\nD c A\nD d A\nA\nD\n5\nbcd\nabacdb\naaabbccadbcd\naaabcdbdebcd\nbcdbcdbcdbcd\n";

    public final static String EXPECTED_2 = "true\nfalse\ntrue\nfalse\ntrue\n";

    public final static String INPUT_3 = "a b c d\nA B C\n6\nA a B\nB c C\nC a C\nC b C\nC c C\nC d C\nA\nC\n7\nac\nab\nacabcd\nacabcde\na\nacaaacca\ncafds\n";

    public final static String EXPECTED_3 = "true\nfalse\ntrue\nfalse\nfalse\ntrue\nfalse\n";

    public final static String INPUT_4 = "a b c\nA B C\n5\nA a A\nA b B\nB a B\nB b A\nB c C\nA\nA B\n6\nbc\nbbabc\naaaabababaac\naaaaabaaaabbaa\nabbabacc\nabababababbadabbba\n";

    public final static String EXPECTED_4 = "false\nfalse\nfalse\ntrue\nfalse\nfalse\n";

}