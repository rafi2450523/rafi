package excelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws Exception {
		File src=new File("C:\\Users\\alluri\\Desktop\\selenium\\xel 1.xlsx");
		FileInputStream file=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		String data0 = sheet.getRow(1).getCell(1).getStringCellValue();
		System.out.println("Data from Excel is "+ data0);
		wb.close();
		
		
	}

}
