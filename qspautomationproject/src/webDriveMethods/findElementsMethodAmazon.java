package webDriveMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElementsMethodAmazon 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();    //open the chrome browser
		driver.manage().window().maximize();        //maximize the browser
		driver.get("https://www.amazon.in/l/28178842031/?pf_rd_r=2W0JQ1ZGQQHCTG3PWE74&pf_rd_p=b1271396-69b4-4790-a88c-9b0f5f3b4858&pd_rd_r=74f03430-76d4-4bef-bd11-0efb9b3dd817&pd_rd_w=ZSFpu&pd_rd_wg=ImWak&ref_=pd_gw_unk");
         
		Thread.sleep(2000);
		
		                                                   //we need parent xpath webelements		
	    List<WebElement> search = driver.findElements(By.xpath("//div[@id='nav-main']"));
	    
	    List<WebElement> search1 = driver.findElements(By.xpath("//div[@class='navFooterLinkCol navAccessibility']/div[.='Get to Know Us']"));
		
		/*for(int i=0;i<search.size();i++)
		{
			WebElement find = search.get(i);
			String searchElement = find.getText();
			System.out.println(searchElement);
		}
		*/
	    
	    
	  
		for(WebElement suggestion:search ) 
	    
		
		{
	    	
			String searchs= suggestion.getText();
	    	System.out.println(searchs);
	    
	    
	    }
		
		for(WebElement suggestion1:search1 ) 
		    
			
		{
	    	
			String searchs= suggestion1.getText();
	    	System.out.println(searchs);
	    
	    
	    }

}


}
