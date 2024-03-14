package testng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RightandDouble {
	ChromeDriver driver;
	 @BeforeTest
	 public void setup()
	 {
		 driver=new ChromeDriver();
	 }
	 @BeforeMethod
	 public void urlload()
	 {
		 driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	 }
	 @Test
	 public void test()
	 {
		 WebElement R =driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		 Actions obj =new Actions(driver);
		 obj.contextClick(R);
		 obj.perform();
		 driver.findElement(By.xpath("//*[@id=\"authentication\"]/ul/li[1]/span")).click();
		 driver.switchTo().alert().accept();
		 /*Alert a=driver.switchTo().alert();
			String w=a.getText();
			if(w.equals("clicked: edit"))
			{
				System.out.println("pass");
				
			}
			else
			{
				System.out.println("fail");
			}
			a.accept();*/
		 WebElement D =driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		 obj.doubleClick(D);
		 obj.perform();
		 driver.switchTo().alert().accept();
		 /*Alert a=driver.switchTo().alert();
			String t=a.getText();
			if(w.equals("clicked: edit"))
			{
				System.out.println("pass");
				
			}
			else
			{
				System.out.println("fail");
			}
			a.accept();*/
		
		 
	 }

}
