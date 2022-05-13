package com.stepdef;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.AdactinPageObjectManager;
import com.runner.Runner;

import io.cucumber.java.en.*;

public class SelectStepDefinition {
	public static WebDriver driver=Runner.driver;
	
	BaseClass bc= new BaseClass();
	AdactinPageObjectManager apom = new AdactinPageObjectManager(driver);
	
	@Given("User select hotel name")
	public void user_select_hotel_name() {
	bc.radiobutton(apom.getSEp().getButton());	
	}
	
	@Then("User clicks continue")
	public void user_clicks_continue() {
	bc.click(apom.getSEp().getContinue());
	}
	
}
