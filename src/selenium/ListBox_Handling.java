package selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox_Handling
{
	public static void main(String[] args) throws Throwable  
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver as=new ChromeDriver();
		
		as.get("https://www.facebook.com/");    //open the app
	
		Thread.sleep(2000);
		
		as.findElement(By.xpath("//a[text()='Create New Account']")).click();    //click on "create new account button"
	
		Thread.sleep(2000);
		
		WebElement day=as.findElement(By.xpath("//select[@id='day']"));      //select 'day' listbox
		
		Select s=new Select(day);   //object of select class
		
		Thread.sleep(2000);
		
		//use select class method
		//s.selectByValue("15");
		//select by visible text
		s.selectByVisibleText("20");
		
		Thread.sleep(2000);
	WebElement month =	as.findElement(By.xpath("//select[@id='month']"));
		
		Select r=new Select(month);
		Thread.sleep(2000);
		
		r.selectByVisibleText("May");
		
		
		
		Thread.sleep(2000);
		WebElement year =	as.findElement(By.xpath("//select[@id='year']"));
			
			Select p=new Select(year);
			Thread.sleep(2000);
			
			p.selectByVisibleText("1992");
			
		
		
		
		
	}

}
