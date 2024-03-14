package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpage;
import page.Fbloginpage2;

public class Fblogintest2 {
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
		Fbloginpage2 obj = new Fbloginpage2(driver);
		obj.setvalue("abc@123", "1234");
		obj.login();
	}

}
