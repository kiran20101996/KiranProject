package webDriveMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getWindowHandleMethod 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver();  
		driver.manage().window().maximize();    
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043916!e!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gclid=Cj0KCQjwhLKUBhDiARIsAMaTLnGl5x6sw2IzfJl3SmYJD_Tj3ioH7Zy2ZpECBxkGxVO6lXVskt68kacaApDCEALw_wcB");
         
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("samsung f12");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();

		
		String handleparent = driver.getWindowHandle();
		Set<String> handleallwindow = driver.getWindowHandles();
			
		for(String wh:handleallwindow)
		{
			if(!handleparent.equals(wh))
			{
				driver.switchTo().window(wh);
			}
			
			
		}
		
		driver.findElement(By.xpath("//div[.='SAMSUNG Galaxy F12 (Sea Green, 64 GB)']")).click();
		driver.findElement(By.xpath("//li[@id='swatch-0-color']")).click();
		driver.findElement(By.xpath("//div[@class='hivXmn _1_74WS']")).sendKeys("410972");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3_mgZm _3AWRsL']")).click();
	}

}
