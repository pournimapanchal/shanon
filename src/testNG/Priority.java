package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority
{
	@Test (priority=2)
	public void PR()
	{
		Reporter.log("priority 2",true);
	}
	@Test (priority=-1)
	public void PJK()
	{
		Reporter.log("priority -1",true);
	}
	@Test (priority=3)
	public void OP()
	{
		Reporter.log("priority 3",true);
	}
	@Test (priority=1)
	public void KL()
	{
		Reporter.log("priority 1",true);
	}@Test (priority=0)
	public void UI()
	{
		Reporter.log("priority 0",true);
	}

}
