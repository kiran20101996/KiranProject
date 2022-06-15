package TestFlags;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class thread {
  @Test
  public void method1() 
  {
	 long thread = Thread.currentThread().getId();
	 System.out.println(thread);
	 Reporter.log("thread id"+thread,true);
  }
  
  @Test
  public void method2() 
  {
	 long thread = Thread.currentThread().getId();
	 System.out.println(thread);
	 Reporter.log("thread id"+thread,true);
  }

}


