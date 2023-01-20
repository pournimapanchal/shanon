package selenium;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		//Options opt=driver.manage();
		//Windows win=opt.window();
		//driver.manage().window().maximize();
		//Thread.sleep(15000);
		//driver.manage().window().minimize();//minimize methode(this method is not present in selenium 3.141.)
		String link=driver.getCurrentUrl();
		System.out.println(link);
			
	
}

}
