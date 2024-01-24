package src.org.Eva.SalesInvoiceAutomation;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesInvoiceLandingPage {

	
	@FindBy(xpath="//img[@title='Create Invoice...']")
	private WebElement InvoiceCreateBT;
	
	
	public void InvoiceCreateBT() {
		WebUtil.click(InvoiceCreateBT);
	
	}
	
	
}
