package selenium;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_browser
{
	public static void main(String[] args) throws Throwable 
	{
System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver as=new ChromeDriver();
		as.get("https://www.flipkart.com/");
		as.manage().window().maximize();
		
		as.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();   //click on cancel button
		
		as.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("mobile under 20000",Keys.ENTER);   //search any mobile
	
		Thread.sleep(5000);
		
		as.findElement(By.xpath("//div[@class='_4rR01T']")).click();  //click on a 1st phone
		
		Thread.sleep(5000);   //switch the control
		
	    Set<String> allwindows = as.getWindowHandles();
	    ArrayList<String> al = new ArrayList<String>(allwindows);   //create object  of array list
	    
	    String mainid = al.get(0);   //print main window id
	    System.out.println(mainid);
	    
	    
	    as.switchTo().window(al.get(1));     //switch to child window
	    String cwind = al.get(1);
		System.out.println(cwind);
	    Thread.sleep(5000);
	    
	   String title = as.getTitle();
	       System.out.println(title);
	    
		
		
    }

}
