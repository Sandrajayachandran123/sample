package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {
	ChromeDriver driver;

	@Before
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/soora/Desktop/New%20folder/alert.html");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		driver.switchTo().alert().accept();
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Sandra");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("J");
	}

}
