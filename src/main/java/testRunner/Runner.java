package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;



@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\QA\\cucumber_workspace\\CucumberPOM\\src\\main\\java\\com\\qa\\features\\CRM.feature"},//the path of the feature files
		glue={"com/qa/stepDefination"},
		plugin = {"pretty", "html:test-outout.html","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		//ask for strict
		monochrome=true,  //generate the good outputs in the console (redable formate without unknown numbers)
		dryRun=false
		//tags= "@SmokeTest"
		//step Defination proper methods are defined or not without opening the browser (true)
		)

public class Runner {

}
