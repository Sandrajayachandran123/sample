package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitprgm2 {
 ChromeDriver driver;
 @Before
 public void setup()
 {
	 driver=new ChromeDriver();
	 driver.get("https://www.google.com");
 }
 @Test
 public void titleverification()
 {
	 String actualtitle=driver.getTitle();
	 String expectedtitle="Google123";
		if(actualtitle.equals(expectedtitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
 }
 @Test
 public void content()
 {
	 String src =driver.getPageSource();
	 if(src.contains("Gmail"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

 }
 @After
 public void end()
 {
	 driver.quit();
 }
 
}
