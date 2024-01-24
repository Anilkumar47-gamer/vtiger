package src.com.Eva.marketingLeadpage;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class createNewLeadpage {
@FindBy(xpath="//select[@name='salutationtype']")
	private WebElement tittlename;
	

@FindBy(xpath="//input[@name='firstname']")
private WebElement firstename;

@FindBy(xpath="//input[@name='lastname']")
private WebElement lastename;

@FindBy(xpath="//input[@name='company']")
private WebElement companyname;

@FindBy(xpath="//input[@name='mobile']")
private WebElement mobile;

@FindBy(xpath="//input[@name='email']")
private WebElement email;

@FindBy(xpath="//input[@name='fax']")
private WebElement fax;

@FindBy(xpath="//select[@name='leadsource']")
private WebElement leadsource;

@FindBy(xpath="//select[@name='leadstatus']")
private WebElement leadstatus;

@FindBy(xpath="//select[@name='assigned_user_id']")
private WebElement Assignto ;

@FindBy(xpath="//textarea[@name='lane']")
private WebElement streetname;

@FindBy(xpath="//input[@name=\"code\"]")
private WebElement postalcod;

@FindBy(xpath="//input[@name='city']")
private WebElement city;

@FindBy(xpath="//input[@name='state']")
private WebElement state;
	
@FindBy(xpath="//input[@name='country']")
private WebElement country;

@FindBy(xpath="//td[@colspan='3']//textarea[@class='detailedViewTextBox']")
private WebElement discriptions;

@FindBy(xpath="//img[@title='Import Leads']")
private WebElement importfileBT;

@FindBy(xpath="//img[@title='Export Leads']")
private WebElement exportfileBT;

@FindBy(xpath="//input[@name=\"userfile\"]")
private WebElement Importfilechoose;

@FindBy(xpath="//input[@title=\"Next\"]")
private WebElement importnextBT;

@FindBy(xpath="//input[@title=\"Cancel\"]")
private WebElement importcancleBT;

@FindBy(xpath="//select[@id=\"colnum0\"]")
private WebElement importselectopt;

@FindBy(xpath="//input[@class='crmbutton small save']")
private WebElement importnowBT;

@FindBy(xpath="//input[@class='crmbutton small cancel']")
private WebElement importbackBT;

@FindBy(xpath="//input[@name=\"Export\"]")
private WebElement exportnowBT;




public void formfillupleadpage() {
	WebUtil.inputData(firstename, "Expert view ");
	WebUtil.inputData(lastename, "Automation");
	WebUtil.inputData(companyname, "Eva");
	WebUtil.inputData(city, "prayagraj");
	WebUtil.inputData(country, "India");
	WebUtil.inputData(email, "asakk@gmail.com");
	WebUtil.inputData(fax, "23e3388");
	WebUtil.inputData(discriptions, "welcome to this Industry");
	WebUtil.inputData(mobile, "757557777");
	WebUtil.inputData(postalcod, "343434");
	WebUtil.inputData(state, "Uttar Pradesh");
	WebUtil.inputData(streetname, "pashchim sharira");
	WebUtil.selectByIndexNumber(Assignto, 0);
	WebUtil.selectByIndexNumber(leadsource, 2);
	WebUtil.selectByValueAttribute(leadstatus, "Contacted");
	WebUtil.selectByValueAttribute(tittlename, "mr.");
	
}
public void importlead() {
WebUtil.click(importfileBT);
WebUtil.click(Importfilechoose);
WebUtil.click(importnextBT);
WebUtil.selectByIndexNumber(importselectopt, 3);
WebUtil.click(importnowBT);

}
public void Exortlead() {
	
	WebUtil.click(exportfileBT);
	WebUtil.click(exportnowBT);
	
	
}
public void imortbackBT() {
	WebUtil.click(importbackBT);
}
public void importcancleBT() {
	WebUtil.click(importcancleBT);
}

	
}


