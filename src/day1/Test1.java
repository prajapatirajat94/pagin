package day1;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

	@BeforeMethod
	public void openbrowser() {
		System.out.println("open browser");
	}
	
	@Test(priority = 1)
	public void writetestcase() {
		System.out.println(" in stlc we first write test case ");
	}
	
	@Test(priority = 2)
	public void executetestcase() {
		System.out.println("in stlc second we execute test cases ");
	}
	
	
	@Test(priority =3)
	public void defectlogin() {
			System.out.println(" in stlc lastly we log defect");
	}
	
}
