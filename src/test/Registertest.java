package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Registerpage;

public class Registertest {
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		 driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://blazedemo.com/register");
	}
	@Test(priority=1)
	public void test()
	{
		Registerpage obj =new Registerpage(driver);
		obj.setvalues("abc", "def", "ghi@123", "123", "123");
		obj.click();
		driver.navigate().back();
		
	}
	@Test (priority=2)
	public void test2()
	{
		Registerpage obj1 =new Registerpage(driver);
		obj1.setvalue2("ghi@123", "123");
		obj1.click2();
	}
	

}
