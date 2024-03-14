package pkg;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkpgm {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		driver = new ChromeDriver();
	}
		
	@Test
	public void test()
	{
		driver.get("https://www.google.com");
		List<WebElement> li = driver.findElements(By.tagName("a"));
	for(WebElement s:li)
	{
		String links=s.getAttribute("href");
		verify(links);
		}
		}
	public void verify(String link)
	{
		try{
			URL OB = new URL(link);
			HttpURLConnection con=(HttpURLConnection)OB.openConnection();
			con.connect();
			if(con.getResponseCode()==200)
			{
				System.out.println("valid---"+link);
			}
			else if(con.getResponseCode()==404)
			{
				System.out.println("invaid---"+link);
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}

				
			
		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	