package chainedecaractere;

import common.CodinGameTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnigmaMachineTest extends CodinGameTest {

    @Mock
    EnigmaMachine enigmaMachine;

    public Stream<Arguments> provideParamsForMainTest() {
        return Stream.of(
                Arguments.of(EnigmaMachineTestCase.INPUT1, EnigmaMachineTestCase.EXPECTED1),
                Arguments.of(EnigmaMachineTestCase.INPUT2, EnigmaMachineTestCase.EXPECTED2),
                Arguments.of(EnigmaMachineTestCase.INPUT3, EnigmaMachineTestCase.EXPECTED3),
                Arguments.of(EnigmaMachineTestCase.INPUT4, EnigmaMachineTestCase.EXPECTED4),
                Arguments.of(EnigmaMachineTestCase.INPUT5, EnigmaMachineTestCase.EXPECTED5),
                Arguments.of(EnigmaMachineTestCase.INPUT6, EnigmaMachineTestCase.EXPECTED6),
                Arguments.of(EnigmaMachineTestCase.INPUT7, EnigmaMachineTestCase.EXPECTED7)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCharShiftingLeftTest")
    public void charShiftingLeftTest(int input, int expected) {
        assertEquals(expected, EnigmaMachine.charShiftingLeft('A', input));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCharShiftingRightTest")
    public void charShiftingRightTest(int input, int expected) {
        assertEquals(expected, EnigmaMachine.charShiftingRight('A', input));
    }

    public Stream<Arguments> provideParamsForCharShiftingLeftTest() {
        char c = 'A';
        List<Arguments> args = new ArrayList<>();
        for (int j = 0; j >= -500; j--) {
            args.add(Arguments.of(Math.abs(j), c));
            c = c - 1 >= 'A' ? (char) (c - 1) : 'Z';
        }
        return args.stream();
    }

    public Stream<Arguments> provideParamsForCharShiftingRightTest() {
        char c = 'A';
        List<Arguments> args = new ArrayList<>();
        for (int j = 0; j <= 500; j++) {
            args.add(Arguments.of(j, c));
            c = c + 1 <= 'Z' ? (char) (c + 1) : 'A';
        }
        return args.stream();
    }
}
