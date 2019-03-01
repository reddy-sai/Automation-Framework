package dolibarr;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.actitime.UtilLibrary.baseClass;

public class DolibarrAccountancyTreasuryarea {
	
	@FindBy(xpath="//a[@href='/dolibarr-3.1.1/htdocs/fourn/facture/fiche.php?action=create']")
	private WebElement clickOnNewInvoice;
	
	
	
	public DolibarrAccountancyTreasuryarea()
	{
		PageFactory.initElements(baseClass.driver, this);
	}

	public void newInvoice()
	{
		clickOnNewInvoice.click();
	}

}
