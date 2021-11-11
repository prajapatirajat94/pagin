package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Framehandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drive", "chromedriver.exe");// step 1 browser opening
		// Step 2 = type url
		// create object of class whose method i wish to use 
		
		WebDriver driver = new ChromeDriver();
		       driver.manage().window().maximize();
               driver.manage().deleteAllCookies();
               driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
               driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
               driver.get("https://freecrm.com/");
               Thread.sleep(5000);
               driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div/div/a")).click();
               driver.findElement(By.name("email")).sendKeys("Prajapatirajat94@gmail.com");
               driver.findElement(By.name("password")).sendKeys("Ksting@1234");
               driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
               Thread.sleep(4000);
              Actions action= new Actions(driver);
               action.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/a/i"))).build().perform();
               Thread.sleep(3000);
               driver.switchTo().frame("main-nav"); // Switch frame here
               driver.findElement(By.xpath("//*[@id=\"main-nav\"]/div[3]/button/i")).click();
               

               
	}

}
