package com.Eva.marketingLeadpage;

import org.Eva.allGenericMethod.WebUtil;
import org.openqa.selenium.support.PageFactory;

public class RUNNERLEADPAGE {

	public static void main(String[] args) {
		WebUtil.launchbrowser();
		WebUtil.openUrl("http://localhost:8888/");
		MarketingCommonmethodTestSCRIFT cc= PageFactory.initElements(WebUtil.driver,MarketingCommonmethodTestSCRIFT.class );
	cc.TC001verifylogin();
	marketingLeadsLandingpageTestScrift  ml=new marketingLeadsLandingpageTestScrift();
	ml.tc021OpenmarketingLeads();
	ml.tc020leadsCeratebutton();
	}

}
