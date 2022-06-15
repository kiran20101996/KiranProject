package dataDrivenFrameWork;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class actiTimeValidLogin
{
	public static void main(String[] args) throws InterruptedException, IOException {
		
	
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	     WebDriver driver = new ChromeDriver();    
		driver.manage().window().maximize();       
	    driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=7n8lcf9uo1ko3");
		Thread.sleep(2000);
		 
		flib fl = new flib();
		int rc = fl.getRowCount("./data/actitimetestdata.xlsx", "actitime1");	
		
		
		for(int i=1;i<=rc;i++)
		{
		String user = fl.readExcelData("./data/actitimetestdata.xlsx", "actitime1", i, 0);
		Thread.sleep(2000);
		
		String pass = fl.readExcelData("./data/actitimetestdata.xlsx", "actitime1", i, 1);
		Thread.sleep(2000);
		
		
        
        driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
        
		
		}
	    
        
}

}
