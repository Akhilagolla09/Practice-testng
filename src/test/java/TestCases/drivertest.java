package TestCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

import Utilities.ExcelReader;
import Utilities.ExtentManager;


public class drivertest {

	static WebDriver driver;

	public static Logger log = Logger.getLogger("devpinoyLogger");
	public static ExtentReports report = ExtentManager.getInstance();
	public static ExtentTest test;
	public static ExcelReader excel =new ExcelReader("C:\\Users\\GOAKHILA\\eclipse-workspace\\Pracsel\\src\\test\\resources\\excel\\SeleniumExcel.xlsx");

	
	
	@BeforeSuite
	public void openBrowser() {
		EdgeOptions options = new EdgeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new EdgeDriver(options);
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\GOAKHILA\\eclipse-workspace\\Pracsel\\msedgedriver.exe");
    	log.debug("chrome browser is open");
		driver.get("https://demowebshop.tricentis.com/");
		log.debug("Url is open");
		driver.manage().window().maximize();
	}
	@AfterSuite
	public void closeBrowser() {
		if(driver != null) {
			driver.quit();
			log.debug("driver is closed");
		}
	}
}