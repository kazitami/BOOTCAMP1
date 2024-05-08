package HomePageNavigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NavigationHomePage {

	private WebDriver driver;
	
	 @FindBy(id = "logo")
	 private WebElement logo;
	 
	 @FindBy(css = "input[name=search]")
	 private WebElement searchTextBox;
	
	 @FindBy(xpath = "//input[@class='form-control input-lg']")
	 private WebElement searchButton;
	 
	 @FindBy(xpath = "//a[text()='About Us']")
	 private WebElement aboutUsLink;
	 
	 public NavigationHomePage(WebDriver driver) {
		 this.driver = driver;
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	public boolean isLogoDisplayed() {
		 return searchTextBox.isDisplayed();
		
	}

	public boolean isSearchBarDisplayed() {
		 return searchButton.isDisplayed();
	}

	public void clickAboutUsLink() {
		 aboutUsLink.click();
	}  
}
