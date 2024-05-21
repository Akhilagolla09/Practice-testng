package webpages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import TestCases.drivertest;

public class Baseclass1 extends drivertest{

	public void clickMethod(WebElement m) {
		m.click();
	}

	public void clearMethod(WebElement m) {
		m.clear();
	}

	public void sendkeysint(WebElement m,String s) {
		m.sendKeys(s);
	}

	public void getText(WebElement m) {
		String s=m.getText();
		System.out.println(s);
	}

	public void operations(Select coun) {
		List <WebElement> option1 = coun.getOptions();

		for(WebElement element:option1) {
			if(element.getText().equals("United States")) {
				element.click();
				break;
			}
		}
		for(WebElement element:option1) {
			if(element.getText().equals("Texas")) {
				element.click();
				break;
			}
		}
		/*for(WebElement element:option1) {
			if(element.getText().equals("")) {
				element.click();
				break;
			}
		}*/
	}
}
