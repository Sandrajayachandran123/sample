package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	}
	@Test
	
	public void test()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='nav-cart-text-container']/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='nav-tools']/a[2]/div")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sandra@123");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back(); 
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[7]")).click();
		driver.findElement(By.xpath("//*[@id='nav-main']/div/a/i")).click();
		    

		
	}

}
