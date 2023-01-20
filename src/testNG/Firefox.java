package testNG;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Firefox 
{
	@Parameters("browsername")
	@Test
	public void velocity(String  browsername)
	{
		WebDriver driver=null;
		
		if(browsername.equals("Firefox"))
		{
		 driver=new FirefoxDriver();
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\A\\Downloads\\geckodriver-v0.32.0-win32\\geckodriver.exe");
		}
		
		else if(browsername.equals("Chrome"))
		{
		 driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		}
	
	driver.get("https://www.google.com/");
		
	}

}
