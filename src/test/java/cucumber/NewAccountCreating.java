package cucumber;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/Features/new-account-creating.feature",
        plugin = {"pretty","html:out"})
public class NewAccountCreating {
}
