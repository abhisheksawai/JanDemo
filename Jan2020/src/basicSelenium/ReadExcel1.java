package basicSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel1 {
	
	public static void main(String[] args) throws Exception {
		
		File src = new File("C:\\Users\\lenovo\\Desktop\\Nov Weekend\\janexelData.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		//load work book
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		//load sheet
		XSSFSheet sh = wb.getSheetAt(0);
		XSSFSheet sh1 = wb.getSheet("Sheet1");
		
		
		String r1c1 = sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println("printing row 1 colu 1");
		System.out.println(r1c1);
		
		String r0c0 = sh.getRow(0).getCell(0).getStringCellValue();
		System.out.println("printing  r0c0");
		System.out.println(r0c0);
		
		
	}

}
