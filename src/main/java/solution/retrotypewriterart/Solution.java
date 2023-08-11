package solution.retrotypewriterart;

import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

// id=2782
public class Solution {

    static Map<String, String> map = Map.of(
            "sp", " ",
            "bS", "\\",
            "sQ", "'"
    );

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final String T = in.nextLine();
        String res = Arrays.stream(T.split(" "))
                .map(Solution::mapper)
                .collect(Collectors.joining());
        System.out.println(res);
    }

    private static String mapper(String s) {

        if ("nl".equals(s)) {
            return "\n";
        }

        String myChar = map.get(s.substring(s.length()-2));
        int n = 0;

        if(Objects.nonNull(myChar)) {
            n = Integer.parseInt(s.substring(0, s.length()-2));
        } else {
            n = Integer.parseInt(s.substring(0, s.length()-1));
            myChar = s.substring(s.length()-1);
        }

        return myChar.repeat(n);
    }
}