package Com.Ecommerce.TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import Com.Ecommerce.PageClass.TC_Ecommerce_AddToCart;
import Com.Ecommerce.PageClass.TC_Ecommere_LoginPage;

public class TC_AddToCart extends Ecommerce_BaseClass{
	    @Test
		public void Addproduct() throws InterruptedException, IOException{
			
			logger.info("Open Ecommerce URL");
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
			
			TC_Ecommerce_AddToCart TEA=new TC_Ecommerce_AddToCart();
			Actions Act=new Actions(driver);
			
			WebElement Computer=driver.findElement(By.xpath("//a[contains(text(),'Computers ')]"));
			
			Act.moveToElement(Computer).perform();
			logger.info("Mouseover on computer");
			
			TEA.Notebook();
			logger.info("Product selected");
			
			TEA.SelectProduct();
			logger.info("Product selected");
			
			TEA.AddToCart();
			logger.info("Add to cart");
			
			TEA.ProductAdded();
			logger.info("Verified message");
			
			TEA.Close();
			logger.info("Click on the close tab");
			
			 
				  
			}
			 
	    }

