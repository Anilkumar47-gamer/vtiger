package org.Eva.MarketingAccountpage;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketingAccounttestscrift {

	
	@FindBy(xpath="//input[@name='accountname']")
	private WebElement accname;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@name='fax']")
	private WebElement fax;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='detailedViewTextBox']")
	private WebElement website;
	
	@FindBy(xpath="//input[@name='tickersymbol']")
	private WebElement ticketsymbol;
	
	@FindBy(xpath="//input[@name='ship_pobox']")
	private WebElement shipbox;
	
	@FindBy(xpath="//input[@name='ship_city]")
	private WebElement shipcity;
	
	@FindBy(xpath="//input[@name='ship_state']")
	private WebElement shipstate;
	
	@FindBy(xpath="//input[@name='ship_code']")
	private WebElement shipcode;
	
	@FindBy(xpath="//input[@name='ship_country']")
	private WebElement shipcountry;
	
	@FindBy(xpath="//input[@name=\"cpy\"]")
	private WebElement copybilling;
	
	@FindBy(xpath="//img[@title='Select']")
	private WebElement selectPlusBT;
	
	@FindBy(xpath="(//tr[@onmouseout=\"this.className='lvtColData'\"])[3]")
	private WebElement otherselectwindowname;
	
	
	
	
	
	
	public void formfillmarketingAccountpage() {
		
		WebUtil.inputData(accname, "anil");
		WebUtil.inputData(copybilling, "succesfull");
		WebUtil.inputData(email, "sagg@gmail.com");
		WebUtil.inputData(fax, "556fgfhfh");
		WebUtil.inputData(mobile, "955765765");
		WebUtil.inputData(shipbox, "pashchim");
		WebUtil.inputData(shipcity, "prayagraj");
		WebUtil.inputData(shipcode, "212214");
		WebUtil.inputData(shipcountry, "India");
		WebUtil.inputData(shipstate, "uttar pradesh");
		WebUtil.inputData(ticketsymbol, "lily");
		WebUtil.inputData(website, "expert view automation");
		WebUtil.click(selectPlusBT);
		WebUtil.switchToWindowByUrl("http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=");
	WebUtil.click(otherselectwindowname);
	
	
	}
	
	
}
