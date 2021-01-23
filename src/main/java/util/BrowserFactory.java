package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sudip\\eclipse-workspace\\zzz\\driver\\chromedriver.exe");
		if(driver == null) {
			driver = new ChromeDriver();
		}
		//driver.get("https://www.techfios.com/billing/?ng=admin/");		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
		
	}
	
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
