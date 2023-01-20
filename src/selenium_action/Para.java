package selenium_action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Para
{
	public static void main(String[] args) throws Throwable
	{
		FileInputStream file = new FileInputStream("C:\\Users\\A\\Documents\\parameterization.xlsx");
		String data = WorkbookFactory.create(file).getSheet("parameterization").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
	}

}
