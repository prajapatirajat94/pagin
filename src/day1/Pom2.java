package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom2   {
	WebDriver driver;
		
	@FindBy (id = "text-248418663108") WebElement fname; //driver.findElemnt by id("")
	@FindBy (id = "text-58969147196") WebElement lname;
	@FindBy (id = "text-25931186823") WebElement Email;
	@FindBy (id = "field-LfRVhp7sisH0kRP") WebElement Phone;
	@FindBy (id = "field-U7H2lPxWxSPqWeq") WebElement File;
	@FindBy (id = "textarea-27447478041") WebElement Message;
	@FindBy (id ="button-23567600038") WebElement Button;


	
	
	public Pom2(WebDriver driver) {// it also need to declare where we gave reference
		
		PageFactory.initElements(driver, this);/* will convert all local variable to 
		                                            global variable from method driver */
	}	
	public void typefname(String frname) {
		fname.sendKeys(frname);		 
		
	                          }
	public void typelname(String lrname) {
		lname.sendKeys(lrname);
	                          }
	public void typeemail(String Ermail) {
		Email.sendKeys(Ermail);
	                          }
	public void Typephone(String Prhone) {
		Phone.sendKeys(Prhone);
	                           }
	public void transferfile(String Trnsfer) {
		File.sendKeys(Trnsfer);
	}
	public void Writemessage(String typmsg) {
		Message.sendKeys(typmsg);	
	}
	public void bttn() {
		Button.click();
	               }
	}

		
	
	
	
	



        