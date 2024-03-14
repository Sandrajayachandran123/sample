package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	ChromeDriver driver;
	 @BeforeTest
	 public void setup()
	 {
		 driver=new ChromeDriver();
	 }
	 @BeforeTest
	 public void urlload()
	 {
		 driver.get("http://demo.guru99.com/test/upload");
		 driver.manage().window().maximize();
	 }
	 @Test
	 public void test()
	 {
		 driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("C:\\Users\\soora\\Documents");
		 driver.findElement(By.xpath("//*[@id=\"terms\"]")).click();
		 driver.findElement(By.xpath("//*[@id=\"submitbutton\"]")).click();
	 }
	 

}
