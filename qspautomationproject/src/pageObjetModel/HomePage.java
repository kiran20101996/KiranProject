package pageObjetModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	//declaration
	
	@FindBy(xpath="//a[text()='Logout']") private WebElement logOut;
	@FindBy(xpath="//a[text()='Create new tasks']") private WebElement createNewTask;
	@FindBy(xpath="//div[text()='Settings']") private WebElement setting;
	
	
	//initialization
	public HomePage(WebDriver driver ) 
	{
		PageFactory.initElements(driver, this);
	}

	

	
	//utilization
	public WebElement getLogOut() {
		return logOut;
	}

	
	public WebElement getCreateNewTask() {
		return createNewTask;
	}

	public WebElement getSetting() {
		return setting;
	}

	
	
	
	//operational method

	
	public void logoutLink() 
	{
		logOut.click();;
	}
	
	
	public void settingLink() 
	{
		setting.click();
	}
	
	public void createNewTaskButton() 
	{
		createNewTask.click();
	}
	

	

	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
}
