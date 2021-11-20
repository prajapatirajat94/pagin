package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Javascriptpractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chorome.drive", "chromedriver.exe"); // Open browser 
		ChromeDriver drv =new ChromeDriver();
		drv.get("https://www.roicians.com/"); // open website
		drv.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		drv.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions Action  = new Actions(drv);
		Action.moveToElement(drv.findElementByXPath("//*[@id=\"menu-item-65\"]/a")).build().perform();/* Open course
		 menu*/
		
		
		//Thread.sleep(8000);// wait time because site need time to open
		drv.findElementByCssSelector("#menu-item-1273 > a").click();// click on software testing
		JavascriptExecutor tm = (JavascriptExecutor)drv;
		// 1. method /tm.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(4000);
		//2.method
		WebElement bt = drv.findElementByCssSelector("#field-9vBb7eHpebC6vVp");
		//3 method
		tm.executeScript("arguments[0].scrollIntoView();",bt);
		Thread.sleep(3000);
		//4 method
		tm.executeScript("window.scrollBy(0,500)");
		
		/*drv.findElementById("text-164070506515").sendKeys("Rajatkumar");
		drv.findElementByCssSelector("#text-19286367673").sendKeys("Prajapatirajat94@gmail.com");// email 
		drv.findElementByCssSelector("#field-wTI4mJxnmH9CVeN").sendKeys("3068072515");// phone number
		drv.findElementByCssSelector("#field-9vBb7eHpebC6vVp").sendKeys("My program executed");// message */
		//drv.findElementByCssSelector("#button-9225410538").click(); // click on send button 
        
	}

}
