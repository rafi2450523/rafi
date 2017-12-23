package excelfile;

import library.Exceldataconfig;

public class ReadExceldata {

	public static void main(String[] args) {
		Exceldataconfig excel=new Exceldataconfig("C:\\Users\\alluri\\Desktop\\selenium\\xel 1.xlsx");
	System.out.println(excel.getdata(0, 1, 0));
	
	}

}
