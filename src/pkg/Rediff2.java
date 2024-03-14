package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff2 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test()
	{
		WebElement button =driver.findElement(By.xpath("//*[@id=\"Register\"]"));
		 String buttontxt=button.getAttribute("value");
			if(buttontxt.equalsIgnoreCase("create my account >>"))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
		driver.close();
		
	}
}
