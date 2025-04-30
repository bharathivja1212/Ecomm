package org.refillable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {
	
	public static void main(String[] args) throws IOException {
		 
		XSSFWorkbook wb=new XSSFWorkbook();
		XSSFSheet sh = wb.createSheet();
		XSSFRow r = sh.createRow(0);
		XSSFCell c = r.createCell(0);
		c.setCellValue("Hi");
		
		
		sh.createRow(1).createCell(0).setCellValue("Ephatha");
		
		FileOutputStream f=new FileOutputStream(".//data//SmartWatchesWrite.xlsx");
		wb.write(f);
	}

}
