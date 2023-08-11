package appconfig.infra.adapter.codingame;

import appconfig.conf.CodinGamePropertie;
import appconfig.domain.codingame.CodingameService;
import appconfig.domain.codingame.model.Problem;
import appconfig.domain.codingame.model.Test;
import appconfig.infra.adapter.codingame.model.Session;
import appconfig.infra.adapter.codingame.model.StartedSession;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CodingameAdapter implements CodingameService {

    @Autowired
    private CodinGamePropertie codinGamePropertie;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Problem> findAllProblem() {
        List<Integer> ids = new ArrayList<>();
        Optional.ofNullable(restTemplate.postForEntity(codinGamePropertie.getFindAllMinimalProblemUrl(),
                        new Object[]{null}, JsonNode.class).getBody()).orElseThrow()
                .elements()
                .forEachRemaining(p -> ids.add(p.at("/id").asInt()));

        var res = Optional.ofNullable(restTemplate.postForEntity(codinGamePropertie.getFindProblemByIdsUrl(),
                new Object[]{ids, null, 1}, Problem[].class).getBody()).orElseThrow();
        return List.of(res);
    }

    @Override
    public List<Problem> findAllByIds(List<Integer> ids) {
        var problems = List.of(Optional.ofNullable(restTemplate.postForEntity(codinGamePropertie.getFindProblemByIdsUrl(),
                new Object[]{ids, null, 1}, Problem[].class).getBody()).orElseThrow());
        problems.stream().forEach(problem -> problem.setTests(findAllTest(problem)));
        return problems;
    }

    @Override
    public Problem getProblemByName(String name) {
        var problem = Optional.ofNullable(restTemplate.postForEntity(codinGamePropertie.getFindProblemByPrettyIdUrl(),
                new String[]{name, null}, Problem.class).getBody()).orElseThrow();

        problem.setTests(findAllTest(problem));

        return problem;
    }

    private List<Test> findAllTest(Problem problem) {
        var respSession = Optional.ofNullable(restTemplate.postForEntity(codinGamePropertie.getGenerateSessionFromPuzzlePrettyIdUrl(),
                new String[]{null, problem.getPrettyId(), Boolean.FALSE.toString()}, Session.class).getBody()).orElseThrow();

        var respStartedSession = Optional.ofNullable(restTemplate.postForEntity(codinGamePropertie.getStartTestSessionUrl(),
                new String[]{respSession.getHandle()}, StartedSession.class).getBody()).orElseThrow();

        return respStartedSession.getCurrentQuestion().getQuestion().getTestCases().stream()
                .map(this::toTest)
                .toList();
    }

    private String getTestValueById(String id) {
        return restTemplate.getForEntity(codinGamePropertie.getGetTestValueByIdUrl(), String.class, id).getBody();
    }

    private Test toTest(StartedSession.CurrentQuestion.Question.TestCases testCases) {
        return Test.builder()
                .index(testCases.getIndex())
                .name(testCases.getLabel())
                .expected(getTestValueById(testCases.getOutputBinaryId()))
                .input(getTestValueById(testCases.getInputBinaryId()))
                .build();
    }
}
