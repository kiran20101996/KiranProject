package pageObjetModel;

import java.io.IOException;

public class TestActiTimeCreateNewTask  extends BaseTest
{

	
	public static void main(String[] args) throws IOException, InterruptedException 
	{
		
		BaseTest bt =new BaseTest();
		bt.setUp();//open the browser and launch the web app
		flib flib = new flib();

		//read the data from excel file by using generic reusable methods
		String validUsername = flib.readproperties(prop_path, "username");
		String validPassword = flib.readproperties(prop_path, "password");

		LoginPage lp = new LoginPage(driver);
		//perform login
		lp.actiTimevalidLogin(validUsername, validPassword);
		Thread.sleep(4000);

		HomePage hp = new HomePage(driver);
		hp.createNewTaskButton();
		Thread.sleep(4000);

		
		//close the browser
		bt.tearDown();
	}
}
