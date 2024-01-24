package org.Evs.SalesPotentialsAutomation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewCreatepotentialFormfillup {

	@FindBy(xpath="//input[@name='potentialname']")
	private WebElement potentailname;
	
	
	@FindBy(xpath="//input[@name='amountnextstep']")
	private WebElement amount;
	
	@FindBy(xpath="//input[@name='nextstep']")
	private WebElement nextstep;
	
	@FindBy(xpath="//input[@name='probability']")
	private WebElement probability;
	
	@FindBy(xpath="//textarea[@name='description']")
	private WebElement description;
	
	@FindBy(xpath="//img[@title='Select'][1]")
	private WebElement reletedto;
	
	@FindBy(xpath="//tr[@class='lvtColDataHover']")
	private WebElement otherwinname;
	
	@FindBy(xpath="//select[@name='sales_stage']")
	private WebElement salesStage;
	
	
	
	
	public void potentailformfill() {
		
		
		
	}
	
	
	
	
	
	
	
	
}
