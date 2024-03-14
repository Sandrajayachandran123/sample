package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoit {
	ChromeDriver driver;
	 @BeforeTest
	 public void setup()
	 {
		 driver=new ChromeDriver();
	 }
	 @BeforeTest
	 public void urlload()
	 {
		 driver.get("https://www.ilovepdf.com/pdf_to_word");
		 driver.manage().window().maximize();
	 }
	 @Test
	 public void test() throws Exception
	 {
		 
		 driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();
		 Thread.sleep(5000);
		 Runtime.getRuntime().exec("\"\\Users\\soora\\Desktop\\exeee.exe\"");
	 }

}
