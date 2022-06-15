package TestFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Description 
{
  @Test(description = "This method is used to performing login operation")
  
  public void a() 
  {
	  Reporter.log("login",true);
  }
  
}
