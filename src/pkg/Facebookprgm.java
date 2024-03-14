package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookprgm {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
		 driver.get("https://www.Facebook.com");
		 String actualtitle=driver.getTitle();
		 String expectedtitle="Facebook345";
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
