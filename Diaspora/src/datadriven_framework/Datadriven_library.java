package datadriven_framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Datadriven_library {
	XSSFWorkbook wb;
	XSSFSheet sheet;
	public Datadriven_library(String excelpath)
	{
		try {
			File src=new File(excelpath);
			FileInputStream file=new FileInputStream(src);
			XSSFWorkbook wb=new XSSFWorkbook(file);
		} catch (Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public String getdata(int sheetindex,int row,int column)
	{
	 sheet=wb.getSheetAt(sheetindex);
	 return sheet.getRow(row).getCell(column).getStringCellValue();
    }
	public int getrowcount(int sheetindex)
	{
		int row=wb.getSheetAt(sheetindex).getLastRowNum();
		row=row+1;
		return row;	}
}
