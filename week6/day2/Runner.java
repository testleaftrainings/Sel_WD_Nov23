package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



@CucumberOptions(features="src/test/java/feature/createlead.feature",glue="stepdef")
public class Runner extends AbstractTestNGCucumberTests {

}
