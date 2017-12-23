package library;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyconfig {
	Properties pro;
	public Propertyconfig()
	{
		try {
			File src=new File("./Configuration/Config.property");
			FileInputStream file=new FileInputStream(src);
			pro=new Properties();
			pro.load(file);
		
		    }
		catch (IOException e) 
		{
			System.out.println(e.getMessage());
		}
	}
	public String getchromepath()
	{
		String path = pro.getProperty("Chromepath");
		return path;
	}
	public String geturl()
	{
		return pro.getProperty("URL");
	}
	
	
	
}
