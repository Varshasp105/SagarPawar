package Com.Ecommerce.TestCases;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC_Ecommere_LoginPage;

public class TC_LoginTestCase extends Ecommerce_BaseClass{

	
	@Test
	public void LoginTestCase() throws InterruptedException, IOException{
		
		logger.info("Open commerce URL");
		TC_Ecommere_LoginPage TEL  = new TC_Ecommere_LoginPage();
		Thread.sleep(2000);
		
		TEL.SetUsername(username);
		System.out.println("hii");
		Thread.sleep(2000);
		
		logger.info("Enter user mail");
		Thread.sleep(2000);
		
		TEL.SetPassword(password);
		logger.info("Enter user password");
		Thread.sleep(2000);
		
		
		TEL.ClickButton();
		logger.info("Click on the login button");
		Thread.sleep(3000);
		
		if(driver.getTitle().equals("nopCommerce demo store")) {
			
			Assert.assertTrue(true);
			logger.info("Login successfully");
		}
		else {
			//getScreenshotAs("LoginTestcase");
			Assert.assertTrue(false);
			logger.info("Login failed");
			
		}
		
	}
}