package TestRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(tags="",
            features = "/src/test/java/features",
            glue = {"src/test/java/StepsDefinition"},
            plugin = {"pretty", "html:target/cucumber-html-report"}
)
public class TestRunner {

    }

