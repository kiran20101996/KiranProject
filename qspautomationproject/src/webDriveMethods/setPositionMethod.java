package webDriveMethods;


import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class setPositionMethod 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new ChromeDriver(); 
	     Point targetPosition = new Point(500,100);
		driver.manage().window().setPosition(targetPosition);       
        System.out.println(targetPosition);

	}

}
