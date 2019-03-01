package dolibarr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.UtilLibrary.baseClass;

public class EditCustomerInformation {

	
	@FindBy(xpath="//input[@value='Delete This Customer']")
	private  WebElement deleteButton;


public EditCustomerInformation()
{
	PageFactory.initElements(baseClass.driver, this);
}

public  void deletecustomer()
{
	deleteButton.click();
}
public void popup()
{
	baseClass.driver.switchTo().alert().accept();
}

}
