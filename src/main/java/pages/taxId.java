package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.design.ProjectMethods;

public class taxId extends ProjectMethods {
	
	public taxId() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="vendorTaxID") WebElement eleTax;
	public taxId enterTaxId(String taxId) {
		
		clearAndType(eleTax, taxId);
		return this; 
	}
	
	@FindBy(how=How.ID,using="buttonSearch") WebElement eleSearch;
	public SearchResults clickSearch() {
		
		click(eleSearch);
		return new SearchResults(); 
	}
	
	
}
