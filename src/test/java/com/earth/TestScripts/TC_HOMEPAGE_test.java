package com.earth.TestScripts;

import org.testng.annotations.Test;

import com.earth.PageObject.HomePage;

public class TC_HOMEPAGE_test extends BaseClass
{
	
	@Test
   public void verifyHomePage() throws InterruptedException
   {
	   HomePage hp=new HomePage(driver);
	   hp.Home();
	   hp.menu();
	   System.out.println("successfully navigated to menu bar");
	   hp.cultivate();
	   System.out.println("successfully navigated to cultivate page");
	   hp.meetfounder();
	   System.out.println("successfully navigated to founder page");
	   hp.InvestBamboo();
	   System.out.println("successfully navigated to invest bamboo");
	   hp.FAQ();
	   System.out.println("successfully navigated to FAQ");
	   hp.ourVision();
	   System.out.println("successfully navigated to our vision");
   }
   }
   

