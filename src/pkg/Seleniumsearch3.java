package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Seleniumsearch3 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://blazedemo.com/register");
	}
	@Test
	public void test()
	{
		driver.findElement(By.name("name")).sendKeys("Sandra");
		driver.findElement(By.name("company")).sendKeys("TCS");
		driver.findElement(By.id("email")).sendKeys("sandra@gmail.com");
		driver.findElement(By.id("password")).sendKeys("sandra");
		driver.findElement(By.id("password-confirm")).sendKeys("sandra");
		driver.findElement(By.className("register")).click();
		
	}

}
