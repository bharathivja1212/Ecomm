package org.refillable;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) throws IOException {
		
	
		FileInputStream f=new FileInputStream(".//data//SmartWatches.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(f);
		XSSFSheet st = wb.getSheetAt(0);
		//System.out.println(st.getRow(1).getCell(1).getStringCellValue());
		
		
	//}
	//public String readData(String ip) throws IOException {
	//	FileInputStream f=new FileInputStream(".//data//SmartWatches.xlsx");
	//	XSSFWorkbook wb=new XSSFWorkbook(f);
		//XSSFSheet st = wb.getSheetAt(0);
		int rowCount = st.getLastRowNum();
		short colCount = st.getRow(0).getLastCellNum();
		int r=rowCount-1;
	
		
	   // String op = st.getRow(1).getCell(1).getStringCellValue();
		//System.out.println(op);
		
		for (int i = 0; i < r; i++) {
			try {
				XSSFRow row = st.getRow(i);
				for (int j = 0; j < colCount; j++) {
					System.out.println(row.getCell(j).getStringCellValue());
					
				}
				
			} 
		catch (NullPointerException e) {
			
		}
		
	}
	}
	
}
