package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Act_time 
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
          WebDriver as=new ChromeDriver();
          
          as.get("https://demo.actitime.com/login.do");
          Thread.sleep(4000);
          
          as.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");//enter username
          as.findElement(By.name("pwd")).sendKeys("manager");//enter password
          as.findElement(By.xpath("//div[text()='Login ']")).click();//click on login button
          
          String expT="actiTIME - Login";
          String actT=as.getTitle();
          System.out.println(expT);
         
          if(expT.equals(actT))
          {
        	  System.out.println("TC is pass");
        	  
          }
          else
          {
        	  System.out.println("TC is fail");
          }
	}

}
