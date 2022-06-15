package dataDrivenFrameWork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dataDrivenFrameWork.flib;

public class writeDataInExcelActitimeInvalid
{
public static void main(String[] args) throws InterruptedException, IOException 
{
		
  flib flib = new flib(); 
  
  flib.writeExcelData("./data/actitimetestdata.xlsx", "actitime2", 0, 2, "   STATUS");
  flib.writeExcelData("./data/actitimetestdata.xlsx", "actitime2", 1, 2, "   process");
  flib.writeExcelData("./data/actitimetestdata.xlsx", "actitime2", 2, 2, "   notprocess");
  
  
 
  flib.writeExcelData("./data/actitimetestdata.xlsx", "actitime2", 0, 3, "     PASS");
  flib.writeExcelData("./data/actitimetestdata.xlsx", "actitime2", 1, 3, "     yes");
  flib.writeExcelData("./data/actitimetestdata.xlsx", "actitime2", 2, 3, "     yes");
  
  
  flib.writeExcelData("./data/actitimetestdata.xlsx", "actitime2", 0, 4, "    FAIL");
  flib.writeExcelData("./data/actitimetestdata.xlsx", "actitime2", 1, 4, "     no");
  flib.writeExcelData("./data/actitimetestdata.xlsx", "actitime2", 2, 4, "     no");
  flib.writeExcelData("./data/actitimetestdata.xlsx", "actitime2", 3, 4, "     no");
  flib.writeExcelData("./data/actitimetestdata.xlsx", "actitime2", 4, 4, "     no");
  flib.writeExcelData("./data/actitimetestdata.xlsx", "actitime2", 5, 4, "     no");
  flib.writeExcelData("./data/actitimetestdata.xlsx", "actitime2", 6, 4, "     no");
  
  
  
        

        
        
}


}
