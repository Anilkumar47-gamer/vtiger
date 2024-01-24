package org.Eva.supportTroubleTicketsAutomation;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewSuppportTroubleTicketpageTestScerift {

	@FindBy(xpath="//textarea[@name='ticket_title']")
	private WebElement tickettitleTB;
	
	
	@FindBy(xpath="//input[@name='hours']")
	private WebElement hoursTB;
	
	@FindBy(xpath="//input[@name='days']")
	private WebElement daysTB;
	
	
	@FindBy(xpath="//select[@name='ticketstatus']")
	private WebElement ticketstatus;
	
	@FindBy(xpath="//select[@name='assigned_user_id']")
	private WebElement assigneduseid;
	
	@FindBy(xpath="//select[@name='ticketseverities']")
	private WebElement ticketseverities;
	
	
	public void suppurttroubleticket() {
		WebUtil.inputData(daysTB, "monday");
		WebUtil.inputData(hoursTB, "6");
		WebUtil.inputData(tickettitleTB, "dfgfgh");
		WebUtil.selectByIndexNumber(assigneduseid, 1);
		WebUtil.selectByIndexNumber(ticketstatus, 2);
		WebUtil.selectByIndexNumber(ticketseverities, 2);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
