package Seleium.JavaDemo.TextNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Seleium.JavaDemo.Library;

public class NewTest {
  @Test
  public void myFirstTestCase() {
 
	 // System.out.println(" My name is meghna");
	 // WebDriver driver =Library.launchChrome("https://letskodeit.teachable.com/p/practice"); 
  }
  
  WebDriver driver;
  @Test
  public void mysenondirstTestCase() {
	  System.out.println(" My name is paul");
	driver =Library.launchChrome("https://letskodeit.teachable.com/p/practice");
	driver.findElement(By.id("bmwradio")).click();
	
	//new Select(driver.findElement(By.id("carselect"))).selectByIndex(1);

	WebElement carclass=driver.findElement(By.id("carselect"));
	Select selectcarclass=new Select(carclass);
	selectcarclass.selectByValue("bmw");
	//new Select(driver.findElement(By.id("multiple-select-example"))).selectByIndex(1);
	WebElement multipleclass=driver.findElement(By.id("multiple-select-example"));
	Select selectmultipleclass=new Select(multipleclass);
	selectmultipleclass.selectByIndex(1);
	//driver.findElement(By.id("bmwcheck")).click();
	
	//WebElement bmw=driver.findElement(By.id("param[refiorbuy]"));
	//Select selectBuy=new Select(buy);
	//selectBuy.selectByVisibleText("Buy");
	
	//driver.findElement(By.id("xyz")).click();
	//driver.close();
}
  
 // @Test
  public void beforeTest() {
	  System.out.println("Before test");
	  
  }
  
 // @Test
  public void afterTest() {
	  System.out.println("After test");
	  
  }
}