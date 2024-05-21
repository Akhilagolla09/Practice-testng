package webpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;

public class HomePage extends BasClass {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	By search = By.xpath("//input[@id='small-searchterms']");
	By select = By.xpath("//input[@class='button-1 search-box-button']");
	By cart = By.xpath("//input[@class='button-2 product-box-add-to-cart-button']");

	By msg = By.id("bar-notification");

	public void search() throws InterruptedException {
		WebElement el = driver.findElement(search);
		sendKeys(el, "Computing and Internet");
		clickMethod(el);
		Thread.sleep(2000);
	}

	public void select() throws InterruptedException {
		WebElement ele = driver.findElement(select);
		clickMethod(ele);
		Thread.sleep(2000);
	}

	public void cart() throws InterruptedException {
		WebElement elem = driver.findElement(cart);
		clickMethod(elem);
		Thread.sleep(2000);
	}

	public void msg() {
		WebElement eleme = driver.findElement(msg);
		get_Text(eleme);
	}
	
	
	public void sendKeys(String ItemName) {
		driver.findElement(search).sendKeys(ItemName);
		System.out.println(ItemName);
		
		Reporter.log("Item name entered");
		Reporter.log("<a href=\"C:\\Users\\GOAKHILA\\Pictures\\Thank you.png\">Image</a>");
	}

}
