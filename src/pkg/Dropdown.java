package pkg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
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
		WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select obj = new Select(day);
		obj.selectByIndex(04);
		WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select obj1 = new Select(month);
		obj1.selectByValue("06");
		WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select obj2 = new Select(year);
		obj2.selectByVisibleText("2024");
	    List<WebElement> elements=obj.getOptions();
	    System.out.println(elements.size());
	    List<WebElement> elements1=obj1.getOptions();
	    System.out.println(elements1.size());
	    List<WebElement> elements2=obj2.getOptions();
	    System.out.println(elements2.size());
	    
	    

	
		
	}

}
