package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

public class GmailRunner {
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/java/features/gMail.feature", glue = { "stepdefinitions" })
	public class MyProjectTestRunner {

	}
}
