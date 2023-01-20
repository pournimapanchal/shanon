package selenium_action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class With_DDF
{
 public static void main(String[] args) throws Throwable
 {
	FileInputStream fis=new FileInputStream("");
	Sheet sh=(Sheet) WorkbookFactory.create(fis).getSheet("Sheet1");
	
}
}
