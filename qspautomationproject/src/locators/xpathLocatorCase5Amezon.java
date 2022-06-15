package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathLocatorCase5Amezon 

    //dependent and independent 
{
	public static void main(String[] args) throws InterruptedException 

	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_98xjxt98l7_b&adgrpid=60639568242&hvpone=&hvptwo=&hvadid=294102729351&hvpos=&hvnetw=g&hvrand=1182567869031547902&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-299123108802&hydadcr=5841_1738695&gclid=CjwKCAjw9qiTBhBbEiwAp-GE0VIcFlXoKHFNEbLwyZFuvDb9uYxQO_9eE7W6rElyJcqdaKKCSOPMtxoCgA0QAvD_BwE");
	    
	    Thread.sleep(3000);        /* add thread is import*/
	    
	   
	    
	    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
	    Thread.sleep(3000);
	    
	    driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	    Thread.sleep(3000);
	    
	    //xpath for static webelement then common paraent and ten dynamic webelement
	    
	    driver.findElement(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']/ancestor::body[@class='a-aui_72554-c a-aui_accordion_a11y_role_354025-c a-aui_killswitch_csa_logger_372963-c a-aui_launch_2021_ally_fixes_392482-c a-aui_pci_risk_banner_210084-c a-aui_preload_261698-c a-aui_rel_noreferrer_noopener_309527-c a-aui_template_weblab_cache_333406-c a-aui_tnr_v2_180836-c s-media-gallery-enabled a-meter-animate']/descendant::span[@class='a-price-whole']")).click();

}

}
