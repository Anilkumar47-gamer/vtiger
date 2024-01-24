package org.Eva.SalesAccount;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class salesAccountLandingpagetestScrift {

	@FindBy(xpath="//img[@title='Create Account...']")
	private WebElement salesacccreateBt;
	
	
	public void salescreatebutton() {
		WebUtil.click(salesacccreateBt);
	}
}
