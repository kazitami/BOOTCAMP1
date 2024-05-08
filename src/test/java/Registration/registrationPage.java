package Registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registrationPage {
	public WebDriver driver;
	
	//Locating WebElement
	@FindBy(id = "input-firstname")
	private WebElement firstnameTextBox;
	
	@FindBy(id = "input-lastname")
	private WebElement lastnameTextBox;
	
	@FindBy(id = "input-email")
	private WebElement emailTextBox;
	
	@FindBy(id = "input-telephone")
	private WebElement telephoneTextBox;
	
	@FindBy(id = "input-password")
	private WebElement passwordTextBox;
	
	@FindBy(id = "input-confirm")
	private WebElement confirmPasswordTextBox;
	
	@FindBy(xpath = "//input[@name = 'newsletter' and @value='1']")
	private WebElement subscribeNewsLetterYesRadioButton;
	
	@FindBy(css = "a.agree+input")
	private WebElement privacyPolicyCheckBox;
	
	@FindBy(css = "input.btn.btn-primary")
	private WebElement continueButton;
	
	
	//initializing constructor
	public registrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	

	public void enterFirstName(String firstnameText) {
		firstnameTextBox.sendKeys(firstnameText);
	}
	
	public void enterLastName(String lastnameText) {
		lastnameTextBox.sendKeys(lastnameText);
	}
	
	public void enterEmail(String emailText) {
		emailTextBox.sendKeys(emailText);
	}
	
	public void enterTelephone(String telephoneText) {
		telephoneTextBox.sendKeys(telephoneText);
	}
	
	public void enterPassword(String passwordText) {
		passwordTextBox.sendKeys(passwordText);
	}
	
	public void enterConfirmPassword(String confirmpasswordText) {
		confirmPasswordTextBox.sendKeys(confirmpasswordText);
	}
	
	public void clickOnNewsLetterRadioButton() {
		subscribeNewsLetterYesRadioButton.click();
	}
	
	public void checkPrivacyPolicyCheckBox() {
		privacyPolicyCheckBox.click();
	}
	
	public void clickOnContinueButton() {
		continueButton.click();
	}

	public AccountSuccessPage combiningAllDetailsToNavigateToAccountSuccessPage(String firstnameText, 
		String lastnameText, String emailText, String telephoneText, String passwordText, String confirmpasswordText) {
		
		firstnameTextBox.sendKeys(firstnameText);
		lastnameTextBox.sendKeys(lastnameText);
		emailTextBox.sendKeys(emailText);
		telephoneTextBox.sendKeys(telephoneText);
		passwordTextBox.sendKeys(passwordText);
		confirmPasswordTextBox.sendKeys(confirmpasswordText);
		subscribeNewsLetterYesRadioButton.click();
		privacyPolicyCheckBox.click();
		continueButton.click();
		return new AccountSuccessPage(driver);
	}
}
