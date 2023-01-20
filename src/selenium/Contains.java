package selenium;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contains {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver as=new ChromeDriver();
		
		as.get("https://www.google.com/");
		
	//	as.findElement(By.xpath("//input[contains(@id,'username')]")).sendKeys("admin");
		
		//as.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys("manager");
		
		//as.findElement(By.xpath("//div[contains(text(),'Login ')]")).click();
		
		
	}


}
