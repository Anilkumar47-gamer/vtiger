package org.Eva.supportFAQautomation;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewSupportFAQtestPageScrift {

	@FindBy(xpath="//input[@name='product_id']//following-sibling::img")
	private WebElement productnameplusBt;
	
	@FindBy(xpath="//textarea[@name='detailedViewTextBox']")
	private WebElement detailedViewTexbQuestion;
	
	@FindBy(xpath="//textarea[@name='detailedViewTextBox'][2]")
	private WebElement detailedViewTextBox;
	
	
	public void CreatingNewFAQ() {
		WebUtil.inputData(detailedViewTexbQuestion, "is my product ready");
	WebUtil.inputData(detailedViewTextBox, "yes this is ready");
	WebUtil.click(productnameplusBt);
		
		
	}
	
	
	
	
	
	
	
	
	
}
