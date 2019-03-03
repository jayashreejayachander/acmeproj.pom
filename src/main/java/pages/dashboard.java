package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.design.ProjectMethods;

public class dashboard extends ProjectMethods {
		
		public dashboard() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(how=How.XPATH,using="//i[@class='fa fa-truck']/..") WebElement eleVendor;
		public dashboard mouseHoverVendor() {
			Actions builder = new Actions(driver);
			builder.moveToElement(eleVendor).pause(3000).perform();
			return this; 
		}
		
		@FindBy(how=How.XPATH,using="//a[contains(text(),'Search for Vendor')]") WebElement eleSearchVendor;
		public taxId searchVendor() {
			Actions builder = new Actions(driver);
			builder.click(eleSearchVendor).perform();
			return new taxId(); 
		}
}
