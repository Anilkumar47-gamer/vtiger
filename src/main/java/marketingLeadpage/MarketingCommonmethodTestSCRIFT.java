package com.Eva.marketingLeadpage;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MarketingCommonmethodTestSCRIFT {
	
	@FindBy(xpath="//input[@name=\"user_name\"]")
	private WebElement usernameTB ;
	
	@FindBy(xpath="//input[@name=\"user_password\"]")
	private WebElement userpasswordTB;
	@FindBy(xpath="//select[@name=\"login_language\"]")
	private WebElement userlanguage;
	
	@FindBy(xpath="//select[@name=\"login_theme\"]")
	private WebElement usertheame;
	
	@FindBy(xpath="//input[@alt=\"Login [Alt+L]\"]")
	private WebElement loginbutton;
	
	@FindBy(xpath="(//div[@align=\\\"center\\\"]//input[@title=\\\"Save [Alt+S]\\\"])[1]")
	private WebElement savebutton;
	
	@FindBy(xpath="//input[@title=\\\"Delete [Alt+D]\\\"]")
	private WebElement deletebutton;
	
	@FindBy(xpath="//input[@title=\"Edit [Alt+E]\"]")
	private WebElement EditBT;
	
	@FindBy(xpath="(//div[@align=\"center\\\"]//input[@title=\\\"Cancel [Alt+X]\\\"])[1]")
	private WebElement cancleBT;
	
	@FindBy(xpath="//input[@title=\\\"Duplicate [Alt+U]\\\"]")
	private WebElement DuplicateBT;

@FindBy(xpath="//input[@class='txtBox']")
private WebElement searchTBox;

@FindBy(xpath="//div[@id=\"basicsearchcolumns_real\"]//select")
private WebElement searchtextbox;

@FindBy(xpath="//input[@name='submit']")
private WebElement searchBT;

@FindBy(xpath="//img[@title=\"Open Calendar...\"]")
private WebElement calenderlnkBT;

@FindBy(xpath="//img[@title='Show World Clock...']")
private WebElement clocklnkBT;

@FindBy(xpath="//img[@title='Open Calculator...']")
private WebElement calculaterlnkBT;

@FindBy(xpath="//img[@title='Chat...']")
private WebElement massagelnkBT;

@FindBy(xpath="//img[@title=\"Search in Campaigns...\"]")
private WebElement searchlnkBT;

@FindBy(xpath="//img[@title='Open All Menu...']")
private WebElement allmenulnkBT;

@FindBy(xpath="//td[@class='searchAlph']")
private WebElement alphbetBox;

@FindBy(xpath="//tbody/tr//td[@class=\"lvtCol\"]")
private WebElement headername;

@FindBy(xpath="//input[@name=\"selected_id\"]")
private WebElement allcheakbox;

@FindBy(xpath="//input[@value=\"Mass Edit\"]")
private WebElement massEditBT;

@FindBy(xpath="//input[@id=\"158\"]")
private WebElement singlecheakbox;

@FindBy(xpath="//img[@title='Leads Settings']")
private WebElement LeadssettinglnkBT;


	
	
	
	
	public void TC001verifylogin() {
		WebUtil.inputData(usernameTB, "admin");
		WebUtil.inputData(userpasswordTB, "admin");
		//WebUtil.inputData(usertheame, "");
	WebUtil.click(loginbutton);
	}
	public void tc002verifyduplicateBT() {
		WebUtil.click(DuplicateBT);
	}
	public void tc003verifycancleBT() {
		WebUtil.click(cancleBT);
	}
	public void tc004verifyeditBT() {
		WebUtil.click(EditBT);
	}
    public void tc005verifydeletebutton() {
   WebUtil.click(deletebutton);
     }	
	public void tc006verifysavebutton() {
		WebUtil.click(savebutton);
	}
	public void tc007verifyLeadssettinglnkBT() {
		WebUtil.click(LeadssettinglnkBT);
	}
	
	public void tc008verifysinglecheakbox() {
		WebUtil.click(singlecheakbox);
	}
	public void tc009verifymassEditBT() {
		WebUtil.click(massEditBT);
	}
	public void tc010verifyallcheakbox() {
		WebUtil.click(allcheakbox);
	}
	public void tc011verifyheadername() {
		WebUtil.myFindElements("headername");
	}
	public void tc012verifyallmenulnkBT() {
		WebUtil.click(allmenulnkBT);
	}
	public void tc013verifymassagelnkBT() {
		WebUtil.click(massagelnkBT);
	}
	public void tc014verifycalculaterlnkBT() {
		WebUtil.click(calculaterlnkBT);
	}
	public void tc015verifyclocklnkBT() {
		WebUtil.click(clocklnkBT);
	}
	public void tc016verifysearchBT() {
		WebUtil.click(searchBT);
	}
	public void tc017verifycalenderlnkBT() {
		WebUtil.click(calenderlnkBT);
	}
	public void tc018verifysearchtextbox() {
		WebUtil.inputData(searchtextbox, "anil");
	}
	public void tc019verifysearchTBox() {
		WebUtil.selectByIndexNumber(searchTBox, 2);
	}
	
	}
	
	
	
	
	
	

