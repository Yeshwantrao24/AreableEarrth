package com.earth.TestScripts;

import org.testng.annotations.Test;

import com.earth.PageObject.HomePage;

public class TC_HOMEPAGE_test extends BaseClass
{
	
	@Test
   public void verifyHomePage()
   {
	   HomePage hp=new HomePage(driver);
	   hp.Home();
	   hp.menu();
	   System.out.println("successfully navigated to menu bar");
   }
}
