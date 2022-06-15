package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathLocatorCase5Selenium

     //index value
{
	public static void main(String[] args) throws InterruptedException 

	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.selenium.dev");
	    
	    Thread.sleep(4000);        /* add thread is import*/
	    
	    driver.findElement(By.xpath("//span[.='Downloads']")).click();
	    Thread.sleep(4000);
	   
	    driver.findElement(By.xpath("(//a[.='API Docs'])[1]")).click();
	  /*  driver.findElement(By.xpath("(//a[.='API Docs'])[2]")).click();
	    driver.findElement(By.xpath("(//a[.='API Docs'])[3]")).click();
	    driver.findElement(By.xpath("(//a[.='API Docs'])[4]")).click();
	    driver.findElement(By.xpath("(//a[.='API Docs'])[5]")).click();    */

}


}
