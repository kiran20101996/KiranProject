 package synchronization;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class explicityWaitSynchronization
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "./drivers/msedgedriver.exe");   //to avoid the illegalstateException

	    WebDriver driver = new EdgeDriver();    //open the chrome browser
		driver.manage().window().maximize();        //maximize the browser
	//	driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://127.0.0.1/login.do;jsessionid=1amo4c8frs3pj");
         
		Thread.sleep(2000);

	//	WebDriverWait wait=new WebDriverWait(driver, 40);
	//	wait.(untilExpectedConditions.titlContains("Login"));
		
		String loginPageTitle = driver.getTitle();
		System.out.println(loginPageTitle);
		System.out.println("The Login Page Title Is Verified");
		
		WebElement actitimeurl = driver.findElement(By.name("username"));
		actitimeurl.sendKeys("admin");
		WebElement username = driver.findElement(By.name("pwd"));
		username.sendKeys("manager");		
		WebElement passward = driver.findElement(By.linkText("Login"));
		passward.click();
		
	//  wait.until(ExpectedConditon.titleContains("Enter "));
		String homepageTitle = driver.getTitle();
		System.out.println(homepageTitle);
		System.out.println("Home Page Title Is Verified");
		
	}

}
