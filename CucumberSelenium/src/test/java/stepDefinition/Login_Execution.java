package stepDefinition;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import baseactions.WebMethods;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import dataProvider.ReadExcel;
import pageFactory.DashboardElements;
import pageFactory.LoginElements;
import testcases.Login_cases;

public class Login_Execution {
	 static WebDriver driver;	
	
	 public Login_Execution() {
		 driver = Hooks.driver;
	 }
	
	@Given("^User launch the URL$")
	public void user_launch_the_URL() throws Throwable {
	  Login_cases login = new Login_cases();
	  login.url_launch();
	  
	}

	@When("^User enter credentials1$")
	public void user_enter_credentials1() throws Exception {
		  Login_cases login = new Login_cases();
		  login.pass_credentials_using_excel();
		}
	
	@When("^User enter credentials$")
	public void user_enter_credentials(DataTable data) throws Throwable {
		 Login_cases login = new Login_cases();
	    List<List<String>> value = data.raw();
	    login.pass_credentials_using_datatable(value);
	

	}
	
	@When("^User enter credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enter_credentials_and(String uname, String pwd) throws Throwable {
		  Login_cases login = new Login_cases();
		  login.pass_credentials_using_outline(uname, pwd);


	}

	@When("^User login$")
	public void user_login() throws Throwable {
		  Login_cases login = new Login_cases();
		  login.click_login();

	}

	@Then("^Validate the user login$")
	public void validate_the_user_login() throws Throwable {
		  Login_cases login = new Login_cases();
		  login.validate_login();		
	}

}
