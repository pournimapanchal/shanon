package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mock1 
{
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver as=new ChromeDriver();
		as.navigate().to("https://www.facebook.com/");     //open url
		Thread.sleep(3000);               //slepp of 4 sec
		as.manage().window().maximize();   //maximize the webpage
		
		
		as.navigate().to("https://www.instagram.com/");
		Thread.sleep(3000);
		as.manage().window().maximize();  
		
		as.navigate().back();
		
        as.findElement(By.xpath("//input[@id='email']")).sendKeys("pournimapanchal4@gmail.com");
		
	    as.findElement(By.xpath("//input[@id='pass']")).sendKeys("pittu@123");
		
		as.findElement(By.xpath("//button[@name='login']")).click();
		
	
		
	}

}
