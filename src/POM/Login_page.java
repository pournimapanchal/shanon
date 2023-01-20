package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page    // main method is not present
{
	
		@FindBy(xpath="//input[@name='username']")private WebElement un;
		@FindBy(xpath="//input[@name='pwd']")private WebElement pwd;
		@FindBy(xpath="//div[text()='Login ']")private WebElement loginBtn;
		
		public Login_page(WebDriver driver)    // use contructor
		{
			PageFactory.initElements(driver,this);
			
		}
		public void enterun()    //getters and setters
		{
			un.sendKeys("admin");
			
		}
		public void enterPwd()
		{
			pwd.sendKeys("manager");
			
		}
		public void clickloginbtn()
		{
			loginBtn.click();
		}
		
	

}
