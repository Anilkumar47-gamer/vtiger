package org.Eva.SalesDocuments;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesDocumentslandingpageTestScrift {

	@FindBy(xpath="//img[@title='Create Document...']")
	private WebElement documentBT;
	
	
	public void CreateDocumentBT() {
		WebUtil.click(documentBT);
	}
	
	
	
	
}
