package src.org.Eva.selesLeadspageAutomation;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import lombok.Getter;
@Getter
public class SalescreateleadpagetestScift {

	@FindBy(xpath="//select[@name='salutationtype']")
	private WebElement selecttitle;
	
	@FindBy(xpath="//input[@name='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath="//input[@name='mobile']")
	private WebElement mobile;
	
	@FindBy(xpath="//input[@name='fax']")
	private WebElement fax;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@name='company']")
	private WebElement company;
	
	@FindBy(xpath="//input[@name='designation']")
	private WebElement designtitle;
	
	@FindBy(xpath="//input[@name='city']")
	private WebElement city;
	
	@FindBy(xpath="//input[@name='state']")
	private WebElement state;
	
	@FindBy(xpath="//input[@name='country']")
	private WebElement country;
	
	@FindBy(xpath="//input[@name='code']")
	private WebElement code;
	
	@FindBy(xpath="//input[@name='pobox']")
	private WebElement pobox;
	
	@FindBy(xpath="//textarea[@name='lane']")
	private WebElement streetlane;
	
	@FindBy(xpath="//select[@name='leadsource']")
	private WebElement leadsource;
	
	@FindBy(xpath="//select[@name='leadstatus']")
	private WebElement leadstatus;
	
	@FindBy(xpath="//td[@class='dvtSelectedCell']//b")
	private WebElement moreinformation;
	
	@FindBy(xpath="//select[@name='industry']")
	private WebElement selIndustry;
	
	@FindBy(xpath="//select[@name='rating']")
	private WebElement Rating;
	
	@FindBy(xpath="//input[@name='name='annualrevenue']")
	private WebElement anualRevenue;
	
	@FindBy(xpath="//input[@class='detailedViewTextBox']")
	private WebElement website;
	
	
	public void salesleadsformfillup() {
		WebUtil.inputData(Rating, "4*3");
		WebUtil.inputData(city, "prayagraj");
		WebUtil.inputData(code, "212210");
		WebUtil.inputData(company, "expertview");
		WebUtil.inputData(country, "india");
		WebUtil.inputData(designtitle, "captainAmericashield");
		WebUtil.inputData(email, "rryt@gmail.com");
		WebUtil.inputData(fax, "etr4tr454@");
		WebUtil.inputData(firstname, "anil");
		WebUtil.inputData(lastname, "kumar");
		WebUtil.inputData(mobile, "343435325");
		WebUtil.inputData(pobox, "superr");
		WebUtil.inputData(state, "Uttar pradesh");
		WebUtil.selectedByTextContains(Rating, "mr.");
		WebUtil.selectByIndexNumber(leadstatus, 3);
		WebUtil.selectByIndexNumber(leadsource, 2);
	    WebUtil.click(moreinformation);
	    WebUtil.inputData(website, "Expert view Automation");
		WebUtil.inputData(anualRevenue, "400000");
		WebUtil.inputData(Rating, "Active");
		WebUtil.selectByIndexNumber(selIndustry, 3);
	}
	
	
	
	
}
