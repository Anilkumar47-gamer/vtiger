package org.Eva.SalesAccount;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesAccountCreatepagetestScrift {

	@FindBy(xpath="//input[@name='accountname']")
	private WebElement accountname ;
	
	
	@FindBy(xpath="//input[@name='detailedViewTextBox']")
	private WebElement detailedViewTextBox ;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobile ;
	
	@FindBy(xpath="//input[@name='fax']")
	private WebElement fax ;
	
	@FindBy(xpath="//input[@name='tickersymbol']")
	private WebElement tickersymbol;
	@FindBy(xpath="//input[@name='email']")
	private WebElement email ;
	
	@FindBy(xpath="//input[@name='bill_pobox']")
	private WebElement bill_pobox ;
	
	@FindBy(xpath="//input[@name='bill_city']")
	private WebElement bill_city ;
	
	@FindBy(xpath="//input[@name='bill_state']")
	private WebElement bill_state ;
	
	@FindBy(xpath="//input[@name='bill_country']")
	private WebElement bill_country ;
	
	@FindBy(xpath="//input[@name='bill_code']")
	private WebElement bill_code;
	
	@FindBy(xpath="//input[@name='cpy']")
	private WebElement cpy ;
	
	@FindBy(xpath="//textarea[@name='detailedViewTextBox']")
	private WebElement detailedViewdescricption ;
	
	@FindBy(xpath="//td[@class='dvtSelectedCell']//b")
	private WebElement moreInformation ;
	
	@FindBy(xpath="//input[@name='otherphone']")
	private WebElement Otherphone ;
	
	public void SalesAccountformfilup() {
		WebUtil.inputData(accountname, "Sunanad kashyap");
		WebUtil.inputData(bill_city, "bharwari");
		WebUtil.inputData(bill_code, "212206");
		WebUtil.inputData(bill_country, "India");
		WebUtil.inputData(bill_pobox, "supper");
		WebUtil.inputData(bill_state, "Uttar pradesh");
		WebUtil.inputData(detailedViewTextBox, "your Account is ready");
		WebUtil.inputData(detailedViewdescricption, "your detailed View descricption is ready to save  ");
		WebUtil.inputData(email, "sghfhghfgh@gmail.com");
		WebUtil.inputData(fax, "gfgdh55454@");
		WebUtil.inputData(mobile, "54536766766");
		WebUtil.inputData(tickersymbol,"Star");
WebUtil.click(moreInformation);		
		WebUtil.inputData(Otherphone, "76665557979686");
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
