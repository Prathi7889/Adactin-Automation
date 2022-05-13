package com.stepdef;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.AdactinPageObjectManager;
import com.runner.Runner;

import io.cucumber.java.en.*;

public class BookStepDefinition {
	
	public static WebDriver driver=Runner.driver;
	BaseClass bc = new BaseClass();
	AdactinPageObjectManager apom = new AdactinPageObjectManager(driver);
	
	@Given("User enters the firstName")
	public void user_enters_the_first_name() {
		bc.implicitWait();
	bc.sendKeys(apom.getBp().getFname(), "Prathi");
	}
	
	@Given("User enters the lastName")
	public void user_enters_the_last_name() {
	
	}
	
	@Given("User enters the address")
	public void user_enters_the_address() {
	
	}
	
	@Given("User enters the creditcard number")
	public void user_enters_the_creditcard_number() {
	
	}
	
	@Given("User enters the creditcard type")
	public void user_enters_the_creditcard_type() {
	
	}
	
	@Given("User enters the creditcard expiry month")
	public void user_enters_the_creditcard_expiry_month() {
	
	}
	
	@Given("User enters the creditcard expiry year")
	public void user_enters_the_creditcard_expiry_year() {
	
	}
	
	@Given("User enters the cvv")
	public void user_enters_the_cvv() {
	
	}

	@Then("User clicks book now")
	public void user_clicks_book_now() {
	
	}

}
