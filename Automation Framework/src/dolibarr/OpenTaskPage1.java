package dolibarr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.UtilLibrary.baseClass;

public class OpenTaskPage1 {

	@FindBy(xpath="//img[@alt='Logout']")
	private WebElement logoutButton;
	
	@FindBy(linkText="Projects & Customers")
	private WebElement ProjectsCustomers;
	
	
	
	
	public OpenTaskPage1()
	{
		PageFactory.initElements(baseClass.driver, this);
		
	}
public String retrieveTitleOfWebPage()
{
	String data= baseClass.driver.getTitle();
	return data;
}

public void clickOnProjectsCustomers()
{
	ProjectsCustomers.click();
}



public void clickOnLogoutButton() {
	
	logoutButton.click();
}

}
