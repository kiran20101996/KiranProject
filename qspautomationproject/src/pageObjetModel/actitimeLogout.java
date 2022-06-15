package pageObjetModel;

import java.io.IOException;

public class actitimeLogout extends BaseTest
{
	public static void main(String[] args) throws IOException, InterruptedException 
	{
	
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		flib flib = new flib();
	   String validUsername = flib.readproperties(prop_path, "username");
	   String validPassword = flib.readproperties(prop_path, "password");
		
	    LoginPage login = new LoginPage(driver) ;
		login.actiTimevalidLogin(validUsername,validPassword);
		
		HomePage logout = new HomePage(driver);
		
		logout.logoutLink();
		
		bt.tearDown();
	
		
    }


}
