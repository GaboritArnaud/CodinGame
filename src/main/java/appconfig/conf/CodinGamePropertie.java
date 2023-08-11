package appconfig.conf;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@NoArgsConstructor
@ConfigurationProperties(prefix = "codingame")
public class CodinGamePropertie {

    @Value("${codingame.user.id}")
    private String userId;

    @Value("${codingame.api.baseUrl}")
    private String baseUrl;

    @Value("${codingame.api.findAllMinimalProblem}")
    private String findAllMinimalProblemUrl;

    @Value("${codingame.api.findProblemByPrettyId}")
    private String findProblemByPrettyIdUrl;

    @Value("${codingame.api.findProblemByIds}")
    private String findProblemByIdsUrl;

    @Value("${codingame.api.generateSessionFromPuzzlePrettyId}")
    private String generateSessionFromPuzzlePrettyIdUrl;

    @Value("${codingame.api.startTestSession}")
    private String startTestSessionUrl;

    @Value("${codingame.api.getTestValueById}")
    private String getTestValueByIdUrl;
}
