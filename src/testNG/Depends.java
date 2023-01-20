package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends 
{
	@Test
	public void Login()
	{
		Reporter.log("",true);
	}
	@Test (dependsOnMethods={"Login"})
	public void logout()
	{
		Reporter.log("",true);
	}

}
