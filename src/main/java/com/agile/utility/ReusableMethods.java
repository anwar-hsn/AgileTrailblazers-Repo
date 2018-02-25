package com.agile.utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ReusableMethods {
	
	private WebDriver driver;
	
	
	protected ReusableMethods(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	protected void Click(By path) {
		driver.findElement(path).click();
		
	}
	
	protected void SendKeys(By path, String value) {
		driver.findElement(path).sendKeys(value);
		
		
	}
	
	protected void DropDown(int i) {
		Select s = new Select(driver.findElement(By.id("subject")));
		s.selectByIndex(i);
	}
	
	
	
	protected String getAlert(By path) {
		String alert = driver.findElement(path).getText();
		System.out.println(alert);
		return alert;
		
	}
	
	protected void quit() {
		driver.quit();
	}
	

	
	
	

}
