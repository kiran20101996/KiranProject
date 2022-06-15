 package testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ActitimeLoginHardCode
{
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	     WebDriver driver = new ChromeDriver();    
		driver.manage().window().maximize();       
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=7n8lcf9uo1ko3");
		
		FileInputStream fis = new FileInputStream("./data/actitimetestdata.xlsx");
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sh = wbf.getSheet("actitime1");
        Row row = sh.getRow(1);
        Cell cell = row.getCell(0);
        String user = cell.getStringCellValue();
          
        
        Cell cell1 = row.getCell(1);
        String passward = cell1.getStringCellValue();
        
         
		
        
        driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(passward);
		driver.findElement(By.id("loginButton")).click();
        

        

        
        
}

}
