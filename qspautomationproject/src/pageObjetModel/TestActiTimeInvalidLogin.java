package pageObjetModel;

import java.io.IOException;

public class TestActiTimeInvalidLogin  extends BaseTest{
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();//open the browser and launch the app
		
		flib flib = new flib();
		
		
		
		int rc = flib.getRowCount(excel_path,"actitime2");
		
		for(int i=1;i<=rc;i++)
		{
			String invalidUsername = flib.readExcelData(excel_path,"actitime2", i, 0);
			String invalidPassword = flib.readExcelData(excel_path,"actitime2", i, 1);
			
			LoginPage lp = new LoginPage(driver);
			//perform invalid login
			lp.actiTimeInvalidLogin(invalidUsername,invalidPassword);
			Thread.sleep(2000);
			lp.nameClear();
			
		}
		
		
		//close the browser
		bt.tearDown();
		
		
	}

}