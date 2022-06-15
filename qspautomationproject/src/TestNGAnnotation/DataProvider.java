package TestNGAnnotation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DataProvider 
{
	WebDriver driver;
	
  @Test(dataProvider = "TestActiTimeData")
  public void loginToActitime(String username, String password) throws InterruptedException 
  {
	  Thread.sleep(4000);
	  driver.findElement(By.name("username")).sendKeys(username);
	  driver.findElement(By.name("pwd")).sendKeys(password);
	  driver.findElement(By.id("loginButton")).click();
  }
  
  @org.testng.annotations.DataProvider(name="TestActiTimeData")
  public Object[][] dataprovider()
  {
	  Object[][] data=new Object[5][2];
	  
	  data[0][0]="admin123";
	  data[0][1]="manager";
	  
	  data[1][0]="manager";
	  data[1][1]="admin";
	  
	  data[2][0]="admin123";
	  data[2][1]="manager123";
	  
	  data[3][0]="ad min";
	  data[3][1]="manager";
	  
	  data[4][0]="admin";
	  data[4][1]="mana ger";
	
	  return data;
	  
  }
 
  @BeforeMethod
  public void setup()
  {
	  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe"); 
		 driver = new ChromeDriver();    
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.get("http://127.0.0.1/login.do;jsessionid=62qbp210d28dh");
  }

  @AfterMethod
  public void tearDown() 
  {
	  driver.quit();
  }

}
