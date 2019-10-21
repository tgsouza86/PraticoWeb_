package Pratico_Web_Cenário_Um;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.Before;

public class TestRule {
	
	private static WebDriver driver;
	@Before
	public void beforeCenario() {
	
	System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver/76.0.3809.87_chrome_installer.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
	driver.navigate().to("http://www.newtours.demoaut.com");
	
	}
	public static WebDriver getDriver() {
		return driver;
		
	}

}
