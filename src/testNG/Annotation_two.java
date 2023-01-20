package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation_two
{
	@BeforeClass
	public void openbrowser()
	{
		Reporter.log("open browser",true);
	}
	@BeforeMethod
	public void login()
	{
		Reporter.log("before method ",true);
	}
	@Test
	public void verifytest()
	{
		Reporter.log("TC 1",true);
	}
	@AfterMethod
	public void logout()
	{
		Reporter.log("after method",true);
	}
	@BeforeMethod
	public void login2()
	{
		Reporter.log("befor method",true);
	}
	@Test
	public void verify()
	{
		Reporter.log("TC 2",true);
	}
	@AfterMethod
	public void logout1()
	{
		Reporter.log("after method",true);
	}
	@AfterClass
	public void closebrowser()
	{
		Reporter.log("after class",true);
	}
	

}
