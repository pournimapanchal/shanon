package selenium_action;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_n_drop 
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");  //get method
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele1=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement ele2=driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  //implicit wait
		
		Actions act=new Actions(driver);
		
		
		act.dragAndDrop(ele1, ele2).perform();
		
	}

}
