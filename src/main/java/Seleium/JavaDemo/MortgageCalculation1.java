package Seleium.JavaDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MortgageCalculation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = Library.launchChrome("https://www.mortgagecalculator.org");
		//WebElement element = Library.clearAndTypeValue(element, value);
		
		//driver.findElement(By.id("homeval")).clear();
	//driver.findElement(By.id("homeval")).sendKeys("1000");
	//input[@name='param[homevalue]'], element locator by name
	driver.findElement(By.xpath("//input[@name='param[homevalue]']")).sendKeys("1000");
	
	driver.findElement(By.name("param[downpayment]")).clear();
	//driver.findElement(By.name("param[downpayment]")).sendKeys("5000");
	//instead of always write line sendkeys we can create function for send kays.
	
	WebElement downpayment = driver.findElement(By.name("param[downpayment]"));
	
	
	//element.sendKeys(100);
	
	}

}
       