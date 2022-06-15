package TestFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Groups {
  @Test(groups="functional")
  public void f() 
  {
	  Reporter.log("ft",true);
  }
  
  @Test(groups="integration")
  public void i() 
  {
	  Reporter.log("ft",true);
  }

  
  @Test(groups="smoke")
  public void s() 
  {
	  Reporter.log("ft",true);
  }

}
