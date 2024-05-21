//package testngPrac;
//
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterSuite;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeSuite;
//import org.testng.annotations.Test;
//
//public class annotations {
//
//	
//	@BeforeSuite
//	public void OpenDBconnect() {
//		System.out.println("DB is opened");
//	}
//	
//	
//	@AfterSuite
//	public void CloseDBconnect(){
//		System.out.println("DB is closed");
//	}
//	
//	@BeforeMethod
//	public void OpenBrowser() {
//		System.out.println("browser is opened");
//	}
//	
//	@AfterMethod
//	public void CloseBrowser() {
//		System.out.println("browser is closed");
//	}
//	
//	
//	
//	@Test(priority = 0)
//	public void LoginStatus() {
//		System.out.println("Login Successful");
//	}
//	
//	
//	@Test(priority = 1)
//	public void TitleVerification() {
//		System.out.println("Title validated");
//	}
//	
//	@Test(priority = 2)
//	public void TitleVerification() {
//		System.out.println("Title validated");
//		
//	}
//	
//	
//}
