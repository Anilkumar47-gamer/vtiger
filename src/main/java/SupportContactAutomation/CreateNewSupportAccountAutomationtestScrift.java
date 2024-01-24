package org.Eva.SupportContactAutomation;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateNewSupportAccountAutomationtestScrift {

	@FindBy(xpath = "//input[@name='accountname']")
	private WebElement accountname;
	
	@FindBy(xpath = "//input[@name='tickersymbol']")
	private WebElement tickersymbol;
	
	@FindBy(xpath = "//input[@name='phone']")
	private WebElement phone;
	
	@FindBy(xpath = "//input[@name='fax']")
	private WebElement fax;
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@name='detailedViewTextBox']")
	private WebElement detailedViewTextBox;
	
	@FindBy(xpath = "//input[@name='bill_pobox']")
	private WebElement billpobox;
	
	@FindBy(xpath = "//input[@name='bill_city']")
	private WebElement billcity;
	
	@FindBy(xpath = "//input[@name='bill_state']")
	private WebElement billstate;
	
	@FindBy(xpath = "//input[@name='bill_code']")
	private WebElement billcode;
	
	@FindBy(xpath = "//input[@name='bill_country']")
	private WebElement billcountry;
	
	@FindBy(xpath = "//input[@name='ship_pobox']")
	private WebElement shippobox;
	
	@FindBy(xpath = "//input[@name='ship_city']")
	private WebElement shipcity;
	
	@FindBy(xpath = "//input[@name='ship_code']")
	private WebElement shipcode;
	
	@FindBy(xpath = "//input[@name='ship_country']")
	private WebElement shipcountry;
	
	
	public void createnewcontact() {
		
		WebUtil.inputData(accountname, "expert view");
		WebUtil.inputData(billcity, "prayagraj");
		WebUtil.inputData(billcode, "323234");
		WebUtil.inputData(billcountry, "india");
		WebUtil.inputData(billpobox, "etrt");
		WebUtil.inputData(billstate, "up");
		WebUtil.inputData(detailedViewTextBox, "sucessful");
		WebUtil.inputData(email, "erertd@gmail.com");
		WebUtil.inputData(fax, "srsw3d54dt");
		WebUtil.inputData(phone, "534433433");
		WebUtil.inputData(shipcity, "mp");
		WebUtil.inputData(shipcode, "53342");
		WebUtil.inputData(shipcountry, "india");
		WebUtil.inputData(shippobox, "ererdtd3");
		WebUtil.inputData(tickersymbol, "star");
		

	//String String="rtrt";
	
	}
}
