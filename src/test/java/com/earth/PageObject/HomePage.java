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
	WebElement  hmcultilink;
	
	public void cultivate() throws InterruptedException
	{
		Thread.sleep(2000);
		hmcultilink.click();
		driver.navigate().back();
	}
	
	@FindBy(xpath =   "//a[.='Meet the Founder']")
	WebElement meetfounderlink;
	
	public void meetfounder() throws InterruptedException
	{ 
		Thread.sleep(2000);
		meetfounderlink.click();
		driver.navigate().back();
	}
	
	@FindBy(xpath = "//a[.='Invest Bamboo']")
	WebElement investbamboo;
	
	public void InvestBamboo() throws InterruptedException
	{
		Thread.sleep(2000);
		investbamboo.click();
		driver.navigate().back();
	
	
		
	}
	@FindBy(xpath = "(//a[.='FAQ'])[1]")
	WebElement faqlink;
	
	public void FAQ() throws InterruptedException
	{
		Thread.sleep(2000);
		faqlink.click();
		driver.navigate().back();
	
	
	
	}
	@FindBy(xpath = "//a[.='Our Vision']")
	WebElement vissionlink;
	
	public void   ourVision() throws InterruptedException
	{
		Thread.sleep(2000);
		vissionlink.click();
		driver.navigate().back();
		
	}
		@FindBy(xpath = "(//a[.='About Bamboo'])[1]")
		WebElement aboutlink;
		
		public void   aboutbamboo() throws InterruptedException
		{
			Thread.sleep(2000);
			aboutlink.click();
			driver.navigate().back();
	
	
}
		@FindBy(xpath = "(//a[.='Promote Us'])[1]")
		WebElement promotlink;
		
		public void   PromoteUs() throws InterruptedException
		{
			Thread.sleep(2000);
			promotlink.click();
			driver.navigate().back();
}
		@FindBy(xpath = "(//a[.='Blog'])[1]")
		WebElement bloglink;
		
		public void  Blog() throws InterruptedException
		{
			Thread.sleep(2000);
			bloglink.click();
			driver.navigate().back();
}
		@FindBy(xpath = "(//a[.='Contact Us'])[1]")
		WebElement contectlink;
		
		@FindBy(id="name1")
		WebElement namelink;
		@FindBy(id="email")
		WebElement emlink;
		@FindBy(xpath = "//input[@placeholder='Enter number']")
		WebElement  phonelink;
		@FindBy(xpath = "//input[@id='subject']")
		WebElement  sublink;
		@FindBy(xpath = "//textarea[@placeholder='Your Message: ']")
		WebElement  messlink;
		
		@FindBy(xpath = "//button[.='Send Message']")
		WebElement buttonlink;
		
		
		
		public void  ContactUs() throws InterruptedException
		{
			Thread.sleep(4000);
			contectlink.click();
			//driver.navigate().back();
			
			namelink.sendKeys("yeshwantrao");
			emlink.sendKeys("yesh@gmail.com");
			phonelink.sendKeys("1234567890");
			sublink.sendKeys("Arebelearth");
			messlink.sendKeys("I need to purchace bamboo chairs");
			Thread.sleep(2000);
			buttonlink.click();
			
			
}
}
