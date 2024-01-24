package org.Eva.salesCreatePriceBook;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesCreatePriceBookLandingpageTestScrift {

	
	@FindBy(xpath="//img[@title='Create Price Book...']")
       private WebElement CreatePriceBookBT;


	
	public void createpricebookBT() {
		WebUtil.click(CreatePriceBookBT);
	}
	
}
