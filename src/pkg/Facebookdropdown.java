package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdropdown {
	ChromeDriver driver;

	@Before
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		WebElement day=driver.findElement(By.xpath("//*[@id=\"day\"]"));
		Select s=new Select(day);
		s.selectByIndex (03);
		List<WebElement> countday= s.getOptions();
		System.out.println("day count : "+countday.size());
		
		WebElement month=driver.findElement(By.xpath("//*[@id=\"month\"]"));
		Select ob=new Select(month);
		ob.selectByIndex (03);
		List<WebElement> countmonth= ob.getOptions();
		System.out.println("month count : "+countmonth.size());
		
		WebElement year=driver.findElement(By.xpath("//*[@id=\"year\"]"));
		Select ob1=new Select(year);
		ob1.selectByIndex (03);
		List<WebElement> countyear= ob1.getOptions();
		System.out.println("year count : "+countyear.size());
		
		driver.close();
	
		

}
}
