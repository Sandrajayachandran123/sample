package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazoneAssignment2{
	ChromeDriver driver;
	@BeforeTest
	 public void setup()
	 {
		 driver=new ChromeDriver();
	 }
	 @BeforeMethod
	 public void urlload()
	 {
		 driver.get("https://www.amazon.in");
		 driver.manage().window().maximize();
	 }
	 @Test
	 public void test() throws Exception
	 {
		 
		 String parent= driver.getWindowHandle();
		 driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile phone",Keys.ENTER);
		 String s= driver.getTitle();
			System.out.println(s);
			if(s.equals("Amazon.in : mobile phone"))
			{
			    System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}

		
		 driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		 Set<String> child = driver.getWindowHandles();
		 for(String handle:child)
		 {
			 if(!handle.equalsIgnoreCase(parent))
			 {
				 driver.switchTo().window(handle);
				 JavascriptExecutor js=(JavascriptExecutor) driver;
				 js.executeScript("window.scrollBy(0,700)", "");
				 driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/div[8]/div[8]/div/div[1]/div/div[1]/div/div/div[2]/div/div[2]/div/form/div/div/div[37]/div[1]/span/span/span/input")).click();
				 Thread.sleep(5000);
				 driver.findElement(By.xpath("/html/body/div[10]/div[3]/div[3]/div/div[1]/div[3]/div[1]/div[2]/div[3]/form/span/span/input")).click();
					 
				
			 }
			 
			 
		 }
	 }

}
