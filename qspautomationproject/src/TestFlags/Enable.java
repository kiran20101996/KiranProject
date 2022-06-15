package TestFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Enable 
{
  @Test(enabled = true)
  
  public void a() 
  {
	  Reporter.log("login",true);
  }
  
@Test(enabled = true)
  
  public void x() 
  {
	  Reporter.log("Settings",true);
  }

  
@Test(enabled = false)
  
  public void b() 
  {
	  Reporter.log("logout",true);
  }

}
