package runner;

import io.cucumber.testng.CucumberOptions;
import stepdef.BaseClass;



@CucumberOptions(features="src/test/java/feature",
                 glue="stepdef",monochrome=true,publish=true)
public class Runner extends BaseClass {

}



