package com.agile.cucumber;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Trailblazer.feature"}
		, tags =  "@Empty, @PositiveTest"
		, plugin = {"pretty", "html:target/AgileReport1", "json:target/AgileReport2"})

public class Runner {
	
	
}
