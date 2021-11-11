package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Contactus  {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.drive", "chromedriver.exe");// step 1 browser opening
		// Step 2 = type url
		// create object of class whose method i wish to use 
		
		WebDriver driver = new ChromeDriver();// object creation of chromedriver class 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.roicians.com/career/");// open URL website 
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		
		
		 Pom2 obj= new Pom2(driver);
		 
		 obj.typefname("Rajat");
		 obj.typelname("Prajapati");
		 obj.typeemail("Prajapatirajat94@gmail.com");
		 obj.Typephone("123456789");
		 obj.transferfile("C:\\Users\\praja\\Desktop\\Roician\\Java\\Array.docx");
		 obj.Writemessage("its my program");
		 obj.bttn();
		 
	}
	

}
