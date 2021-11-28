package org.AdactinStepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;	

	public WebDriver getdriver() {
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
      return driver;
	}
	
	public void loadUrl(String url) {
		driver.get(url);
 
	}
	public void sendValues(WebElement element,String value) {
		element.sendKeys(value);

	}
	public void elememntClick(WebElement element) {
		element.click();

	}
	 public static WebElement findById(String Id) {
		 WebElement RefName = driver.findElement(By.id(Id));
		 return RefName;
	}
	 public static WebElement findByName(String Name) {
    WebElement RefNam = driver.findElement(By.name(Name));
     return RefNam;
    }
	

}
