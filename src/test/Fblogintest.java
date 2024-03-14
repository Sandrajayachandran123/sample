package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpage;

public class Fblogintest {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		 driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://www.Facebook.com");
	}
	@Test
	public void test()
	{
		Fbloginpage obj = new Fbloginpage(driver);
		obj.setvalues("abc@123", "1234");
		obj.login();
		
	}
	

}
