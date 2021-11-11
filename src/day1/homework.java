package day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class homework {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrom.drive","chromdriver.exe");//open browser
	
	ChromeDriver drivers=new ChromeDriver();// declaring new object from ChromeDriver
	drivers.get("https://www.roicians.com/career/");// open website
	drivers.findElementByXPath("//*[@id=\"text-248418663108\"]").sendKeys("Rajatkumar");//Firstname
	//drivers.findElementByCssSelector("#text-58969147196").sendKeys("Prajapati");//Lastname
	drivers.findElementById("text-25931186823").sendKeys("Prajapatirajat94@gmail.com");// Email
	drivers.findElementByXPath("//*[@id=\"field-LfRVhp7sisH0kRP\"]").sendKeys("3068072515");//phonenumber
	drivers.findElementById("field-U7H2lPxWxSPqWeq").sendKeys("C:\\Users\\praja\\Desktop\\rajat");//attach resume
	drivers.findElementByCssSelector("#textarea-27447478041").sendKeys("its my program"); // Message
	drivers.findElementById("button-23567600038").click();// click button
	String actual = drivers.findElementByXPath("//*[@id=\"parsley-id-7\"]/li").getText();// actual result from site
	String expected = "This value is required.";
	if (actual.equals(expected)){
		System.out.println("Test case is passed");
	}
	else 
	{
		System.out.println("Test case is failed");
	}
	
	}

}
