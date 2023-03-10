package Features;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	dryRun = false,//Alwase false
	monochrome=true,
	features= {"src/test/resources"},//used for java package name
	glue = {"Features"},//used for number of packages
	plugin = {"pretty","html:target/site/cucumber-html","json:target/cucumber/json"},
	tags ="@Login or @Logout "//used for number of tag 
	
		
		)
public class Runner_Junit {

}
