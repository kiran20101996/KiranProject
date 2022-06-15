package TestFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority
{
	@Test(invocationCount = 123,enabled = true,priority = 0)
	  
	  public void a() 
	  {
		  Reporter.log("a",true);
	  }
	
	@Test(priority = 0)
	  
	  public void c() 
	  {
		  Reporter.log("c",true);
	  }
	
	@Test(priority = 4)
	  
	  public void b() 
	  {
		  Reporter.log("b",true);
	  }

	@Test(priority = 2)
	  
	  public void e() 
	  {
		  Reporter.log("e",true);
	  }
	
	@Test(priority = 2)
	  
	  public void s() 
	  {
		  Reporter.log("s",true);
	  }
	
	@Test(priority = -2)
	  
	  public void z() 
	  {
		  Reporter.log("z",true);
	  }

	
	@Test(priority = -4)
	  
	  public void x() 
	  {
		  Reporter.log("x",true);
	  }

	
	@Test
	  
	  public void d() 
	  {
		  Reporter.log("d",true);
	  }



}
