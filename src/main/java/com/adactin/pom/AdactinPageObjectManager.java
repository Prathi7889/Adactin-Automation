package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AdactinPageObjectManager {

	public static WebDriver driver;
	
	public AdactinPageObjectManager(WebDriver driver8) {
	this.driver=driver8;
	PageFactory.initElements(driver8, this);
	}
	
	private LoginPOM lp;

	public LoginPOM getLp() {
		lp=new LoginPOM(driver);
		return lp;
	}
	
	private SearchPOM sp;

	public SearchPOM getSp() {
		sp=new SearchPOM(driver);
		return sp;
	}
	
	private SelectPOM sep;
	
	public SelectPOM getSEp() {
		sep=new SelectPOM(driver);
		return sep;
	}
	
	private BookPOM bp;

	public BookPOM getBp() {
		bp=new BookPOM(driver);
		return bp;
	}
	
	}

