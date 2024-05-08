package HomePageNavigation;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homePageNavigationTestcase extends TestBase{
	 public homePageNavigationTestcase() throws Exception {
		super();
	}

	private WebDriver driver;
	 private NavigationHomePage homePage;
	   
	 @BeforeMethod
	 public void setup() {
		 driver = initalizeBrowserAndOpenApplication(prop.getProperty("browser"));
			homePage = new NavigationHomePage(driver);
	 }   
	 
	 @Test()
	    public void testHomePageElements() {
	        assert homePage.isLogoDisplayed();

	        // Verify search bar is displayed
	        assert homePage.isSearchBarDisplayed();

	        // Click on About Us link
	        homePage.clickAboutUsLink();
	    }

	    @AfterMethod
	    public void tearDown() {
	       // driver.quit();
	    }
}
