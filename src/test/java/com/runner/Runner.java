package com.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src//test//java//com//feature", glue = "com\\stepdef", dryRun= false)

public class Runner {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
	driver = BaseClass.browserLaunch("Chrome");
	}
	
}
