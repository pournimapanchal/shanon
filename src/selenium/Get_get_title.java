package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_get_title 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver ff=new ChromeDriver();
		
		ff.get("https://www.google.com/");  //get method
		
		String expT="Google";
		
		String actT=ff.getTitle();   //title will stored in actT
		
		System.out.println(actT);
		
		if(expT.equals(actT))   //compare two results
		{
			System.out.println("TC is pass");
		}
		else
		{
			System.out.println("TC is fail");
		}
		
		
		
	}

}
