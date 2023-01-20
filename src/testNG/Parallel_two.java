package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parallel_two
{
	@Test
	public void TC()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver as=new ChromeDriver();
        
        as.get("https://www.google.com/");
	}

}
