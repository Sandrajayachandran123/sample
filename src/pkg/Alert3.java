package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert3 {
	ChromeDriver driver;

	@Before
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.findElement(By.xpath("//*[@id=\"confirmButton\"]")).click();
		Alert a=driver.switchTo().alert();
		String w=a.getText();
		if(w.equals("Do you confirm action?"))
		{
			System.out.println("pass");
			
		}
		else
		{
			System.out.println("fail");
		}
		a.accept();

}
}
