package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Robot_class
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver as=new ChromeDriver();

		as.get("https://www.shine.com/");   //open the app
		
		Robot r=new Robot();    // create object of robot class
		
		
		r.keyPress(KeyEvent.VK_PAGE_DOWN);            //key press
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);          //key release
		
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
		
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		
	}

}
