package appconfig.domain.codingame;

import appconfig.domain.codingame.model.Problem;

import java.util.List;

public interface CodingameService {

    public List<Problem> findAllProblem();

    public List<Problem> findAllByIds(List<Integer> ids);

    public Problem getProblemByName(String name);

}
