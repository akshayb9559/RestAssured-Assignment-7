package stepsDefinitions;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\Features", glue = { "stepDefinitions" })
public class Assertion_FutureDate_Runner extends Assertion_FutureDate_Step{

}
