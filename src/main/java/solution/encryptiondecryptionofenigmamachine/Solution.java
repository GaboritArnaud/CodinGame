package solution.encryptiondecryptionofenigmamachine;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

// id=433
public class Solution {

    private static String message;
    private static List<String> rotors;
    private static int shift;

    /**
     * Le programme doit décoder ou encoder un message suivant l'encodage suivant :
     * - Décaler la premiere lettre du message du nombre de décalage en suivant l'ordre alphabetique, puis ajouter 1
     * au nombre de décalage et répété l'opération pour chaque lettre.
     * Exemple : AAA et 4 => EFG
     * A + 4 = E
     * A + 4 + 1 = F
     * A + 4 + 1 + 1 = G
     * <p>
     * - Passer chaque caractère dans chaque Rotor.
     * Exemple : E 5ème lettre de l'alphabet
     * Rotor 1 : E -> J (10ème lettre)
     * Rotor 2 : J -> B (2ème lettre)
     * Rotor 3 : B -> K
     * EFG -> KQF
     * <p>
     * Input :
     * Line 1 : ENCODE / DECODE - Traitement à effectuer
     * Line 2 : Integer - 4 - nombre de décalage
     * Ligne 3 : String - BDFHJLCPRTXVZNYEIWGAKMUSQO - Le premier Rotor
     * Ligne 4 : String - AJDKSIRUXBLHWTMCQGZNPYFVOE - Le deuxième Rotor
     * Ligne 5 : String - EKMFLGDQVZNTOWYHXUSPAIBRCJ - Le troisième Rotor
     * Ligne 6 : String - AAA - Le message à encoder ou décoder
     * <p>
     * Dans cette exemple AAA -> KQF
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var operation = Operation.valueOf(in.nextLine());
        shift = in.nextInt();
        in.nextLine();
        rotors = Stream.generate(in::nextLine).limit(3).toList();
        message = in.nextLine();

        if (Operation.DECODE.equals(operation)) {
            System.out.println(decode());
        } else if (Operation.ENCODE.equals(operation)) {
            System.out.println(encode());
        }
    }

    private static String decode() {
        message = IntStream.iterate(0, i -> i + 1)
                .limit(message.length())
                .map(i -> message.charAt(i))
                .map(c -> rotors.get(2).indexOf(c))
                .map(c -> rotors.get(1).indexOf(c + 'A'))
                .map(c -> rotors.get(0).indexOf(c + 'A'))
                .mapToObj(c -> String.valueOf((char) (c + 'A')))
                .collect(Collectors.joining());

        return IntStream.iterate(0, i -> i + 1)
                .limit(message.length())
                .map(i -> charShiftingLeft(message.charAt(i), shift + i))
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining());
    }

    private static String encode() {
        return IntStream.iterate(0, i -> i + 1)
                .limit(message.length())
                .map(i -> charShiftingRight(message.charAt(i), shift + i) - 'A')
                .map(c -> rotors.get(0).charAt(c) - 'A')
                .map(c -> rotors.get(1).charAt(c) - 'A')
                .map(c -> rotors.get(2).charAt(c))
                .mapToObj(c -> Character.toString((char) c))
                .collect(Collectors.joining());
    }

    public static int charShiftingLeft(int c, int shift) {
        shift = shift % ('Z' - 'A' + 1);
        return c - shift < 'A' ? c - shift + 'Z' - 'A' + 1 : c - shift;
    }

    public static int charShiftingRight(int c, int shift) {
        shift = shift % ('Z' - 'A' + 1);
        return c + shift > 'Z' ? c + shift - ('Z' - 'A' + 1) : c + shift;
    }

    private enum Operation {ENCODE, DECODE}
}