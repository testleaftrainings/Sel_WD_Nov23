package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import stepdef.BaseClass;



@CucumberOptions(features="src/test/java/feature/login.feature",
                 glue={"stepdef","HooksImpl"},monochrome=true,publish=true)
public class RunnerHooks extends AbstractTestNGCucumberTests {

}



