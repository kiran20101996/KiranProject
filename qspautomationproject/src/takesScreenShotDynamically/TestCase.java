package takesScreenShotDynamically;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

@Listeners(CustomLisner.class)
public class TestCase extends BaseTest {
  @Test
  public void OrangeHRMlogin() throws InterruptedException 
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
  
  @Test
  public void OrangeHRMLogin1()
  {
	  Assert.fail();
  }
  
  @Test
  public void OrangeHRMLogin2()
  {
	  Assert.fail();
  }
  
  @Test
  public void OrangeHRMLogin3()
  {
	  Assert.fail();
  }
  
  @Test
  public void OrangeHRMLogin4()
  {
	  Assert.fail();
  }
  
  @Test
  public void OrangeHRMLogin5()
  {
	  Assert.fail();
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  initialization();
  }

  @AfterMethod
  public void afterMethod() 
  {
	  driver.quit();
	  
  }

}
