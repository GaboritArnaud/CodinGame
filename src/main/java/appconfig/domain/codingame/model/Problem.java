package appconfig.domain.codingame.model;

import lombok.Data;

import java.text.Normalizer;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

@Data
public class Problem {
    private Integer id;
    private String prettyId;
    private String level;
    private String title;
    private String detailsPageUrl;

    private List<Test> tests;

    public String getPackageName() {
        var packageName = title.chars().filter(c -> Character.isLetter(c) || Character.isDigit(c))
                .mapToObj(i -> (char) i)
                .map(String::valueOf)
                .collect(Collectors.joining())
                .replace(" ", "")
                .toLowerCase();
        String normalized = Normalizer.normalize(packageName, Normalizer.Form.NFD);
        Pattern pattern = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");
        return pattern.matcher(normalized).replaceAll("");
    }
}
