package POM;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win3\\chromedriver.exe");
        WebDriver as=new ChromeDriver();
       as.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        as.get("https://demo.actitime.com/login.do");
        
        Login_page l=new Login_page(as);    //call 1st POM class
        l.enterun();
        l.enterPwd();
        l.clickloginbtn();
        
        Home_page h=new Home_page(as);    //call 2nd POM  class
        h.verifyText();
        
        
		
	}

}
