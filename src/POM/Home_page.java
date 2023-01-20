package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page   //main method is not present
{
   @FindBy(xpath="//td[text()='Enter Time-Track']")private WebElement text;
   
   public Home_page(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
	   
   }
   public void verifyText()
   {
	   String expT="Enter Time-Track";
	   String actT=text.getText();
	   
	   if(actT.equals(expT))
	   {
		   System.out.println("TC is pass");
		   
	   }
	   else
	   {
		   System.out.println("TC is fail");
	   }
   }

}
