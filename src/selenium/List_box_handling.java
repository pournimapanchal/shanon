package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List_box_handling 
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("WwebDriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver as=new ChromeDriver();
		
		as.get("https://www.facebook.com/");
		
		Thread.sleep(2000);
		
		as.findElement(By.xpath("")).click();
		
		Thread.sleep(2000);
		as.findElement(By.xpath(""));
		
	//	Select s=new Select(day);
		
	}

}
