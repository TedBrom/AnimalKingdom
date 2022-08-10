package cucumber;


import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/cucumber", glue = "src/test/java/cucumber/FeedCatStepDefs.java")

public class RunCucumberTest
{
    // stuff here
}