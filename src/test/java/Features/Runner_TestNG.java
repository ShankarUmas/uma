package Features;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		dryRun = false,//Alwase false
		monochrome=true,
		features= {"src/test/resources"},//used for java package name
		glue = {"Features"},//used for number of packages
		plugin = {"pretty","html:target/site/cucumber-html","json:target/cucumber/json"},
		tags = {@LookingForMMAGym}//used for number of tag 
)
public class Runner_TestNG extends AbstractTestNGCucumberTests{

}
