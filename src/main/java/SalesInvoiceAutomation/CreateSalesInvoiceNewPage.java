package org.Eva.SalesInvoiceAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateSalesInvoiceNewPage {

	@FindBy(xpath="//input[@name='subject']")
	private WebElement subject;
	
	@FindBy(xpath="//input[@name='customerno']")
	private WebElement customerno;
	
	@FindBy(xpath="//input[@name='exciseduty']")
	private WebElement exciseduty;
	
	@FindBy(xpath="//input[@name='vtiger_purchaseorder']")
	private WebElement purchaseorder;
	
	@FindBy(xpath="//input[@name='salescommission']")
	private WebElement salescommission;
	
	@FindBy(xpath="//input[@name='bill_pobox']")
	private WebElement billpobox;
	
	@FindBy(xpath="//input[@name='bill_city']")
	private WebElement billcity;
	
	@FindBy(xpath="//input[@name='bill_state']")
	private WebElement billstate;
	
	@FindBy(xpath="//input[@name='bill_country']")
	private WebElement billcountry;
	
	@FindBy(xpath="//input[@name='ship_pobox']")
	private WebElement shippobox;
	
	@FindBy(xpath="//input[@name='ship_city']")
	private WebElement shipcity;
	
	@FindBy(xpath="//img[@title='Products']")
	private WebElement productimg;
	
	@FindBy(xpath="//input[@name='contact_name']//following-sibling::img")
	private WebElement contactplusBT;
	
	@FindBy(xpath="//input[@name='salesorder_name']//following-sibling::img")
	private WebElement salesorderplusBT;
	
	@FindBy(xpath="//input[@name='account_name']//following-sibling::img")
	private WebElement accountplusBT;
	
	
	
}
