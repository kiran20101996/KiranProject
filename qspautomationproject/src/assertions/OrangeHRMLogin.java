package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OrangeHRMLogin 
{   
	WebDriver driver;
	@BeforeTest
	  public void beforeTest()
	  {
		  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe"); 
	  }
    
  @BeforeMethod
  public void beforeMethod()
  {
	   

		driver = new ChromeDriver();    
		driver.manage().window().maximize();        
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");   
		
	                  
  }
  
  @Test
  public void f() throws InterruptedException 
  {
	  SoftAssert softAsert = new SoftAssert();
	  String actuallogin = driver.getTitle();
	  softAsert.assertEquals(actuallogin, "OrangeHRM");
	  Thread.sleep(10000);                     

	  
	  driver.findElement(By.name("txtUsername")).sendKeys("admin");
	  driver.findElement(By.name("txtPassword")).sendKeys("admin123");
	  driver.findElement(By.id("btnLogin")).click();
	  WebElement dashbord = driver.findElement(By.xpath("//h1[.='Dashboard']"));
	  boolean statusofdashbord = dashbord.isDisplayed();
	  Assert.assertEquals(statusofdashbord, true);
	  Thread.sleep(4000);
	  
	  String actualhome = driver.getTitle();
	  softAsert.assertEquals(actualhome, "OrangeHRMHomePage");
	  Reporter.log("Create User", true);
	  Reporter.log("Create Contact", true);
	  softAsert.assertAll();


	  
	  
  }


 

}
