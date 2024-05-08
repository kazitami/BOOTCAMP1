package Registration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

	public class registrationTestCase extends TestBase{
		
		public registrationTestCase() throws Exception {
			super();
		}
		
		public WebDriver driver;
		public registrationPage registerpage;
		public HomePage homepage;
		public AccountSuccessPage accountsuccesspage;
		
		@BeforeMethod
		public void registerSetup() {
			driver = initalizeBrowserAndOpenApplication(prop.getProperty("browser"));
			homepage = new HomePage(driver);
			registerpage = homepage.combiningTwoActionsToNavigateToRegisterPage();
		}
		
		@Test(priority=1, dataProvider = "TNRegister", dataProviderClass = ExcelCode.class)
		public void verifyRegisterWithAllDetails(String firstname, String lastname, String telephone, String password, String confirmpassword) {
			accountsuccesspage = registerpage.combiningAllDetailsToNavigateToAccountSuccessPage(dataProp.getProperty("firstname"),
					dataProp.getProperty("lastname"), Util.emailWithDateTimeStamp(), dataProp.getProperty("telephone"), prop.getProperty("validPassword"), 
					prop.getProperty("validPassword"));
			Assert.assertTrue(accountsuccesspage.validateAccountSuccessCreatedMessage());
		}
		
		@AfterMethod
		public void tearDown() {
			driver.quit();
		}
	
}
