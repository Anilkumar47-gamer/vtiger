package org.EvsSalesSales_OrderAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewSalesOrderpage {
	
@FindBy(xpath="//input[@name='subject']")
private WebElement subjectname;

@FindBy(xpath="//input[@name='customerno']")
private WebElement customerno;

@FindBy(xpath="//input[@name='vtiger_purchaseorder']")
private WebElement purchaseorder;

@FindBy(xpath="//input[@name='pending']")
private WebElement pending;

@FindBy(xpath="//input[@name='salescommission']")
private WebElement salescommission;

@FindBy(xpath="//input[@name='exciseduty']")
private WebElement exciseduty;

@FindBy(xpath="//input[@name='bill_pobox']")
private WebElement bill_pobox;

@FindBy(xpath="//input[@name='bill_city']")
private WebElement bill_city;

@FindBy(xpath="//input[@name='bill_state']")
private WebElement bill_state;

@FindBy(xpath="//input[@name='bill_code']")
private WebElement bill_code;

@FindBy(xpath="//input[@name='ship_pobox']")
private WebElement ship_pobox;

@FindBy(xpath="//input[@name='ship_code']")
private WebElement ship_code;

@FindBy(xpath="//input[@name='ship_state']")
private WebElement ship_state;

@FindBy(xpath="//textarea[@name='bill_street']")
private WebElement billingstreetadd;

@FindBy(xpath="//textarea[@name='ship_street']")
private WebElement ship_street;

@FindBy(xpath="//input[@name='account_name']//following-sibling::img")
private WebElement accountnameplusBT;

@FindBy(xpath="//input[@name='quote_name']//following-sibling::img")
private WebElement quatenameplusBT;

@FindBy(xpath="//input[@name='contact_name']//following-sibling::img")
private WebElement contactnameplusBT;

@FindBy(xpath="//select[@name='carrier']")
private WebElement carrierselect;

@FindBy(xpath="//select[@name='sostatus']")
private WebElement status;

@FindBy(xpath="//select[@name='assigned_user_id']")
private WebElement userradioBT;

@FindBy(xpath="//a[text()='Prod_Quote']")
private WebElement quatewindow;

@FindBy(xpath="//a[text()='ak47 anil kumar']")
private WebElement contactwindo;

@FindBy(xpath="//a[text()='demovtiger - 1000 units']")
private WebElement potentailwindow;

@FindBy(xpath="//a[text()='ANIL mottto']")
private WebElement Accountwindow;




















}
