package testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StateDataTest
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream fis = new FileInputStream("./data/testdata.xlsx");
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sh = wbf.getSheet("Sheet1");
        Row row = sh.getRow(1);
        Cell cell = row.getCell(0);
        String str = cell.getStringCellValue();
        System.out.println(str);
        
        FileInputStream fis1 = new FileInputStream("./data/testdata.xlsx");
		Workbook wbf1 = WorkbookFactory.create(fis1);
		Sheet sh1 = wbf1.getSheet("Sheet1");
        Row row1 = sh1.getRow(1);
        Cell cell1 = row1.getCell(1);
        String str1 = cell1.getStringCellValue();
        System.out.println(str1);
        
        Row row2 = sh.getRow(2);
        Cell cell2 = row2.getCell(1);
        String str2 = cell2.getStringCellValue();
        System.out.println(str2);
	}

}
