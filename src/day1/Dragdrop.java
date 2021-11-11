package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.drive", "chromedriver.exe");// step 1 browser opening
				
				
	WebDriver driver = new ChromeDriver();// object creation of chromedriver class 
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
	Thread.sleep(6000);
	
	driver.findElement(By.xpath("//*[@id=\"Accepted Elements\"]")).click();
	Thread.sleep(5000);
	driver.switchTo().frame(3); // selected frame 
	Actions action= new Actions (driver); // create action
	
	action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
	.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
	.release().build().perform();// Drag and drop function 
	
	}

}
