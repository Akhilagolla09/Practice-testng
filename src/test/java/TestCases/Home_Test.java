package TestCases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import webpages.HomePage;

public class Home_Test extends drivertest {

/*	@Test
	public void HomePage_test() throws InterruptedException {

		HomePage obj = new HomePage(driver);

		obj.search();
		obj.select();
		obj.cart();
		obj.msg();
		
		test = report.startTest("Homepage_Test");
		test.log(LogStatus.PASS, "Test is Pass");
		report.endTest(test);
		report.flush();

	} */
	
	@Test (dataProvider ="getData")
	public void Home_Method(String ItemName) {
		HomePage home = new HomePage(driver);
		home.sendKeys(ItemName);
	}
	
	@DataProvider
	public Object[][] getData(){
		
		String sheetname ="SeleniumExcel";
		int rows =excel.getRowCount(sheetname);
		int cols =excel.getRowCount(sheetname);
		
		Object[][] data = new Object[rows -1][cols];      //[1][1]
		
		for(int rownum =2;rownum<=rows; rownum++) {
			
			for(int colnum=0; colnum<cols;colnum++) {
				
				//data[0][0]
				data[rownum-2][colnum]= excel.getCellData(sheetname, colnum, rownum);
			}
		}
		
		return data;
		
		
	}
	

}
