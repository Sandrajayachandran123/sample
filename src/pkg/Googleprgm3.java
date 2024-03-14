package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Googleprgm3 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
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

}
