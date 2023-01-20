package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Minimize 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shine.com/");//get method
		
		driver.manage().window().maximize();   //maximize method
		
	//	driver.manage().window().minimize(); //minimize method  .....this method is not present in selenium 3.141.59
	}

}
