package excelfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeExcel {
	public static void main(String[] args) throws Exception {
		File src=new File("C:\\Users\\alluri\\Desktop\\selenium\\xel 1.xlsx");
		FileInputStream file=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(file);
		XSSFSheet sheet = wb.getSheetAt(0);
		sheet.getRow(0).createCell(2).setCellValue("pass");
		sheet.getRow(1).createCell(2).setCellValue(15.00);
		FileOutputStream f1=new FileOutputStream(src);
		wb.write(f1);
		wb.close();
		
		
	}

}
