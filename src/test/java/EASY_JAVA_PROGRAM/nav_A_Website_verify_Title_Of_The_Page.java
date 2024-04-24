package EASY_JAVA_PROGRAM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class nav_A_Website_verify_Title_Of_The_Page {
@Test
public void verifyTitleOfThePage() {
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	
	//navigating a webpage
	driver.get("https://tutorialsninja.com/demo");
	
	//Verifying the title of the page
	String actualTitle = driver.getTitle();
	String expectedTitle = "Your Store";
	
	String actualCurrentUrl = driver.getCurrentUrl();
	String expectedCurrentUrl = "https://tutorialsninja.com/demo/";
	
	if(expectedTitle.equals(actualTitle) && expectedCurrentUrl.equals(actualCurrentUrl)) {
		System.out.println("The title and current url of Login Page are correct");
	}
	else
	{
		System.out.println("The title and current url of Login Page are incorrect");
	}
	
	driver.quit();
	
}
}
