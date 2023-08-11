package appconfig.application.resource;

import appconfig.application.dto.InitBody;
import appconfig.domain.codingame.model.Problem;
import appconfig.domain.problem.ProblemService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@Slf4j
@RestController
@RequestMapping("api/problems")
public class ProblemResource {

    @Autowired
    private ProblemService problemService;

    @PostMapping("/init")
    public void init(@RequestBody InitBody initBody) {
        if (Objects.isNull(initBody.getPrettyId())) {
            log.error("le nom du package ne doit pas être null");
        } else {
            problemService.createPackage(initBody.getPrettyId());
        }
    }

    @GetMapping
    public List<Problem> test() {
        return problemService.findAllProblemToDo();
    }
}
