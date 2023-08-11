package appconfig.infra.adapter.codingame.model;

import lombok.Data;

import java.util.List;

@Data
public class StartedSession {
    private CurrentQuestion currentQuestion;

    @Data
    public static class CurrentQuestion {
        private Question question;

        @Data
        public static class Question {
            private List<TestCases> testCases;

            @Data
            public static class TestCases {
                private String index;
                private String inputBinaryId;
                private String outputBinaryId;
                private String label;
            }
        }
    }
}


