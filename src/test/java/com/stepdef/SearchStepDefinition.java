package com.stepdef;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.pom.AdactinPageObjectManager;
import com.runner.Runner;

import io.cucumber.java.en.*;

public class SearchStepDefinition {

	public static WebDriver driver= Runner.driver;
	
	BaseClass bc = new BaseClass();
	AdactinPageObjectManager apom= new AdactinPageObjectManager(driver);
	
	@Given("User want to select location")
	public void user_want_to_select_location() {
	bc.select(apom.getSp().getLocation(), "London");
	}
	
	@Given("User want to select hotels")
	public void user_want_to_select_hotels() {
	bc.select(apom.getSp().getHotels(), "Hotel Sunshine");	
	}
	
	@Given("User want to select room type")
	public void user_want_to_select_room_type() {
	bc.select1(apom.getSp().getRoom(), "Double");
	}
	
	@Given("User want to select number of rooms")
	public void user_want_to_select_number_of_rooms() {
	bc.select(apom.getSp().getNumber(), "2");
	}
	
	@Given("User want to select checkIn date")
	public void user_want_to_select_check_in_date() {
	bc.sendKeys(apom.getSp().getCheckin(), "10/05/2022");
	}
	
	@Given("User want to select checkOut date")
	public void user_want_to_select_check_out_date() {
	bc.sendKeys(apom.getSp().getCheckout(), "12/05/2022");
	}
	
	@Given("User want to select Adults per room")
	public void user_want_to_select_adults_per_room() {
	bc.select(apom.getSp().getAdultroom(), "2");
	}
	
	@Given("User want to select children per room")
	public void user_want_to_select_children_per_room() {
	bc.select(apom.getSp().getChildroom(), "2");
	}
	
	@Then("User validates search")
	public void user_validates_search() {
	bc.click(apom.getSp().getSubmit());
	}

}
