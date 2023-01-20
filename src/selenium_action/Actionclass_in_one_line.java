package selenium_action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclass_in_one_line 
{
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");//get method
		
		WebElement target=driver.findElement(By.xpath("//a[text()='Gmail']"));  //choose the target element
		Actions act=new Actions(driver);    //create object of action class
		
		act.moveToElement(target).contextClick().doubleClick().perform();
	}

}
