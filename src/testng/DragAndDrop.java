package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDrop {
	ChromeDriver driver;
	 @BeforeTest
	 public void setup()
	 {
		 driver=new ChromeDriver();
	 }
	 @BeforeTest
	 public void urlload()
	 {
		 driver.get("https://demoqa.com/droppable");
	 }
	 @Test
	 public void test()
	 {
		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		Actions obj =new Actions(driver);
		obj.dragAndDrop(drag, drop);
		obj.perform();
		String test=drop.getText();
		if(test.equalsIgnoreCase("Dropped!"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	 }

}
