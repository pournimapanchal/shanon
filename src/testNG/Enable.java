package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable 
{
	@Test
	public void KL()
	{
		Reporter.log("test case first",true);
	}
	@Test (enabled=false)
	public void UI()
	{
		Reporter.log("priority 0",true);
	}

}
