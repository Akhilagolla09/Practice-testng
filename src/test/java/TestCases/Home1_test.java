package TestCases;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import webpages.Homepage1;

public class Home1_test extends drivertest{
	
	
	public class Home1_Test extends drivertest {
	
		
		@Test
		/*public void test() {
			Homepage home = new Homepage(driver);
			home.clickVote();
		}*/
		/*public void add_to_cart_Test() throws InterruptedException {
			Homepage home = new Homepage(driver);
			home.search_Product();
			home.select_item();
			home.clickAddCart();
			home.validate_text();

		}*/
		public void size() throws InterruptedException {
			Homepage1 home = new Homepage1(driver);
			home.apperal_Shoes();
			home.get_item_list();
			home.filter_operations();
			home.add_to_cart();
			home.cartPage();
			home.estimated_Shipping();
			home.checkout();
			
			
			test = report.startTest("Homepage1_Test");
			test.log(LogStatus.PASS, "Test is Pass");
			report.endTest(test);
			report.flush();
		}
	}

}
