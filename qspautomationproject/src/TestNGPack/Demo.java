 package TestNGPack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
 
	@Test
  public void method() 
  {
	  Reporter.log("method executed",true);
  }
	@Test
	public void method1() 
	  {
		  Reporter.log("method1 executed",true);
	  }
	@Test
	public void method2() 
	  {
		  Reporter.log("method2 executed",true);
	  }
	@Test
	public void method3() 
	  {
		int i=1;
		int res =0/1;
		System.out.println(res);
		  Reporter.log("method3 executed",true);
	  }
	@Test
	public void method4() 
	  {
		  Reporter.log("method4 executed",true);
	  }
	
	@Test
	public void method5() 
	  {
		  Reporter.log("method5 executed",true);
	  }
	
}
