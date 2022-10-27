package code.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "@target/rerun.txt",  //This is to connect feature files with runner class
        //We need to copy path from content root
        glue = "code/stepsDefinitions", //This is to connect steps with runner class
        //We need to copy path from source root
        dryRun = false, //This is to get undefined steps without opening up browser,
        plugin={
               "pretty", //This is to have more understandable console logs.
               "rerun:target/rerun.txt",  //This will help us to store failed scenarios in rerun.txt file so that we
                //we can run them from FailedRunner class.
                //Rerun logic in Failed runner will help us to rerun failed scenarios after running failed scenarios from TestRunner class
                "html:target/default-cucumber-reports.html",
                "json:target/cucumber.json",


        }



)





public class FailedRunner {
}
