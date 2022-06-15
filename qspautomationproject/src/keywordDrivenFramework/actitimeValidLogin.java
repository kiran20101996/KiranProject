package keywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class actitimeValidLogin extends BaseTest
{
	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		BaseTest bt = new BaseTest();
		bt.openBrowser();
		Thread.sleep(4000);
		
		
		
		flib flib = new flib();
		String user = flib.readproperties(prop_path, "username");
		String pass = flib.readproperties(prop_path, "password");
		
		driver.findElement(By.name("username")).sendKeys(user);
		driver.findElement(By.name("pwd")).sendKeys(pass);
		driver.findElement(By.id("loginButton")).click();
		
		
		Thread.sleep(8000);
		bt.closeBrowser();
		
	}

}
