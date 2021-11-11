package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class seleniumtestng {
	Pom2 obj;
	WebDriver driver;
	SoftAssert soft;
	
	@BeforeMethod
	public void openbrowser()  {
	System.setProperty("webdriver.chrome.drive", "chromedriver.exe");
	driver = new ChromeDriver(); 
	driver.get("https://www.roicians.com/career/");
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 obj=new Pom2(driver);
	 soft = new SoftAssert();
	}
	@Test
	public void invalidfirstname() {
		obj.typefname("Raajaaaataaaa");
		boolean actual =driver.findElement(By.xpath("/html/body/div[3]/div/div/div/section[1]/div/div[1]/div/section/div/div/div/div[1]/div/h2")).isDisplayed();
		//Assert.assertEquals(actual, false);
		soft.assertEquals(actual, true);	
		//driver.close();
		soft.assertAll();
	}
	
	  @Test 
	  public void validfirstname() {
		  obj.typefname("Rajat");
		  
	 }
	  /*
	  @AfterMethod 
	  public void closebrowser() 
	  { driver.quit(); }*/
	 
}
