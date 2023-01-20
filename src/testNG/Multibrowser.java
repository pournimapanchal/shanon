package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Multibrowser
{
	@Parameters("browsername")  //annotation
	@Test
	public void TC(String browsername)   //string browsername
	{
		WebDriver driver=null;
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
			driver=new ChromeDriver();
			
		}
		else if(browsername.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\A\\Downloads\\geckodriver-v0.32.0-win32\\");
			driver=new FirefoxDriver();
			
		}
		driver.get("https://www.amazon.in/");
	}

}
