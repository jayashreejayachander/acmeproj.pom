package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.design.ProjectMethods;

public class SearchResults extends ProjectMethods {
		public SearchResults() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(how=How.XPATH,using="//table[@class='table']//tr[2]//td[1]") WebElement eleTable;
		public SearchResults getTableText() {
			String txt = eleTable.getText();
			System.out.println(txt);
			return this;
			
		}
		
}
