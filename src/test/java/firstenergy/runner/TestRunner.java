package firstenergy.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(  features = "src/test/resources/features" , //"path for: features"
        glue = "firstenergy/step_definitions" ,
      //  publish = true, // it will create local html report
        plugin = {"pretty", "html:target/cucumber.html" ,
                "rerun:target/rerun.txt" ,  // store the failed scenario into rerun.txt
               "me.jvt.cucumber.report.PrettyReports:target"  // fancy report (you can find the file under >target/cucumber-html-reports folder)
        } ,
        dryRun = false
        , tags =    "@smoke"  // @smoke @job_searchDDT @job_search
)
public class TestRunner {
}
