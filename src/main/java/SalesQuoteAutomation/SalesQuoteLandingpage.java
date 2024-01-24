package org.Evs.SalesQuoteAutomation;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalesQuoteLandingpage{

@FindBy(xpath="//img[@title='Create Quote...']")
private WebElement createQuote;



public void SalesQuoteCreateBT() {
	WebUtil.click(createQuote);
}



}
