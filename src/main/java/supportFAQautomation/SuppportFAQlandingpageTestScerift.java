package org.Eva.supportFAQautomation;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuppportFAQlandingpageTestScerift {

	@FindBy(xpath="//img[@title='Create FAQ...']")
	private WebElement cteateFAQBT;
	
	
	
	
	public void createFaqBOTTON() {
		WebUtil.click(cteateFAQBT);
	}
	
	
}
