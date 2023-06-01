package com.orangeHRM.testcase;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;

import com.automation.base.OrangeHRMLoginPage;

public class Loginpage {
	
	OrangeHRMLoginPage lp;
	
	
	@BeforeMethod
	
	public void browserSetup() {
		
		lp = new OrangeHRMLoginPage();
		lp.login();
				
	}
	
	
	
	@Test
	 
	private void leaveListValidation() {
		String ActuTitel = lp.LeaveList();
		String ExptTitel = "LeaveList";
		Assert.assertEquals(ExptTitel, ActuTitel);	

	}
	
	
}
