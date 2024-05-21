package webpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Homepage1 extends Baseclass1 {
	WebDriver driver;

	public Homepage1(WebDriver driver) {
		this.driver = driver;
	}

	// click on appreal-shoes
	By ap = By.xpath("//li[@class='inactive']/a[@href='/apparel-shoes']"); // appreal-shoes
	// count
	By item = By.xpath("//div[@class='picture']/child::a");//
	// filter
	By filter = By.xpath("//select[@id='products-orderby']");
	By filter1 = By.xpath("//select[@id='products-pagesize']");
	By filter2 = By.xpath("//select[@id='products-viewmode']");
	// click item and add to cart
	By jeans = By.xpath("//a[text()='Blue Jeans']");
	By quan = By.xpath("//input[@value='1']");
	By add = By.xpath("//input[@id='add-to-cart-button-36']");
	// cart page
	By shop = By.xpath("//span[text()='Shopping cart']");
	By tex = By.xpath("//span[@class='product-subtotal']");
	By quan1 = By.xpath("//input[@class='qty-input']");
	By update = By.xpath("//input[@name='updatecart']");

	// estimated shipping
	By country = By.xpath("//select[@id='CountryId']");
	By state = By.xpath("//select[@id='StateProvinceId']");
	By zipcode = By.id("ZipPostalCode");
	By estship = By.xpath("//input[@name='estimateshipping']");
	By text = By.xpath("//ul[@class='shipping-results']");
	By agree = By.xpath("//input[@id='termsofservice']");
	By check = By.xpath("//button[@id='checkout']");
	By email = By.xpath("//input[@autofocus='autofocus']");

	public void apperal_Shoes() {
		WebElement m = driver.findElement(ap);
		clickMethod(m);
	}

	public void get_item_list() {
		List<WebElement> c = driver.findElements(item);
		System.out.println(c.size());

	}

	public void filter_operations() throws InterruptedException {
		Select s1 = new Select(driver.findElement(filter));
		s1.selectByVisibleText("Price: Low to High ");
		Thread.sleep(5000);
		Select s2 = new Select(driver.findElement(filter1));
		s2.selectByIndex(0);

		Select s3 = new Select(driver.findElement(filter2));
		s3.selectByVisibleText("List");

	}

	public void add_to_cart() throws InterruptedException {
		WebElement ma = driver.findElement(jeans);
		clickMethod(ma);
		Thread.sleep(5000);
		WebElement mah = driver.findElement(quan);
		clearMethod(mah);
		sendkeysint(mah, "5");
		WebElement mahi = driver.findElement(add);
		clickMethod(mahi);
		Thread.sleep(5000);
	}

	public void cartPage() throws InterruptedException {
		WebElement mo = driver.findElement(shop);
		clickMethod(mo);
		WebElement mou = driver.findElement(tex);
		getText(mou);
		int actual = 5;
		Assert.assertEquals(5, 5.00);
		WebElement moun = driver.findElement(quan1);
		clickMethod(moun);
		clearMethod(moun);
		sendkeysint(moun, "7");
		getText(moun);
		int act = 7;
		// Assert.assertEquals(act, getText(moun));
		WebElement mouni = driver.findElement(update);
		clickMethod(mouni);
	}

	public void estimated_Shipping() throws InterruptedException {
		Select coun = new Select(driver.findElement(country));
		operations(coun);
		Thread.sleep(5000);
		Select stat = new Select(driver.findElement(state));
		operations(stat);
		WebElement zip = driver.findElement(zipcode);
		clickMethod(zip);
		sendkeysint(zip, "77494");
		WebElement est = driver.findElement(estship);
		clickMethod(est);
		WebElement date = driver.findElement(text);
		getText(date);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		WebElement ag = driver.findElement(agree);
		clickMethod(ag);

	}

	public void checkout() {
		WebElement ch = driver.findElement(check);
		clickMethod(ch);
		WebElement ema = driver.findElement(email);
		clickMethod(ema);
		sendkeysint(ema, "xyz@gmail.com");
	}

}
