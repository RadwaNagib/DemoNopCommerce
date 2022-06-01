package runners;

import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import org.testng.annotations.CustomAttribute;
//import io.cucumber.junit.CucumberOptions;
//@RunWith(Cucumber.class)


@CucumberOptions(
        features ="src\\main\\resources\\features",
        glue="stepDefinitions",
        tags = "@smoke"
)

public class TestRunner extends AbstractTestNGCucumberTests{

}
