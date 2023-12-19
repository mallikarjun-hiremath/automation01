package com.actitime.generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileLib {
	public void getPropertyData() throws IOException {
		FileInputStream fls=new FileInputStream("./data/klm.property");
		Properties ppt=new Properties();
		ppt.load(fls);
		 String url = ppt.getProperty("url");
		String username = ppt.getProperty("username ");
		String password = ppt.getProperty("password ");
			
	}
	public void getExcelFile() throws FileNotFoundException {
		FileInputStream filess=new FileInputStream("./data/klm.xlsx");
		
		
		
	}

	
}
