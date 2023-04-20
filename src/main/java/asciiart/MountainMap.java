package asciiart;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MountainMap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of mountains

        List<Integer> m = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            m.add(in.nextInt());
        }

        int max = m.stream().max(Integer::compareTo).orElse(0);

        for(int line = 0; line < max; line++) {

            int finalLine = line;
            String res = m.stream()
                    .map(mountainSize -> mapMountainToString(mountainSize, finalLine, max))
                    .collect(Collectors.joining()).stripTrailing();

            System.out.println(res);
        }
    }

    private static String mapMountainToString(int mountainSize, int line, int max) {
        StringBuilder res = new StringBuilder();

        int largeur = mountainSize*2;

        if(mountainSize < max-line) {
            res.append(Stream.generate(() -> " ").limit(largeur).collect(Collectors.joining()));
        } else {
            int spaceInSize = (mountainSize-max+line)*2;
            int spaceOutSize = (largeur - spaceInSize - 2) / 2;

            String spaceInStr = " ".repeat(spaceInSize);
            String spaceOutStr = " ".repeat(spaceOutSize);

            res.append(spaceOutStr);
            res.append("/");
            res.append(spaceInStr);
            res.append("\\");
            res.append(spaceOutStr);
        }
        return res.toString();
    }


}
