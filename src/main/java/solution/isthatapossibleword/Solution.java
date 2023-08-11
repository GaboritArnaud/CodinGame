package solution.isthatapossibleword;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// id=643
public class Solution {

    private static Map<String, String> transitions;
    private static String initialState;
    private static String state;
    private static List<String> endStates;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.nextLine();
        in.nextLine();

        int numberOfTransitions = in.nextInt();

        in.nextLine();

        transitions = Stream.generate(in::nextLine)
                .limit(numberOfTransitions)
                .collect(Collectors.toMap(
                        Solution::getTransitionKey,
                        Solution::getTransitionValue
                ));

        initialState = in.nextLine();
        state = initialState;

        endStates = List.of(in.nextLine().split(" "));

        int numberOfWords = in.nextInt();

        in.nextLine();

        Stream.generate(in::nextLine)
                .limit(numberOfWords)
                .map(Solution::evaluateWord)
                .forEach(System.out::println);
    }

    private static String getTransitionKey(String transition) {
        return String.valueOf(transition.charAt(0)) +
                transition.charAt(2);
    }

    private static String getTransitionValue(String transition) {
        return String.valueOf(transition.charAt(4));
    }

    private static Boolean evaluateWord(String word) {
        for(int i = 0; i < word.length(); i++) {
            var nextState = transitions.get(state + word.charAt(i));
            if(nextState == null) {
                state = initialState;
                return false;
            }
            state = nextState;
        }
        var res =  endStates.stream()
                .anyMatch(andState -> andState.equals(state));
        state = initialState;
        return res;
    }
}