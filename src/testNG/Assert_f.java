package testNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Assert_f 
{
	@Test
	public void KL()
	{
		Reporter.log("test case first",true);
	}
	@Test 
	public void UI()
	{
		Reporter.log("2nd test case",true);
        //Assert.fail();
	}
	
		
	


}
