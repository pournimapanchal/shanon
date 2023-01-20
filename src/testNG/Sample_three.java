package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample_three 
{
	@Test
	public void TC7()
	{
		Reporter.log("test case seven",true);
	}
	@Test 
	public void TC8()
	{
		Reporter.log("test case eight",true);
	}
	@Test 
	public void TC9()
	{
		Reporter.log("test case nine",true);
	}


}
