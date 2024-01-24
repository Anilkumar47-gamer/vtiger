package org.Eva.selesLeadspageAutomation;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class selesLeadsLandingpageAutomation {

	@FindBy(xpath="//img[@title='Create Lead...']") 
	private WebElement createleadspage;
	
	public void createleads() {
		WebUtil.click(createleadspage);
	}
	
	
	 
}
