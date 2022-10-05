package StepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "//Users//saimadhavi//QA//DataDrivenCucumber//src//main//java//FeatureFile//DataTable.feature",
glue = {"StepDefinition"},monochrome = true,dryRun = false)


public class TestRunner {
}
