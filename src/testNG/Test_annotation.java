package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_annotation
{
	@BeforeClass
	public void openBrowser()
	{
		Reporter.log("",true);
		
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("",true);
	}
	@Test
	public void verifytest()
	{
		Reporter.log("",true);
	}
	@AfterMethod
	public void logoutapp()
	{
		Reporter.log("",true);
	}
	@AfterClass
	public void closebrowser()
	{
		Reporter.log("",true);
	}
	

}
