package Com.Ecommerce.TestCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC_Ecommere_LoginPage;
import Com.Ecommerce.Utilities.XLUtils;

public class TC_LoginDataTestCase extends Ecommerce_BaseClass{
	@Test(dataProvider="LoginData")
	
	public void Logindata(String user,String Pwd,String Expected) throws InterruptedException {
		logger.info("Open url");
		TC_Ecommere_LoginPage TEL=new TC_Ecommere_LoginPage();
		Thread.sleep(2000);
		
		TEL.SetUsername(user);
		System.out.println("Hello");
		Thread.sleep(2000);
		
		logger.info("Enter user mail");
		Thread.sleep(2000);
		
		TEL.SetPassword(Pwd);
		logger.info("Enter user password");
		Thread.sleep(2000);
		
		TEL.ClickButton();
		logger.info("Clicked on login button");
		String Actual_Result=driver.getTitle();
		String Expected_Result="nopCommerce demo store";
		
		if(Expected.equals("Valid"))
		{
			if(Actual_Result.equals(Expected_Result)) {
				TEL.Logout();
				Assert.assertTrue(true);
				}
			else {
				Assert.assertTrue(false);
			}
		}
		else if(Expected.equals("Invalid")) {
			if(Expected.equals(Actual_Result)) {
				TEL.Logout();
				Assert.assertTrue(false);
				}
			else {
				Assert.assertTrue(true);
			}
		}
	}
	@DataProvider(name="LoginData")
	public String[][] getdata() throws IOException{
	
		String path=System.getProperty("user.dir")+"/src/main/java/Com/Ecommerce/TestData/automation_Framework.xlsx";
		
		int rownum=XLUtils.getRowCount(path, "Sheet1");
		
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String[rownum][colcount];
		
		for(int i=1;i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++) {
				logindata[i-1][j]=XLUtils.getCellData(path,"Sheet1", i, j);
			}
		}
		
		return logindata;

	}
}
