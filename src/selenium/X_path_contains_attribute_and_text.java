package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path_contains_attribute_and_text
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver as=new ChromeDriver();
		as.get("https://demo.actitime.com/login.do");
		
		as.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
		
		as.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
		
		as.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
		
		
		String expectedT="actiTIME - Login";
		
		String actualT=as.getTitle();
		System.out.println(actualT);
		
		if(expectedT.equals(actualT))
		{
			System.out.println("TC is pass");
		}
		else
		{
			System.out.println("TC is fail");
		}
	}

}
