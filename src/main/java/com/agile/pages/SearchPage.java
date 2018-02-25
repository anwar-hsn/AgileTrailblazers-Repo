package com.agile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.agile.utility.ReusableMethods;

public class SearchPage extends ReusableMethods {

	
	public SearchPage(WebDriver driver) {
		super(driver);
		
	}
	
	public void search() {
		SendKeys(By.id("s"), ("agile"));
	}

	public void submit() {
		Click(By.id("submit-button"));
		
	}
	
	

}
