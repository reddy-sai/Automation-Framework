package dolibarr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.UtilLibrary.baseClass;

public class AddNewCustomer {
	
	@FindBy(name="name")
	private WebElement customerNameTextField;
	
	@FindBy(name="createCustomerSubmit")
	private WebElement createCustomer;
	
	
	
	public AddNewCustomer()
	{
		PageFactory.initElements(baseClass.driver, this);
		
	}
	
	
	public void addCustomerName(String customername) 
	{
		customerNameTextField.sendKeys(customername);
		
	}
	public void createCustomer()
	{
		createCustomer.click();
	}

	

}
