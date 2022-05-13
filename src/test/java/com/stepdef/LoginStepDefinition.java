package com.stepdef;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.AdactinPageObjectManager;
import com.adactin.pom.LoginPOM;
import com.runner.Runner;

import io.cucumber.java.en.*;

public class LoginStepDefinition {

	public static WebDriver driver= Runner.driver;
	
	BaseClass bc = new BaseClass();
	AdactinPageObjectManager apom = new AdactinPageObjectManager(driver);
	
	
	@Given("User want to launch hotel application")
	public void user_want_to_launch_hotel_application() {
	driver.get("https://adactinhotelapp.com");
	}
	
	
	@When("User enter the valid username")
	public void user_enter_the_valid_username() {
	bc.sendKeys(apom.getLp().getUsername(), "Prathibha7");
	}
	
	
	@When("User enter the valid password")
	public void user_enter_the_valid_password() {
	bc.sendKeys(apom.getLp().getPassword(), "Thanvika");
	}
	
	
	@Then("User validates the login")
	public void user_validates_the_login() {
	bc.click(apom.getLp().getLogin());
	}

	
	
}
