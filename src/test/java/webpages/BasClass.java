package webpages;

import org.openqa.selenium.WebElement;

import TestCases.drivertest;

public class BasClass extends drivertest {
	

	
	public void sendKeys(WebElement el, String text) {
		el.sendKeys(text);
	}

	public void clickMethod(WebElement el) {
		el.click();
	}

	public void get_Text(WebElement eleme) {
		String s = eleme.getText();
		System.out.println(s);
	}
}

