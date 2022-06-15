package pageObjetModel;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class flib
{
	
	//read the data from excel file
	
	public String readExcelData(String excelpath,String sheetname,int rowcount,int cellcount) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sh = wbf.getSheet(sheetname);
		Row row = sh.getRow(rowcount);
		Cell cell = row.getCell(cellcount);
		String data = cell.getStringCellValue();
		return data;
		
		
		
	}
	
	//get the row count from excel file
	
	public int getRowCount(String excelpath,String sheetname) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sh = wbf.getSheet(sheetname);
	    int rc = sh.getLastRowNum();
		
		return rc;
		
		
	}
	
	
	//write data in excel file
	
	public void writeExcelData(String excelpath,String sheetname,int rowcount,int cellcount,String data) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream(excelpath);
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sh = wbf.getSheet(sheetname);
		Row row = sh.getRow(rowcount);
		Cell cell = row.createCell(cellcount);
	    cell.setCellValue(data);
		
		
		
		FileOutputStream fos = new FileOutputStream(excelpath);
		wbf.write(fos);
	}
	
	
	
	 //read data from properties file
	
	public String readproperties(String properties,String key) throws IOException 
	{
		FileInputStream fis = new FileInputStream(properties);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(key);
		return value;
		
	}
	
}



