package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLoginHomepage 
{
	Sheet sh;
	WebDriver driver;
	LoginPage l;
	HomePage h;
	
	
    @BeforeClass
    public void openBrowser() throws Throwable
    {
    	FileInputStream fis=new FileInputStream("C:\\Users\\A\\Documents\\TestNG.xlsx");
     sh = WorkbookFactory.create(fis).getSheet("Sheet1");
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\A\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	 driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    	driver.get("https://demo.actitime.com/login.do");
    	//all object we need to create
    	 l=new LoginPage(driver);
    	 h=new HomePage(driver);
    	
    }
    @BeforeMethod
    
    public void openApp()
    {
    	String username = sh.getRow(0).getCell(0).getStringCellValue();
    	 
    	l.enterUN(username);
    	String password = sh.getRow(1).getCell(0).getStringCellValue();
    //	String password = "manager";
    	l.enterPWD(password);
         l.clickLoginBtn();
    }
 
    @Test
    
    public void verifyText()
    {
    	Reporter.log("running verifyText",true);
    	String exptText = sh.getRow(2).getCell(0).getStringCellValue();
    	String actText = h.verifyText();
    	Assert.assertEquals(exptText, actText);
    }
    @AfterMethod
    public void logOut()
    {
    	Reporter.log("logout from app",true);
    }
    @AfterClass
    public void closeBrowser() 
	{
		Reporter.log("close the browser",true);
	}

	
}
