package Com.Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

public class TC_Ecommere_LoginPage extends Ecommerce_BaseClass {
	
	public TC_Ecommere_LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	public WebElement Username;
	
	@FindBy(id="Password")
	public WebElement Password;
	
	@FindBy(xpath="//button[contains(text(),'Log in')]")
	public WebElement LoginBtn;

	@FindBy(xpath="//button[contains(text(),'Log Out')]")
	public WebElement LogoutBtn;
	
	public void SetUsername(String Uname)
	{
		Username.sendKeys(Uname);
    }
	public void SetPassword(String Pass)
	{
		Password.sendKeys(Pass);
	}
	public void ClickButton()
	{
		LoginBtn.click();
	}
	public void Logout()
	{
		LogoutBtn.click();
	}
}