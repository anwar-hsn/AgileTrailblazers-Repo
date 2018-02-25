package com.agile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.agile.utility.ReusableMethods;



public class ContactPage extends ReusableMethods {
	
	String expectedErrorAlert = "Please fill in the required field.";
	String expectedSuccessMessage = "Your message was sent successfully. Thanks.";
		
	public ContactPage(WebDriver driver) {
		super(driver);
		
	}

	public void name() {
		SendKeys(By.id("name"), "abc");
		
	}
	
	public void email() {
		SendKeys(By.id("email"), "ac");
	}
	
	public void mobile() {
		SendKeys(By.id("mobile"), "123");
	}
	
	public void office() {
		SendKeys(By.id("office"), "ac");
	}
	
	public void subject() {
		DropDown(1);
	}
	public void message() {
		SendKeys(By.id("message"), "ac");
	}
	
	public void submit() {
		Click(By.id("submit"));
	}
	
	
	public void verifySuccessMesg() {
		String ActualSuccessMessage =getAlert(By.id("success-message"));
		Assert.assertEquals(expectedSuccessMessage, ActualSuccessMessage);
		quit();
	}
	
	public void verifyErrorAlert() {
		String ActualErrorAlert= getAlert(By.id("error-message"));
		Assert.assertEquals(expectedErrorAlert, ActualErrorAlert);

	}
	
	
	

}
