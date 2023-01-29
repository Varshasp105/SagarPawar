package Com.Ecommerce.PageClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

public class TC_Ecommerce_AddToCart extends Ecommerce_BaseClass {
	
	public TC_Ecommerce_AddToCart()
	{
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Computers ')]")
	public WebElement Com;
	
	@FindBy(xpath="//a[contains(text(),'Notebooks ')]")
	public WebElement Notebooks;
	
	@FindBy(xpath="//a[@title=\"Show details for Apple MacBook Pro 13-inch\"]")
	public WebElement selectMacbook;
	
	@FindBy(id="add-to-cart-button-4")
	public WebElement AddToCart;
	
	@FindBy(xpath="//p[contains(text(),'The product has been added to your ')]")
	public WebElement Message;
	
	@FindBy(xpath="//span[@title=\"Close\"]")
	public WebElement CloseTab;
	
	public void Notebook()
	{
		Notebooks.click();
	}
	
	public void SelectProduct()
	{
		selectMacbook.click();
	}
	
	
	public void AddToCart()
	{
		AddToCart.click();
	}
	
	
	
	public void ProductAdded()
	{
		Message.isDisplayed();
	}
	
	
	public void Close() 
	{
		CloseTab.click();
	 
	}
}
