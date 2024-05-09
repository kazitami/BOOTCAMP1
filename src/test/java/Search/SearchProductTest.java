package Search;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchProductTest extends TestBase{
	
	public SearchProductTest() throws Exception {
		super();
	}
	
public WebDriver driver;
public HomePage homepage;
public ProductPage productpage;
	
	@BeforeMethod
	public void Setup() {
		driver = initalizeBrowserAndOpenApplication(prop.getProperty("browser"));
	}
	
	@Test(priority=1)
	public void searchProduct() {
		homepage = new HomePage(driver);
		productpage = homepage.navigateToProductPage(dataProp.getProperty("validProduct"));
        Assert.assertTrue(productpage.verifyValidProductPresence());
	}
	
	
	@AfterMethod
	public void tearDown() {
		//driver.quit();
	}

}