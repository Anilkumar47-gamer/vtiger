package org.Evs.SalesQuoteAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesQuoteformfillup {

	@FindBy(xpath="//input[@name='subject']")
	private WebElement subjectname;
	
	@FindBy(xpath="//input[@name='shipping']")
	private WebElement shipping;

	@FindBy(xpath="//input[@name='bill_pobox']")
	private WebElement billpobox;

	@FindBy(xpath="//input[@name='bill_city']")
	private WebElement billcity;

	@FindBy(xpath="//input[@name='bill_state']")
	private WebElement billstate;

	@FindBy(xpath="//input[@name='bill_code']")
	private WebElement billcode;

	@FindBy(xpath="//input[@name='bill_country']")
	private WebElement billcountry;

	@FindBy(xpath="//textarea[@name='bill_street']")
	private WebElement streetAdd;

	@FindBy(xpath="//input[@onclick='return copyAddressRight(EditView)']")
	private WebElement copybilling;

	@FindBy(xpath="//img[@title='Products']")
	private WebElement product;
	
	
	
	
	
	
	
	
	
}
