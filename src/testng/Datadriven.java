package testng;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datadriven {
	ChromeDriver driver;
	 @BeforeTest
	 public void setup()
	 {
		 driver=new ChromeDriver();
	 }
	 @BeforeMethod
	 public void urlload()
	 {
		 driver.get("https://www.Facebook.com");
	 }
	 @Test
	 public void test() throws Exception
	 {
		 File f =new File("C:\\Users\\soora\\Documents\\data1.xlsx");
		 FileInputStream fi=new FileInputStream(f);
		 XSSFWorkbook wb=new XSSFWorkbook(fi);
		 XSSFSheet sh =wb.getSheet("Sheet1");
		 
		for(int i=1;i<=sh.getLastRowNum();i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.println("username="+username);
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("password="+password);
			
			driver.findElement(By.xpath("//*[@id=\"email\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys(username);
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).clear();
			driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys(password);
			driver.findElement(By.name("login")).sendKeys(Keys.ENTER);
			
			/*String test=driver.getTitle();
			if(test.equalsIgnoreCase("Facebook - login or sign up"))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
		}*/
			
			
			
	 }

	 }
}
