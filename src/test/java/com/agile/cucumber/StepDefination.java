package com.agile.cucumber;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.agile.pages.ContactPage;
import com.agile.pages.MainPage;
import com.agile.pages.SearchPage;
import com.agile.utility.OpenBrowser;
import com.agile.utility.ReusableMethods;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefination {
	Properties prop = new Properties();
	WebDriver driver;
	ReusableMethods rs;
	OpenBrowser op ;
	MainPage mp;
	ContactPage cp;
	SearchPage sp;
	
	


	@Given("^I am at HomePage$")
	public void i_go_to_the_URL() throws Exception {
		op = new OpenBrowser();
		mp=op.openFirefox();
		mp.goToMainPage();
	}

@When("^I click on contact us$")
public void click_on_contact_us() throws Exception {
   cp= mp.goToContat();
}

@When("^I provide Name$")
public void i_provide_Name() {
    cp.name();
   
}

@When("^I provide valid Email$")
public void i_provide_valid_Email() {
	cp.email();
}
    

@When("^I provide valid Mobile phone number$")
public void i_provide_valid_Mobile_phone_number(){
	 cp.mobile();
   
}

@When("^I provide valid Office phone number$")
public void i_provide_valid_Office_phone_number()  {
	 cp.office();
}

@When("^I select subject from dropdown menu$")
public void i_select_subject_from_dropdown_menu() {
   cp.subject();
   
}

@When("^I write the message$")
public void i_write_the_message() {
	cp.message();
    
}

@Then("^I click sumbit button$")
public void i_click_sumbit_button() {
    cp.submit();
}

@Then("^I get the confirmation message$")
public void i_get_the_confirmation_message() {
   cp.verifySuccessMesg();
}


@Then("^I get the Error alert message$")
public void i_get_the_Error_alert_message()  {
    cp.verifyErrorAlert();
}



@Given("^click on search$")
public void click_on_search() throws Exception {
   sp=mp.goToSearch();
}

@When("^I provide query$")
public void i_provide_query() throws Exception {
    sp.search();
}

@Then("^click search button$")
public void click_search_button() throws Exception {
  sp.submit();
}


@Then("^I get the result$")
public void i_get_the_result() throws Exception {
	System.out.println("Search page");
    
}

	
}
