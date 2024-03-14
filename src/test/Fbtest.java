package test;

import org.testng.annotations.Test;

import base.Basecls;
import page.Fbpage;
import utilities.Exelutil;

public class Fbtest extends Basecls {
	@Test
	public void verifyLoginEithValidCred() 
	{
		Fbpage p1= new Fbpage(driver);
		String x1 = "C:\\Users\\soora\\Documents\\data2.xlsx";
		String Sheet ="Sheet1";
		int rowCount = Exelutil.getRowcount(x1, Sheet);
		for (int i =1;i<=rowCount;i++)
		{
			String Username = Exelutil.getCellValue(x1, Sheet,i,0);
			System.out.println("username-----"+Username);
			String pwd =Exelutil.getCellValue(x1, Sheet,i,1);
			System.out.println("password----"+pwd);
			p1.setvalues(Username, pwd);
			p1.login();
		}
		
	}
	

}
