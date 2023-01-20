package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_attribute_and_text 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver thor=new ChromeDriver();
		thor.get("https://demo.actitime.com/login.do");
		
		thor.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		
		thor.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		thor.findElement(By.xpath("//div[text()='Login ']")).click();
		
	    String expectedT="actiTIME - Login";   //expected title
		
		String actualT=thor.getTitle();    //actual title
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
