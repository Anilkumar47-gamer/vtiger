package org.EvsSalesSales_OrderAutomation;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sales_SalesOrderlandingpage {

	
	@FindBy(xpath="//img[@title='Sales Order']")
	private WebElement salesorderCreateBT;
	
	public void salesorderBT() {
		WebUtil.click(salesorderCreateBT);
	}
	
	
	
}
