package Steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class printVendor {
	
public ChromeDriver driver;
	
@Given("Open chrome browser")
public void openChromeBrowser() {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	 driver = new ChromeDriver();   
}

@Given("Maximize the browser")
public void maximizeTheBrowser() {
	driver.manage().window().maximize(); 
}

@Given("Set the timeout")
public void setTheTimeout() {
     driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
}

@Given("Enter the url")
public void enterTheUrl() {
     driver.get("https://acme-test.uipath.com/account/login");
}

@Given("Enter username as (.*)")
public void enterUsername(String username) {
     driver.findElementById("email").sendKeys(username);
}

@Given("Enter password as (.*)")
public void enterPassword(String passwd) {
     driver.findElementById("password").sendKeys(passwd);
}

@Given("Click Login")
public void clickLogin() {
     driver.findElementById("buttonLogin").click();
}

@Given("MouseHover Vendor")
public void mousehoverVendor() {
	Actions builder = new Actions(driver);
	WebElement ele = driver.findElementByXPath("//i[@class='fa fa-truck']/..");
	builder.moveToElement(ele).pause(3000).perform();
}

@Given("Click Search For Vendor")
public void clickSearchForVendor() {
	Actions builder = new Actions(driver);
	WebElement search = driver.findElementByXPath("//a[contains(text(),'Search for Vendor')]");
	builder.click(search).perform();  
}

@Given("Enter Vendor Tax ID as (.*)")
public void enterVendorTaxID(String taxID) {
	driver.findElementById("vendorTaxID").sendKeys(taxID);
}

@When("Click Search")
public void clickSearch() {
	driver.findElementById("buttonSearch").click();   
}

@Then("Print Vendor Name")
public void printVendorName() {
	String txt = driver.findElementByXPath("//table[@class='table']//tr[2]//td[1]").getText();
	System.out.println(txt); 
}

}
