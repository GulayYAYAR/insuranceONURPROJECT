package code.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)  //WE are connecting JUnit Here
@CucumberOptions(
        features = "src/test/resources",  //This is to connect feature files with runner class
        //We need to copy path from content root
        glue = "code/stepsDefinitions", //This is to connect steps with runner class
        //We need to copy path from source root
        tags= "@TC1",
        dryRun = false, //This is to get undefined steps without opening up browser
        plugin={
        "pretty", //This is to have more understandable console logs.
        "rerun:target/rerun.txt", //This will help us to store failed scenarios in rerun.txt file so that we
                //we can run them from FailedRunner class.
        "html:target/default-cucumber-reports.html",
        "json:target/cucumber.json",


}
)




public class TestRunner {
}
