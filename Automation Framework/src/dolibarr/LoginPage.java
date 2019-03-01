package dolibarr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.UtilLibrary.baseClass;

public class LoginPage {

		@FindBy(name="username")
		private WebElement usernameTextField;
		@FindBy(name="pwd")
		private WebElement passwordTextField;
		@FindBy(xpath="//input[@type='submit']")
		private WebElement loginButton;
		
		
		public LoginPage()
		{
		PageFactory.initElements(baseClass.driver, this);
		}
		public void enterUsername(String username)
		{
			usernameTextField.sendKeys(username);
			
		}
		public void enterPassword(String password)
		{
			passwordTextField.sendKeys(password);
			
		}
public void clickOnLoginButton()
{
	loginButton.click();
	
}
}
