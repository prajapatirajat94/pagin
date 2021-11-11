package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumday1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.drive", "chromedriver.exe");// step 1 browser opening
		// Step 2 = type url
		// create object of class whose method i wish to use 
		
		ChromeDriver driver = new ChromeDriver();// object creation of chromedriver class 
		driver.get("https://www.roicians.com/contact-us/");// open URL website 
		driver.findElement(By.id("text-77525447616")).sendKeys("Rajat");
		driver.findElement(By.id("text-95374915097")).sendKeys("Prajapati");
		//driver.findElement(By.id("field-tIgxvmTMez6ibt1")).sendKeys("3068567894");
		//driver.findElementById("text-27022866830").sendKeys("prajapatirajat94@gmail.com");
		//driver.findElementById("field-kJfKGbPLNi5yFI7").sendKeys("HEy my program get executed");
		
		driver.findElementById("button-18782068913").click(); // button click command .click
		String actual =driver.findElementByCssSelector("#parsley-id-9 > li").getText();
		
		String expected = "This value is required.";
	if(actual.equals(expected)) {
		System.out.println("test case passed");
	}
		else {
			System.out.println("test case failed");
		}
			
	
		
		
	}

}
