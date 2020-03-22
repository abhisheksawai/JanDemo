package basicSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {
	
	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Users\\lenovo\\Desktop\\Nov Weekend\\janexelData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		//load work book
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//load sheet
		XSSFSheet sh = wb.getSheetAt(0);
		XSSFSheet sh1 = wb.getSheet("Sheet1");
		
		
		int lastrow = sh.getLastRowNum();
		System.out.println("last row is "+lastrow);
		
		//int rowcount = sh.getPhysicalNumberOfRows();
		//System.out.println("row count "+rowcount);
		
		int colcount = sh.getRow(0).getPhysicalNumberOfCells();
		System.out.println("coulum count "+colcount);
		
		
		for(int row = 0 ; row<= lastrow ; row++)
		{
			for(int col = 0 ; col < colcount ; col ++)
			{
				System.out.println(sh.getRow(row).getCell(col).getStringCellValue());
			}
		}
		
		
	}

}
