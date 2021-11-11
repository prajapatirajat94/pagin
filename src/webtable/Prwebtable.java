package webtable;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prwebtable {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.drive","chromedriver.exe");
		driver = new ChromeDriver();
driver.get("https://datatables.net/");
//[@id="example"]/tbody/tr[1]/td[2]
//[@id="example"]/tbody/tr[2]/td[2]
String beforexpath = "//table[@id=\"example\"]/tbody/tr[";
String afterxpath ="]/td[2]";
List<WebElement>row= driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
int rowcount = row.size();
List<String> name = new ArrayList<String>();
for(int i=1;i<=rowcount;i++) {
	String totalxpath= beforexpath+i+afterxpath;
	String getname = driver.findElement(By.xpath(totalxpath)).getText();
	name.add(getname);
}
//WebElement nexte =driver.findElement(By.id("example_next"));
String next = driver.findElement(By.id("example_next")).getAttribute("class");
while(!next.contains("disabled")) {
	driver.findElement(By.id("example_next")).click();
	row= driver.findElements(By.xpath("//table[@id='example']/tbody/tr"));
	rowcount = row.size();
for(int i=1;i<=rowcount;i++) {
	String totalxpath= beforexpath+i+afterxpath;
	String getname = driver.findElement(By.xpath(totalxpath)).getText();
	name.add(getname);
}
next = driver.findElement(By.id("example_next")).getAttribute("class");
Thread.sleep(1000);
	}
System.out.println(name.size());
}
}
