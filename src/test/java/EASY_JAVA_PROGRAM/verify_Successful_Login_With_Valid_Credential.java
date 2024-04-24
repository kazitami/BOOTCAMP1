package EASY_JAVA_PROGRAM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class verify_Successful_Login_With_Valid_Credential {
	public WebDriver driver;
	
@BeforeMethod
public void setup() {
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.get("https://tutorialsninja.com/demo");
	driver.findElement(By.linkText("My Account")).click();
	driver.findElement(By.linkText("Login")).click();
}
@Test(priority=1)
public void verify_Login_With_Valid_Credential() {
	driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
	driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
	System.out.println("Login Successfull");
}

@AfterMethod
public void tearDown() {
	driver.quit();
}
}
