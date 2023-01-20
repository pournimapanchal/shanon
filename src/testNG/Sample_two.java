package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sample_two 
{
	@Test
	public void TC4()
	{
		Reporter.log("test case four",true);
	}
	@Test 
	public void TC5()
	{
		Reporter.log("test case five",true);
	}
	@Test 
	public void TC6()
	{
		Reporter.log("test case six",true);
	}


}
