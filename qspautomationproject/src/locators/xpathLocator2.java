package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class xpathLocator2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver","./drivers/msedgedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooginhydr1-21%26ref%3Dnav_signin%26adgrpid%3D60639568242%26hvpone%3D%26hvptwo%3D%26hvadid%3D294102729729%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D1192976923223855675%26hvqmt%3Db%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D1007788%26hvtargid%3Dkwd-311187680635%26hydadcr%3D5841_1914865%26gclid%3DEAIaIQobChMIipDQvb6q9wIV75NmAh17tg1PEAAYASAAEgIzMfD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
	    
	    Thread.sleep(4000);        /* add thread is import*/
	    
	 
	    driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("1234567890");
	    driver.findElement(By.xpath("//input[@id='continue']")).click();

	    	}

}
