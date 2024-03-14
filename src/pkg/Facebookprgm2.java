package pkg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookprgm2 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Facebook.com");
		String src =driver.getPageSource();
		if(src.contains("Login "))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}

}
