package TestNGAnnotation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class DataProviders 
{
	WebDriver driver;
  @Test(dataProvider = "OrangeHRM")
  public void loginToActitime(String username, String password) throws InterruptedException 
  {
	  Thread.sleep(4000);
	  driver.findElement(By.name("txtUsername")).sendKeys(username);
	  driver.findElement(By.name("txtPassword")).sendKeys(password);
	  driver.findElement(By.id("btnLogin")).click();
  
  }
	  @BeforeMethod
  public void beforeMethod()
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); 
		 driver = new ChromeDriver();    
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
  }


  @DataProvider(name="OrangeHRM")
  public Object[][] dp() 
  {
 Object[][] data=new Object[5][2];
	  
	  data[0][0]="admin123";
	  data[0][1]="admin123";
	  
	  data[1][0]="admin";
	  data[1][1]="admin";
	  
	  data[2][0]="admin123";
	  data[2][1]="admin";
	  
	  data[3][0]="ad min";
	  data[3][1]="admin123";
	  
	  data[4][0]="admin";
	  data[4][1]="adm in123";
	
	  return data;
    }
  }

