package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windowhandle {
	ChromeDriver driver;
	 @BeforeTest
	 public void setup()
	 {
		 driver=new ChromeDriver();
	 }
	 @BeforeTest
	 public void urlload()
	 {
		 driver.get("http://demo.guru99.com/popup.php");
		 driver.manage().window().maximize();
	 }
	 @Test
	 public void test()
	 {
		 String parenthandle=driver.getWindowHandle();
		 driver.findElement(By.xpath("/html/body/p/a")).click();
		 Set<String> childhandle = driver.getWindowHandles();
		 for(String allwindowhandle:childhandle)
		 {
			 if(!allwindowhandle.equalsIgnoreCase(parenthandle))
			 {
				 driver.switchTo().window(allwindowhandle);
				 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("sandra@123");
				 driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input"));
				 driver.close();
			 }
			 driver.switchTo().window(parenthandle);
			 
		 }
		 //driver.switchTo().window(parenthandle);
		 //WebDriver driver1=driver.switchTo().newWindow(WindowType.TAB);
		 
		 WebDriver driver1=driver.switchTo().newWindow(WindowType.WINDOW);
		 driver1.get("https://www.google.com");
	 }

}
