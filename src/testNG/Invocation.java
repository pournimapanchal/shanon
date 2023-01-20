package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Invocation 
{
	@Test(invocationCount=5)
	public void TC()
	{
		Reporter.log("invocation is done",true);
	}

}
