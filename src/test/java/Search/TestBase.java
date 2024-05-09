package Search;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	public WebDriver driver;
	public ChromeOptions options;
	public Properties prop;
	public FileInputStream ip;
	public Properties dataProp;
	
	public TestBase() throws Exception {
		try {
			prop = new Properties();
			ip = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\Search\\Config.properties");
		    prop.load(ip);
		    
		    dataProp = new Properties();
		    ip = new FileInputStream( System.getProperty("user.dir") + "\\src\\test\\java\\Search\\testData.properties");
		    dataProp.load(ip);
		    
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public WebDriver initalizeBrowserAndOpenApplication(String browser) {
		if(browser.equals("chrome")) {
			options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NORMAL);
			options.addArguments("--start-maximized");
			options.addArguments("--incognito");
			options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation", "disable-infobars"));
			driver = new ChromeDriver(options);	
		}else if(browser.equals("firefox")) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();		
		}else if(browser.equals("Edge")) {
			driver = new EdgeDriver();
			driver.manage().window().maximize();	
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Util.IMPLICIT_WAIT_TIME));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Util.PAGELOAD_TIME_WAIT));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(Util.SCRIPT_TIME_WAIT));
		driver.get(prop.getProperty("url"));
		return driver;
	}

}
