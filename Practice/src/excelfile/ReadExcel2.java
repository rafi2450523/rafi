package excelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel2 {
	public static void main(String[] args) throws Exception {
		File src=new File("C:\\Users\\alluri\\Desktop\\selenium\\xel 1.xlsx");
		FileInputStream file=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		int rowcount=sheet.getLastRowNum();
		
		for (int i = 0; i <= rowcount; i++) {
			String data = sheet.getRow(i).getCell(0).getStringCellValue();
			System.out.println("Data from Excel is " + data);
		}
		
	}

}
