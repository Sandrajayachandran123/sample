package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Seleniumsearch4 {
	ChromeDriver driver;
	@Before
	public void setup()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
	}
	@Test
	public void test()
	{
		driver.get("https://www.justdial.com/");
	}

}
