package testng;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload2 {
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
		 fileUpload("\"C:\\Users\\soora\\Documents\\SANDRA . JCV.pdf\"");
	 }
	 public void fileUpload(String P) throws Exception
	 {
		 StringSelection strSelection= new StringSelection(P);
		 Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strSelection, null);
		 Robot robot=new Robot();
		 robot.delay(5000);
		 robot.keyPress(KeyEvent.VK_CONTROL);
		 robot.keyPress(KeyEvent.VK_V);
		 robot.keyRelease(KeyEvent.VK_CONTROL);
		 robot.keyRelease(KeyEvent.VK_V);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyRelease(KeyEvent.VK_ENTER);
		 
	 }


}
