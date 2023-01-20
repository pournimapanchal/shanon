package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver as=new ChromeDriver();
		
		as.navigate().to("https://www.amazon.in/");     //open url
		Thread.sleep(4000);               //sleep of 4 sec
		as.manage().window().maximize();   //maximize the webpage
		
		
		as.navigate().to("https://www.flipkart.com/");
		//Thread.sleep(3000);
		as.manage().window().maximize();  
		
		as.navigate().back();
		
		
		as.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("samsung mobile");
		as.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		
		
		
		
	}

}
