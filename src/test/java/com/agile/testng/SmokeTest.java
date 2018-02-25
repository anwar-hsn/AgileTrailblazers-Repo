package com.agile.testng;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(com.agile.utility.Listener.class)
public class SmokeTest {
	
	Base bt ; 
	
	@Test
	public void positiveTest() {
		bt = new Base();
		bt.positiveEndToEnd();
	}
	
	@Test
	public void negativeTest() {
		bt = new Base();
		bt.negativeEndToEnd();
	}

}
