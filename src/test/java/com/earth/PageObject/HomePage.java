package com.earth.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public static WebDriver driver;
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//span[.='☰ ']")
	WebElement hmpage;
	
	public void Home() throws InterruptedException
	{
		Thread.sleep(2000);
		hmpage.click();
		
	}
	
	@FindBy(linkText ="Home")
	WebElement hmlink;
	
	
	public void menu() throws InterruptedException
	{
		Thread.sleep(2000);
		hmlink.click();
		driver.navigate().back();
	}
	
	@FindBy(linkText = "Cultivate Bamboo")
	WebElement  hmclink;
	
	public void cultivate() throws InterruptedException
	{
		Thread.sleep(2000);
		hmclink.click();
		driver.navigate().back();
	}
	

}
