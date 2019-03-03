package testcases;

import org.junit.Before;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.Login;
import pages.dashboard;
import com.framework.design.ProjectMethods;

public class TC001_PrintVendorName extends ProjectMethods {
		
		@BeforeTest
		public void setData() {
			testCaseName = "TC001_PrintVendorName";
			testDescription = "Login into acme";
			testNodes = "PrintVendorName";
			author = "Jayashree";
			category = "smoke";
			dataSheetName = "TC001";			
		}
		
		@Test(dataProvider="fetchData")
		public void Login(String username, String password, String taxId) throws InterruptedException {
			new Login()
			.enterUserName(username)
			.enterPassword(password)
			.clickLogin()
			.mouseHoverVendor()
			.searchVendor()
			.enterTaxId(taxId)
			.clickSearch()
			.getTableText();
}
}