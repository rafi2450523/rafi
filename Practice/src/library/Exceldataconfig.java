package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Exceldataconfig {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public Exceldataconfig(String excelpath)
	{
		try 
		{
			File src=new File(excelpath);
			FileInputStream file=new FileInputStream(src);
			wb=new XSSFWorkbook(file);
			
		}  
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
		}
		
	}
	public String getdata(int sheetnumber,int row,int column)
	{
		sheet=wb.getSheetAt(sheetnumber);
		String data = sheet.getRow(row).getCell(column).getStringCellValue();
		return data;
		
	}
	
	public int getrowcount(int sheetindex)
	{
		int row=wb.getSheetAt(sheetindex).getLastRowNum();
		row=row+1;
		return row;
	}
	
}
