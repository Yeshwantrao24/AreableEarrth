package com.earth.TestScripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
	
	WebDriver driver;
	
	@BeforeMethod
	public void SetBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.arableearth.in/");
		System.out.println("successfully navigated to homepage");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
