package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPOM {
	WebDriver driver;
	@FindBy(id="text-77525447616") WebElement fname;
	//driver.findElemnt by id("")
	
	@FindBy(id = "text-95374915097") WebElement Lname;
	// will create all method for element
	
	
	public ContactPOM(WebDriver driver) {
		PageFactory.initElements( driver , this);
	}
	public void typefname(String name) {
		//driver.findelement(By id..)
		fname.sendKeys(name);
	}

}
