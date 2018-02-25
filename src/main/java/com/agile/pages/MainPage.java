package com.agile.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	
	private WebDriver driver;
	
	
	
	public MainPage(WebDriver driver) {
		
		this.driver = driver;
	}

	public void goToMainPage() {
		driver.get("http://mock.agiletrailblazers.com/index.html");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	}
	
	public ContactPage goToContat() {
		driver.findElement(By.id("contact-nav")).click();
		return new ContactPage(driver);
	}
	
	public SearchPage goToSearch() {
		driver.findElement(By.id("search-nav")).click();
		return new SearchPage(driver);
	}
	
	
}
