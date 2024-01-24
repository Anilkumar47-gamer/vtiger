package org.Eva.salesCreatePriceBook;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewCreatePriceBookPageTestScrift {

	@FindBy(xpath="//input[@name='bookname']")
	private WebElement bookname;
	
	@FindBy(xpath="//select[@name='currency_id']")
	private WebElement currency;
	
	@FindBy(xpath="//textarea[@name='detailedViewTextBox']")
	private WebElement detailedViewTextBox;
	
	
	
	public void CreateNewCreatePriceBook() {
		WebUtil.inputData(bookname, "godfather");
		WebUtil.selectByIndexNumber(currency, 0);
		WebUtil.inputData(detailedViewTextBox, "this book price is 456");
		
	}
	
	

	
}
