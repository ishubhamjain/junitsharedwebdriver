package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@CucumberOptions(
		features = {"classpath:features"} 
		, glue = "stepdef"
		,plugin = { "progress:reports/progress/progress.txt"
				,"timeline:reports/timeline" 
				,"pretty", "html:target/cucumber-default-report",
				"json:target/cucumber.json"
				//,"junit:target/cucumber-results.xml"
				,"usage:target/cucumber-usage.json"
				,"rerun:reports/rerun.txt"}
//		,tags= {"@smoke"}  // Run tests in groups
		,monochrome = true
//		,dryRun = true
		)

@RunWith(Cucumber.class)
public class RunnerIT {

}
