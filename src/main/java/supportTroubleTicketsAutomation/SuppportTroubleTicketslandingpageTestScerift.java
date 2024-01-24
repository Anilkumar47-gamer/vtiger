package org.Eva.supportTroubleTicketsAutomation;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SuppportTroubleTicketslandingpageTestScerift {

	
	@FindBy(xpath="//img[@name='Create Trouble Tickets...']")
	private WebElement TroubleTickets; 
	
	public void TroubleTickets() {
		WebUtil.click(TroubleTickets);
	}
	
	
}
