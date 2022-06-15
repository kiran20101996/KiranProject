package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class actitimeInvalidLogin extends BaseTest 
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Thread.sleep(4000);
		
		
		
		flib flib = new flib();
		int rc = flib.getRowCount(excel_path, "actitime2");
		
		for(int i=1;i<=rc;i++)
		{	
		String user = flib.readExcelData(excel_path, "actitime2", i, 0);
		String pass = flib.readExcelData(excel_path, "actitime2", i, 1);

		
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(4000);
		driver.findElement(By.name("username")).clear();

		
		
		Thread.sleep(8000);
		bt.closeBrowser();
		}
		
		
		
		
	}


}
