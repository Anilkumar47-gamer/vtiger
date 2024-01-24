package org.Evs.SalesPotentialsAutomation;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesPotentialsLandingPageAutomation {

	@FindBy(xpath="//img[@title='Create Potential...']")
	private WebElement createpotentialBt;
	
   public void potentialcreateBT() {
	   WebUtil.click(createpotentialBt);
   }
	
	
}
