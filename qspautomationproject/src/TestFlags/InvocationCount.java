package TestFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class InvocationCount 
{
  @Test(invocationCount = 1000)
  
  public void a() 
  {
	  Reporter.log("login",true);
  }
  
}
