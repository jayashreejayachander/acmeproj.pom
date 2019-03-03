package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.framework.design.ProjectMethods;

public class Login extends ProjectMethods {
	
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.ID,using="email") WebElement eleUserName;
	public Login enterUserName(String username) {
		
		clearAndType(eleUserName, username);
		return this; 
	}
	
	@FindBy(how=How.ID,using="password") WebElement elePass;
	public Login enterPassword(String password) {
		
		clearAndType(elePass, password);
		return this; 
	}
	
	@FindBy(how=How.ID,using="buttonLogin") WebElement eleLogin;
	public dashboard clickLogin() {
		
		click(eleLogin);
		return new dashboard(); 
	}
}
