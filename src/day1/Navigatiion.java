package day1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Navigatiion {
	private static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		
    String HomePage = "https://www.zlti.com";
    String url = "";
    HttpURLConnection huc = null;
    int respcode = 200;
    driver = new ChromeDriver();
    driver.manage().window().maximize();
    List<WebElement> links = driver.findElements(By.tagName("a"));
    Iterator<WebElement> it = links.iterator();
    while(it.hasNext()) {
    	
    	url = it.next().getAttribute("href");
    	System.out.println(url);
    
    if(url.isEmpty()||url == null) {
    	System.out.println("URL is either not configured for anchor tag or it is empty");
    	continue;	
    }
    if(!url.startsWith(HomePage)) {
    	System.out.println("URL belongs to another domain, skipping it");
    	continue;
    }
    
    
   try { huc =(HttpURLConnection)(new URL(url)).openConnection();
    huc.setRequestMethod("HEAD");
    huc.connect();
    respcode = huc.getResponseCode();
    }
   catch(MalformedURLException e){
	   e.getStackTrace();
   }
   catch(ProtocolException f) {
	   f.getStackTrace();
   }
   catch( IOException g) {
	   g.getStackTrace();
   }
				
    }

	}
}
	
	


