package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPOM {

	public static WebDriver driver;
	
	@FindBy(id="radiobutton_0")
	private WebElement button;
	
	@FindBy(id="continue")
	private WebElement cont;

	public SelectPOM(WebDriver driver4) {
		this.driver=driver4;
		PageFactory.initElements(driver4, this);
	
	}
	
	public WebElement getButton() {
		return button;
	}
	
	public WebElement getContinue() {
		return cont;
	}
}
