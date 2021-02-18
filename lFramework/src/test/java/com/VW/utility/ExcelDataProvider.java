package com.VW.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	//Create Constructor so that it will load excel as soon as we create object of class so that we dont need to give excel path
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider () throws IOException {
		
		File src = new File("./TestData/Data.xlsx");
		
		FileInputStream fis = new FileInputStream(src);			// it will convert file to raw data
			
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
	

	}
	
	
	
	
	//we will write method now to get stringdata from excel	
	
	
		
		public String getStringData(String sheetname,int row, int coloumn) {		//we can also user sheetindex
			
			return wb.getSheet(sheetname).getRow(row).getCell(coloumn).getStringCellValue();
		}
		
		public String getStringData(int sheetindex,int row, int coloumn) {		//we can also user sheetindex
			
			return wb.getSheetAt(sheetindex).getRow(row).getCell(coloumn).getStringCellValue();
		}
			
		
		// above two methods are example of overloading as we have two same method with difrent parameters
		
		
	}
	
	

