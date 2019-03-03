package acmeProj;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acme {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/account/login");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElementById("email").sendKeys("jayashreejayachander@gmail.com");
		driver.findElementById("password").sendKeys("@runM123");
		driver.findElementById("buttonLogin").click();
		
		Actions builder = new Actions(driver);
		WebElement ele=driver.findElementByXPath("//i[@class='fa fa-truck']/..");
		WebElement search = driver.findElementByXPath("//a[contains(text(),'Search for Vendor')]");
		builder.moveToElement(ele).pause(3000).click(search).perform();
		
		driver.findElementById("vendorTaxID").sendKeys("DE767565");
		driver.findElementById("buttonSearch").click();
		String txt = driver.findElementByXPath("//table[@class='table']//tr[2]//td[1]").getText();
		System.out.println(txt);
		
		driver.close();
		
		
		
	}

}
