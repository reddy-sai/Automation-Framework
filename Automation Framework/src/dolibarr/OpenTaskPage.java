package dolibarr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.UtilLibrary.baseClass;

public class OpenTaskPage {
	
	@FindBy(className="logoutImg")
	private WebElement logoutButton;
	
	public OpenTaskPage()
	{
		PageFactory.initElements(baseClass.driver, this);
		
	}
public String retrieveTitleOfWebPage()
{
	String data= baseClass.driver.getTitle();
	return data;
}

public void clickOnLogoutButton() {
	logoutButton.click();
}
}
