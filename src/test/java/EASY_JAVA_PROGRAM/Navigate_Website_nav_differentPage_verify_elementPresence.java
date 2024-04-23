package EASY_JAVA_PROGRAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Navigate_Website_nav_differentPage_verify_elementPresence {

	@Test
	public void navigate_website_nav_differentPage_verify_presence_Of_Web_Element() {
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		//navigating a webpage
		driver.get("https://tutorialsninja.com/demo");
		
		//navigating a different page by clicking on a link 
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		//verifying the presence of element on the new page
		System.out.println(driver.findElement(By.xpath("//div[@class='well']/h2")).isDisplayed());
	}

}
