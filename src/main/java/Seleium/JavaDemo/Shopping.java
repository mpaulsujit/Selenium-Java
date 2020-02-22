package Seleium.JavaDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Shopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Launcing site from chrome using Library 
WebDriver driver = Library.launchChrome("http://shop.demoqa.com/");
//
WebElement message = driver.findElement(By.xpath("/html/body/p"));
System.out.println(message.getText());

// Click on dismiss button. a is for hanker.
////WebElement dismiss = driver.findElement(By.xpath("/html/body/a"));
//dismiss.click();
// Did not click on Dismiss link
//driver.findElement(By.xpath("/html/body/a")).click();
//driver.findElement(By.linkText("Dismiss")).click();
//driver.findElement(By.partialLinkText("miss")).click();
//driver.findElement(By.tagName("a")).click();
//div[text()='SHOP NOW > '

//Did not click shop now 
driver.findElement(By.linkText("SHOP NOW")).click();
	}
}