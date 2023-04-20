package chainedecaractere;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TableOfContent {

    private static final String WHITE_SPACE = " ";
    private static final String INDENT = "    ";
    private static final String FILLER = ".";
    private static TitleNode titleNode;
    private static int lineSize;

    public static void main(String[] args) {
        titleNode = new TitleNode();
        Scanner in = new Scanner(System.in);
        lineSize = in.nextInt();
        int nbLine = in.nextInt();
        in.nextLine();

        var tableOfContent = Stream.generate(in::nextLine)
                .limit(nbLine)
                .map(TableOfContent::mapToLine)
                .collect(Collectors.joining("\n"));

        System.out.println(tableOfContent);
    }

    private static String mapToLine(String line) {
        StringBuilder sb = new StringBuilder();
        var nbIndentation = (int) line.chars().filter(c -> c == '>').count();

        titleNode = titleNode.addTittle(nbIndentation);

        var tab = line.replace(">", "").split(WHITE_SPACE);
        var title = tab[0];
        var page = tab[1];

        return sb.append(INDENT.repeat(nbIndentation))
                .append(titleNode.getValue())
                .append(WHITE_SPACE)
                .append(title)
                .append(FILLER.repeat(lineSize - sb.length() - page.length()))
                .append(page)
                .toString();
    }

    private static class TitleNode {
        private final TitleNode parent;
        private final List<TitleNode> children;
        private final int rank;
        private final int value;

        public TitleNode() {
            this.parent = null;
            this.children = new ArrayList<>();
            this.rank = 0;
            this.value = 0;
        }

        public TitleNode(TitleNode parent, int rank, int value) {
            this.parent = parent;
            this.children = new ArrayList<>();
            this.rank = rank;
            this.value = value;
        }

        public TitleNode addTittle(int rank) {
            var p = getParentByRank(rank);
            var tittle = new TitleNode(p, rank + 1, p.getChildren().size() + 1);
            p.getChildren().add(tittle);
            return tittle;
        }

        public List<TitleNode> getChildren() {
            return children;
        }

        public int getValue() {
            return this.value;
        }

        public TitleNode getParentByRank(int rank) {
            if (this.rank == rank) {
                return this;
            } else {
                return Optional.ofNullable(this.parent)
                        .orElseThrow(() -> new IllegalArgumentException(String.format("Unable to reach parent for rank=%d", rank)))
                        .getParentByRank(rank);
            }
        }
    }

}
