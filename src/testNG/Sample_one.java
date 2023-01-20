package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample_one 
{
	@Test
	public void TC1()
	{
		Reporter.log("test case first",true);
	}
	@Test 
	public void TC2()
	{
		Reporter.log("test case two",true);
	}
	@Test 
	public void TC3()
	{
		Reporter.log("test case three",true);
	}



}
