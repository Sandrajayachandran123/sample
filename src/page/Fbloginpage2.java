package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage2 {
	WebDriver driver;
	@FindBy(id="email")
	WebElement fbemail;
	@FindBy(id="pass")
	WebElement password;
	@FindBy(name="login")
	WebElement fblogin;
	
	public Fbloginpage2(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void setvalue(String email,String fbpassword)
	{
		fbemail.sendKeys(email);
		password.sendKeys(fbpassword);
	}
	public void login()
	{
		fblogin.click();
	}
	

}
