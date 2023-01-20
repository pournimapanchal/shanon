package testNG;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_one
{
	@Test
	public void TC1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		
		Dimension d=new Dimension(100,200);//create object of dimension class
		
		driver.manage().window().setSize(d);//use the setsize method
		Reporter.log("hi...how r u ??",true);
	}
	

}
