package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot 
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");  //open the app
		
		TakesScreenshot ts=(TakesScreenshot)driver;   //typecast takesScreenshot interface
		
		File src=ts.getScreenshotAs(OutputType.FILE);  //take the screenshot using getscreenshot method
		
		File dest=new File("C:\\Users\\A\\Desktop\\Screenshot\\google.png");   //create the object of file class
		
		Files.copy(src, dest);   //we need to convert screenshot from src to destination
		
		
		
	}

}
