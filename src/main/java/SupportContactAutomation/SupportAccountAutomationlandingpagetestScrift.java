package org.Eva.SupportContactAutomation;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SupportAccountAutomationlandingpagetestScrift {

	
	@FindBy(xpath="//img[@title='Create Account...']")
	private WebElement CreateAccount;
	
	
	
	public void CreateAccountplusbt() {
		WebUtil.click(CreateAccount);
		
		
	}
	
	
	
	
}
