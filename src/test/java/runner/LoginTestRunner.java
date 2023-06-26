package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		//path of feature file
		features = {"src/test/java/features/gmailLogin.feature" }, 
		//strict = true,
		//monochrome = true,
		//dryRun = true,
		//path of step definition file
        glue = {"stepDefinitions"}
		)
public class LoginTestRunner {
	

}
