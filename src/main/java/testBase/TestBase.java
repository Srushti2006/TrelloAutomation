package testBase;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public static FileInputStream file;

	public TestBase() {
		prop = new Properties();
		try {
		 file = new FileInputStream("C:\\Users\\Srushti\\eclipse-workspace\\TrelloAutomation\\credentials.properties");
		 prop.load(file);
		} 
		catch (Exception e) {

			e.printStackTrace();
		} 
	}
	
	public void initialization() {
		String browser = prop.getProperty("browser");
		
		if(browser.contains("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if(browser.contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else {
			System.out.println("Please Select Valid Brower");
		}
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(prop.getProperty("website"));
	}
	
}


