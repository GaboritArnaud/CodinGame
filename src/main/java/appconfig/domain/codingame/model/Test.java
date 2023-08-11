package appconfig.domain.codingame.model;

import lombok.Builder;
import lombok.Data;
import org.apache.logging.log4j.util.Strings;

@Data
@Builder
public class Test {
    private String name;
    private String index;
    private String input;
    private String expected;

    public String toTestCase() {
        final var LINE_SEPARATOR = Strings.LINE_SEPARATOR;
        final var TAB = "\t";

        return TAB + "public final static String " + getInputName() + " = \"" + formatTestValue(input) + "\";" + LINE_SEPARATOR +
                LINE_SEPARATOR +
                TAB + "public final static String " + getExpectedName() + " = \"" + formatTestValue(expected) + "\";" + LINE_SEPARATOR;
    }

    public String toProvideParam() {
        return String.format("Arguments.of(SolutionTestCase.%s, SolutionTestCase.%s)", getInputName(), getExpectedName());
    }

    public String getInputName() {
        return "INPUT_" + index.toUpperCase();
    }

    public String getExpectedName() {
        return "EXPECTED_" + index.toUpperCase();
    }

    private String formatTestValue(String testValue) {
        var lastChar = testValue.charAt(testValue.length() - 1);

        return testValue
                .replace("\\", "\\\\")
                .replace("\n", "\\n") +
                (lastChar == '\n' ? "" : "\\n");
    }

}
