package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdownmenu {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("WebDriver.Chrome.Drive", "ChromeDriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.roicians.com/career/");
		Select obj = new Select(driver.findElement(By.id("field-jHhehcNamzHL47m")));// select dropdown menu
		//obj.selectByVisibleText("Automation Testing Trainer");
		//obj.selectByValue("Automation Testing Trainer");
		obj.selectByIndex(3);
		
		

	}

}
