package com.testcases.poojastore;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.poojastore.BaseClass;
import com.pageobjects.store.Loginpage;

public class LoginTest extends BaseClass {

	static Loginpage login;
	
	
	
	public LoginTest() {
	super();
		
	}
	
	@BeforeMethod
	
	public void setup() throws Throwable{
		
		initialize();
		login=new Loginpage();
			
	}
			
	@Test
	
	public void verifyLoginpage(){
	login.Validatelogin();
		
		
	}	
	@Test 
	
	public void verifyTitle(){
	
		String title=login.Titletest();
		
		Assert.assertEquals(title, "Divine Precincts");
		
	}
	
	@AfterMethod
	
	public void teardown(){
		driver.close();
		
	}
	
}
