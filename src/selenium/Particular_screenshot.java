package selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Particular_screenshot
{
	public static void main(String[] args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		WebElement abc=driver.findElement(By.xpath("//img[@class='_97vu img']"));
		
		
		File src=abc.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\A\\Desktop\\Screenshot\\paticular.jpg");
		Files.copy(src, dest);
	}

}
