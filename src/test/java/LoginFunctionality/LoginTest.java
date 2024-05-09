package LoginFunctionality;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

	public LoginTest() throws Exception {
		super();
	}

	public WebDriver driver;
	public LoginPage loginpage;
	public HomePage homepage;
	public AccountPage accountpage;

	@BeforeMethod
	public void loginSetup() {
		driver = initalizeBrowserAndOpenApplication(prop.getProperty("browser"));
		homepage = new HomePage(driver);
		loginpage = homepage.combiningTwoActionsToNavigateToLoginPage();
	}

	@Test(priority = 1)
	public void verifyLoginWithValidCredentials() {
		accountpage = loginpage.navigateToLoginPageByCombining3Actions(prop.getProperty("validEmail"),prop.getProperty("validPassword"));
		Assert.assertTrue(accountpage.validateDisplayStatusOfLogoutLink());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
