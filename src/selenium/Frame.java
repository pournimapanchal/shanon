package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));   ///implicit wait
		driver.manage().window().maximize();                 //maximize the browser
		
		//bydefault selenium focus is on main webpage so we need to switch it
		//switch to 1st frame
		driver.switchTo().frame("packageListFrame");
		String t1=driver.findElement(By.xpath("//h2[text()='Packages']")).getText();  //for our confirmation, take any element on 1st frame and print it
		System.out.println(t1);
		
		driver.switchTo().defaultContent();   //control goes to main webpage
		
		
		driver.switchTo().frame("packageFrame");  //jump from main webpage to 2nd frame
		String t2=driver.findElement(By.xpath("//a[text()='AbstractHttpCommandCodec.CommandSpec']")).getText();  //take one element and print it
		System.out.println(t2);
		
		driver.switchTo().defaultContent();   //control goes to main webpage
		
		
		driver.switchTo().frame("classFrame");  //now we need to switch control towards 3rd frame
		String t3=driver.findElement(By.xpath("//a[text()='AcceptedW3CCapabilityKeys']")).getText();    //take one element and print it
		System.out.println(t3);
		
		
		
		
	}

}
