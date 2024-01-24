package org.Eva.MarketingAccountpage;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class marketingAccountLandingpage {
	
@FindBy(xpath="//img[@title='Create Account...']")
private WebElement marketingaccBT;


public void MarketingaccoutLnkBT() {
	WebUtil.click(marketingaccBT);
}

}
