package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C://Users//pugerp//IdeaProjects//test//src//test//resources//features//TestingFeature.feature",
        glue =  "stepDefinitions"
)
public class TestRunner {
}
