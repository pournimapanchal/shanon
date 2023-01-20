package selenium;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setposition 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver ab=new ChromeDriver();
		ab.navigate().to("https://www.google.com/");
		
		Point p=new Point(300,400);        //create object of point class
		ab.manage().window().setPosition(p);     //use the setsize method
		
	}

}
