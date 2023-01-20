package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize 
{
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shine.com/");//get method
		Thread.sleep(4000);
		
		//driver.manage().window().maximize();//maximize the browser
		//driver.close();                   //close method
		           
		             //or
	//driver.get("https://www.shine.com/");
		
		Options opt=driver.manage();
		Window win=opt.window();
		win.maximize();
		
		
		
	}

}
