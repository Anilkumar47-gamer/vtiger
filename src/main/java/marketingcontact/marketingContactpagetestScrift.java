package org.Evs.marketingcontact;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class marketingContactpagetestScrift {

	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobilenum;
	
	@FindBy(xpath="//input[@name='title']")
	private WebElement title;
	
	@FindBy(xpath="//input[@name='fax']")
	private WebElement fax;
	
	@FindBy(xpath="//input[@name='mailingpobox']")
	private WebElement mailingpobox;
	
	@FindBy(xpath="//input[@name='mailingcity']")
	private WebElement mailingcity;
	
	@FindBy(xpath="//input[@name='mailingstate']")
	private WebElement mailingstate;
	

	@FindBy(xpath="//input[@name='mailingzip']")
	private WebElement mailingzip;
	
	@FindBy(xpath="//input[@name='mailingcountry']")
	private WebElement mailingcountry;
	
	@FindBy(xpath="//input[@name='othercity']")
	private WebElement othercity;
	
	@FindBy(xpath="//input[@name='otherstate']")
	private WebElement otherstate;
	
	@FindBy(xpath="//input[@name='otherzip']")
	private WebElement otherzip;
	
	@FindBy(xpath="//input[@name='othercountry']")
	private WebElement othercountry;
	
	public void marketingContact() {
		WebUtil.inputData(fax, "464gghhu");
		WebUtil.inputData(firstname, "harsha");
		WebUtil.inputData(lastname,"varyani" );
		WebUtil.inputData(mailingcity, "datia");
		WebUtil.inputData(mailingcountry, "India");
		WebUtil.inputData(mailingpobox, "yrryttr");
		WebUtil.inputData(mailingstate, "Madhya Pradesh");
		WebUtil.inputData(mailingzip, "qwerr");
		WebUtil.inputData(mobilenum, "234566777");
		WebUtil.inputData(othercity, "praygraj");
		WebUtil.inputData(othercountry, "Indai");
		WebUtil.inputData(otherstate, "Uttar pradesh");
		WebUtil.inputData(otherzip, "trrytr445");
		WebUtil.inputData(title, "mr");
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
