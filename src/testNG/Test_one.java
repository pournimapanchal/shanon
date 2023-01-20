package testNG;

import static org.testng.Assert.fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test_one
{
	@Test
	public void TC_one()   //non-static method
	{
		Reporter.log("this is my first test case programm",true);  //by using true it will print in consol
	}
	@Test
	public void TC_two()   //non-static method
	{
		Reporter.log("this is my 2nd test case program",true);
		Assert.fail();    //intenshinally to fail test case we use this line
		
	}

}






