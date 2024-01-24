package org.Evs.marketingcontact;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class marketingContactlandingpageTestScrift {

	@FindBy(xpath="//img[@title='Create Contact...']")
	private WebElement contectcreateBT;
	
	
	public void marketingContact() {
		WebUtil.click(contectcreateBT);
	}
	
	
	
	
	
}
