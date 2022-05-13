package com.adactin.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookPOM {
	
	public static WebDriver driver;
	
	public BookPOM(WebDriver drive5) {
		this.driver=drive5;
		PageFactory.initElements(drive5, this);
	}
	
	@FindBy(id="first_name")
	private WebElement fname;
	
	@FindBy(id="last_name")
	private WebElement lname;
	
	@FindBy(id="address")
	private WebElement billaddress;
	
	@FindBy(id="cc_num")
	private WebElement cardnum;
	
	@FindBy(id="cc_type")
	private WebElement cardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement cardmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement cardyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cardcvv;
	
	@FindBy(id="book_now")
	private WebElement book;

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getBilladdress() {
		return billaddress;
	}

	public WebElement getCardnum() {
		return cardnum;
	}

	public WebElement getCardtype() {
		return cardtype;
	}

	public WebElement getCardmonth() {
		return cardmonth;
	}

	public WebElement getCardyear() {
		return cardyear;
	}

	public WebElement getCardcvv() {
		return cardcvv;
	}

	public WebElement getBook() {
		return book;
	}
	
}
