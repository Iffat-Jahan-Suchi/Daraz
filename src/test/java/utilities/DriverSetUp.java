package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverSetUp {
	private static String browserName = System.getProperty("browser", "chrome");
	private static final ThreadLocal<WebDriver> LOCAL_DRIVER = new ThreadLocal<>();

	public static void setDriver(WebDriver driver) {
		DriverSetUp.LOCAL_DRIVER.set(driver);
	}

	public static WebDriver getDriver() {
		return LOCAL_DRIVER.get();
	}

	public static WebDriver getBrowser(String browserName ) {
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			return new ChromeDriver();

		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			return new FirefoxDriver();

		case "edge":
			WebDriverManager.edgedriver().setup();
			return new EdgeDriver();
			
			default:
				throw new RuntimeException("browser not found!you given the name "+browserName);
				
		}
		
	}

	@BeforeTest
	public static synchronized void setBrowser() {
		WebDriver WebDriver=getBrowser(browserName);
		WebDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebDriver.manage().window().maximize();
		setDriver(WebDriver);

	
	}

	@AfterTest
	public void qhuitBrowser() {
		getDriver().close();
	}

}
