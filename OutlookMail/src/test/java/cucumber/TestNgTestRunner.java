package cucumber;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/cucucmber", glue="mailsystem.stepDefinitions",
monochrome=true, plugin= {"html:target/cucumber.html"})

public class TestNgTestRunner extends AbstractTestNGCucumberTests {
	

}
