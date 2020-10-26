package stepsDefinitions;

import org.junit.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assertion_FutureDate_Step {

	Response response;
	
	@Test
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() {
		RestAssured.baseURI = "https://api.ratesapi.io";
	}

	@Test
	@When("posted with the future date information")
	public void posted_with_the_future_date_information() {
		response = RestAssured.get("/api/18-08-2020");
	}

	@Test
	@Then("validate positive response code received")
	public void validate_positive_response_code_received() {
		System.out.println("Status Code is: " + response.getStatusCode());
		System.out.println("Status Line is: "+response.getStatusLine());
		
		int statusCode = response.getStatusCode();
		Assert.assertEquals(400, statusCode);
		
		Assert.assertTrue(statusCode==400);
		
		Assert.assertFalse(statusCode!=400);
		
		String statusLine = response.getStatusLine();
		Assert.assertEquals("HTTP/1.1 400 Bad Request", statusLine);	
	}
}
