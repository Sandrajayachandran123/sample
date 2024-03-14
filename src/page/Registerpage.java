package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registerpage {
	WebDriver driver;
	By regname=By.id("name");
	By company=By.id("name");
	By email=By.id("email");
	By pass=By.id("password");
	By confirmpassword=By.id("password-confirm");
	By register=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	By login=By.xpath("//*[@id=\"app-navbar-collapse\"]/ul[2]/li[1]/a");
	By emaillogin=By.id("email");
	By passlogin=By.id("password");
	By checkbox=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[3]/div/div/label/input");
	By login2=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	public Registerpage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void setvalues(String name,String cmpy,String mail,String password,String confirmpass )
	{
		driver.findElement(regname).sendKeys(name);
		driver.findElement(company).sendKeys(cmpy);
		driver.findElement(email).sendKeys(mail);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(confirmpassword).sendKeys(confirmpass);
   
		
	}
	 public void setvalue2(String maillogin,String passwordlogin)
	 
	 {
		 driver.findElement(login).click();
		driver.findElement(emaillogin).sendKeys(maillogin);
		driver.findElement(passlogin).sendKeys(passwordlogin);
	 }
	public void click()
	{
		driver.findElement(register).click();
	}
	public void click2()
	{
		
		driver.findElement(checkbox).click();
		driver.findElement(login2).click();
	}
	}


