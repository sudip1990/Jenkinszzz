package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

//		Mentioning from where you have to pick the feature file,  ** Basically feature file location
//		features = "classpath:features",
		features = "C:\\Users\\sudip\\eclipse-workspace\\zzz\\src\\test\\java\\features\\AddContact.feature",

//		Path of step definition
		glue = "steps",

		tags = "@End2End", // can mention which scenario to run like = @scenario2

//		display the console in readable format, when "true" it will make console look pretty readable format
		monochrome = true,

//		checking feature vs stepDefinition Mapping ***test will fail if it is not correctly mapped
		dryRun = false,

//		true=will fail if there is missing any step, false=will not fail
		strict = true,

//		Reporting format
		plugin = { "pretty", "html:target/cucumber", "json:target/cucumber.json" })
public class LoginRunner {

}
