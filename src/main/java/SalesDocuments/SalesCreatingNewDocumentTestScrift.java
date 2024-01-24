package org.Eva.SalesDocuments;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesCreatingNewDocumentTestScrift {

	
	@FindBy(xpath="//input[@name='notes_title']']")
	private WebElement notetitleTb;
	
	@FindBy(xpath="//select[@name='assigned_user_id']")
	private WebElement userradioBT;
	
	@FindBy(xpath="//input [@name='filename']")
	private WebElement filenameTb;
	
	@FindBy(xpath="//input[@name='fileversion']")
	private WebElement fileversionTB;
	
	
	public void SalesCreatingNewDocument() {
		WebUtil.inputData(filenameTb, "EXPERT VIEW AUTOMATION");
		WebUtil.inputData(fileversionTB, "latest");
		WebUtil.inputData(notetitleTb, "testngBook");
		WebUtil.selectByIndexNumber(filenameTb, 1);
		
		
		
	}
	
	
	
	
	
	
	
}
