package dolibarr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.UtilLibrary.baseClass;

public class Dolibarrsetup {

	
	@FindBy(linkText="Financial")
	private WebElement clickOnFinancial;
	
	

	public Dolibarrsetup()
	{
		PageFactory.initElements(baseClass.driver, this);
		
	}
	
	public void Financial()
	{
		clickOnFinancial.click();
	}
}