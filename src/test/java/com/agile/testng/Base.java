package com.agile.testng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.agile.pages.ContactPage;
import com.agile.pages.MainPage;
import com.agile.utility.OpenBrowser;
import com.agile.utility.ReusableMethods;


public class Base extends OpenBrowser  {
	
	
	ReusableMethods rm; 
	MainPage mp;
	ContactPage cp;
	
	private static final Logger log = LogManager.getLogger(Base.class);
	

	
	protected  void positiveEndToEnd() {
		log.info("Opening firefox");
		openFirefox();
		mp = new MainPage(getDriver());
		cp = new ContactPage(getDriver());
		log.info("Going to main page.");
		mp.goToMainPage();
		log.info("going to contact page");
		mp.goToContat();
		log.info("Providing name");
		cp.name();
		log.info("Providing email");
		cp.email();
		log.info("Providing message");
		cp.message();
		log.info("click on submit");
		cp.submit();
		log.info("Success message");
		log.info("closing browser");
		cp.verifySuccessMesg();
				
	}
	
	protected void negativeEndToEnd() {
		log.info("Opening firefox");
		openFirefox();
		mp = new MainPage(getDriver());
		cp = new ContactPage(getDriver());
		log.info("Going to main page.");
		mp.goToMainPage();
		log.info("going to contact page");
		mp.goToContat();
		log.info("click on submit");
		cp.submit();
		log.info("Alert message");
		cp.verifyErrorAlert();
	}
	
	
	
	

}
