package google.co.uk;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        plugin = {"pretty", "html:target/cucumber/report"},
        //glue = {"TestArea"},
        tags = {"@wip"},
        snippets = SnippetType.CAMELCASE


        )

public class RunnerCukesTest {

}
