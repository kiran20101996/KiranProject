package TestFlags;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Acti3 
{WebDriver driver;
  @Test
  public void f() throws InterruptedException 
  {
	  System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40 ,TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=108n8dxpubw2u");
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
  }
}
