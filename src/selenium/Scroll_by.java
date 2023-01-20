package selenium;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Scroll_by 
{
	public static void main(String[] args) throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver as=new ChromeDriver();
		as.get("https://www.amazon.in/");
		
		
		

		JavascriptExecutor jse=(JavascriptExecutor)as;     //use JavascriptExecutor interface
		
		jse.executeScript("window.scrollBy(0,8000);");   //scroll down
		
		Thread.sleep(2000);
		
		jse.executeScript("window.scrollBy(0,-1000);");    //scroll up   
	}

}