package com.agile.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.agile.pages.MainPage;

public class OpenBrowser {
	
	private WebDriver driver;
	
			
	public WebDriver getDriver() {
		return driver;
	}

	public MainPage openFirefox() {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Anwar Hossain\\Desktop\\driver\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				
		return new MainPage(driver);
		
	}
	
	
	

}
