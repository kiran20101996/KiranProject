package TestFlags;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class  Annotations {
 
  @BeforeSuite
  public void beforeSuite() 
  {
	  Reporter.log("BSuite",true);
  }
  
  @BeforeTest
  public void beforeTest() 
  {
	  Reporter.log("Btest",true);
  }
  
  @BeforeClass
  public void beforeClass() 
  {
	  Reporter.log("Bclass",true);
  }
  
  @BeforeMethod
  public void beforeMethod() 
  {
	  Reporter.log("Bmethod",true);
  }
  @Test
  public void f() 
  {
	  Reporter.log("t1",true);
  }
  
 
  @AfterMethod
  public void afterMethod() 
  {
	  Reporter.log("Amethod",true);

  }


  @AfterClass
  public void afterClass() 
  {
	  Reporter.log("Aclass",true);

  }


  @AfterTest
  public void afterTest()
  {
	  Reporter.log("Atest",true);

  }


  @AfterSuite
  public void afterSuite() 
  {
	  Reporter.log("Asuite",true);

  }
  
  @Test
  public void f1() 
  {
	  Reporter.log("t2",true);
  }


}
