package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicitwait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.drive", "chromedriver.exe");// step 1 browser opening
		
		
		WebDriver driver = new ChromeDriver();// object creation of chromedriver class 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		//dynamic wait
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// it gives time to load page
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

	}

}
