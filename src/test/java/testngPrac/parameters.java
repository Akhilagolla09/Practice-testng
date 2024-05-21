package testngPrac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameters {

	WebDriver driver;
	
	@org.testng.annotations.Parameters({"browser","url"})
	@Test
	public void browserSetup(String browser, String url) {
		
		System.out.println("the browser is:" + browser);
		
		if(browser.equals("chrome")) {
			driver =new ChromeDriver();
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\GOAKHILA\\eclipse-workspace\\Task1\\chromedriver.exe");
		}
		
		driver.get(url); //given url in testngxml
	}
	
	
}
