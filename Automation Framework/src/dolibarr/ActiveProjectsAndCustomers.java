package dolibarr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.actitime.UtilLibrary.baseClass;


public class ActiveProjectsAndCustomers {

	@FindBy(className="successmsg")
	private WebElement retrieveSuccessmsg;
	
	@FindBy(name="customerId")
	private WebElement customerdropdown;
	
	@FindBy(name="saveChanges")
	private WebElement saveButton;
	
	
	public ActiveProjectsAndCustomers()
	{
		PageFactory.initElements(baseClass.driver, this);
		
	}


	public void SelectProjectname(String s)
	{
		baseClass.driver.findElement(By.linkText(s)).click();
	}
	
	public void selectcustomer()
	{
		Select s1= new Select(customerdropdown);
		s1.selectByValue("14");
		
	}
	public void Savechanges()
	{
		saveButton.click();
	}
	
public String successmsg()
{
	String data = retrieveSuccessmsg.getText();
	return data;
}
	
	
}
