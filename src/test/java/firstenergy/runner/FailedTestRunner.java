package firstenergy.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "firstenergy/step_definitions",
        features = "@target/rerun.txt"
//                   ,  tags = "@job_search"
)
public class FailedTestRunner {
}

// You can run failed test cases here

