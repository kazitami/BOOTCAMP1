package LoginFunctionality;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// in the Page class, we will define the WebElements, we will initialize the
	// WebElements and we will create actions for those WebElements

	public WebDriver driver;

	@FindBy(linkText = "My Account")
	private WebElement myAccountDropdown;

	@FindBy(linkText = "Login")
	private WebElement loginOption;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public LoginPage combiningTwoActionsToNavigateToLoginPage() {
		myAccountDropdown.click();
		loginOption.click();
		return new LoginPage(driver);
	}
}
