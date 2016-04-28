package demo.fitnesse.selenium;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class HelloGooglePage {
	private WebDriver driver;
	private WebElement element;

	private String URL;
	private String elementName;
	private String key;

	public HelloGooglePage(String URL, String elementName, String key) {
	    this.setURL(URL);
	    this.setElementName(elementName);
	    this.setKey(key);
	    						
//	    File file = new File("D:/Soft/selenium-IE-Driver/IEDriverServer_Win32_2.53.0/IEDriverServer.exe");
//	    System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
	    driver = new FirefoxDriver();
	}

	public void open(String URL) {
	    driver.get(URL);
	}

	public void findElement(String elementName){
	    element = driver.findElement(By.name(elementName));
	}

	public void sendKeys(String key){
	    element.sendKeys(key);
	    
	}

	public void submit(){
	    element.submit();
	}
	
	public void close(){
	    driver.close();
	}


	public String getURL() {
	    return URL;
	}

	public void setURL(String uRL) {
	    URL = uRL;
	}

	public String getKey() {
	    return key;
	}

	public void setKey(String key) {
	    this.key = key;
	}

	public String getElementName() {
	    return elementName;
	}

	public void setElementName(String elementName) {
	    this.elementName = elementName;
	}
}