package com.Eva.marketingLeadpage;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class marketingLeadsLandingpageTestScrift {

@FindBy(xpath="//img[@title='Create Lead...']")
private WebElement leadcreatebutton;


	public void tc020leadsCeratebutton() {
		WebUtil.click(leadcreatebutton);
	}
	
	
	public void tc021OpenmarketingLeads() {
		WebUtil.linktext("Marketing", "Leads");
	}
	
	
	
}
