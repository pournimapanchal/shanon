package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate
{
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.amazon.com/");
		Thread.sleep(4000);
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.navigate().back();   //backward  on amazon
		
		driver.navigate().forward();  //forward  on fb
		
		driver.navigate().refresh();  //refresh the browser
	}

}


