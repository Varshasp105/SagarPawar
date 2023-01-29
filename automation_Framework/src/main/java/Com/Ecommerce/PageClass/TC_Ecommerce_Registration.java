    package Com.Ecommerce.PageClass;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;

	import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

	public class TC_Ecommerce_Registration extends Ecommerce_BaseClass{
		
		public TC_Ecommerce_Registration()
		{
			PageFactory.initElements(driver, this);
		}
		@FindBy(xpath="//a[contains(text(),'Register')]")
		WebElement Registration;
		
		@FindBy(id="FirstName")
		WebElement FirstName;
		
		@FindBy(id="LastName")
		WebElement LastName;
		
		@FindBy(id="Email")
		WebElement Emailid;
		
		@FindBy(id="Password")
		WebElement Password;
		
		@FindBy(id="ConfirmPassword")
		WebElement ConfirmPassword;
		
		@FindBy(id="register-button")
		WebElement Regbutton;
		
		@FindBy(xpath="//div[contains(text(),'Your registration completed)]")
		WebElement RegisterSuccessfully;
		
		public void RegistrationForm()
		{
			Registration.click();
		}
		
		public void SetFirstName(String name)
		{
			FirstName.sendKeys(name);
		}
		
		public void SetLastName(String name)
		{
			LastName.sendKeys(name);
		}
		
		public void SetEmail(String emailid)
		{
			Emailid.sendKeys(emailid);
		}
		
		public void SetPassword(String Pass)
		{
			Password.sendKeys(Pass);
		}
		
		public void SetConfirmPassword(String Pass)
		{
			ConfirmPassword.sendKeys(Pass);
		}
		
		public void submit()
		{
			Regbutton.click();
		}
		
		public void RegSuccess() {
			System.out.println("Register successfully");
		}
	}
