package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class calendertest {
static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.drive", "chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).click();
	WebDriverWait wait = new WebDriverWait(driver,5);
	
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ui-datepicker-calendar")));// calender month &year
 Selectdate("25","November","2021");
 
	}
	public static  String[] getmonthyear(String MonthYear) {
		return MonthYear.split(" ");
		
		
	}
public static void Selectdate(String exdate, String exmonth,String exyear) {
	String MonthYear =driver.findElement(By.className("ui-datepicker-title")).getText();// date table	 
	System.out.println(MonthYear);
		 
	 while(!(getmonthyear(MonthYear)[0].equals(exmonth)
			 &&
			 getmonthyear(MonthYear)[1].equals(exyear))){
		 driver.findElement(By.xpath("//a[@title='Next']")).click();
		 MonthYear =driver.findElement(By.className("ui-datepicker-title")).getText();
		 
	 }
	 driver.findElement(By.xpath("//a[text()='"+exdate+"']")).click();
}
}
