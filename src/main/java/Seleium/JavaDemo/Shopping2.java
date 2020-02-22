package Seleium.JavaDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

// Retrive telephone address and email id from the side http://shop.demoqa.com/
public class Shopping2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = Library.launchChrome("http://shop.demoqa.com/");
	WebElement address = driver.findElement(By.tagName("Address"));
	System.out.println("Address = "+ address.getText());
	//WebElement telephone = driver.findElement(By.xpath(".//span[text()='T']//following-sibling::a\"));"
	
			//WebElement telephone=driver.findElement(By.xpath(".//span[text()='T']//following-sibling::a"));
					//.getText();
			//System.out.println(telephone.getText());
			
			String telephone= driver.findElement(By.xpath(".//span[text()='T']//following-sibling::a")).getText();
			System.out.println("Telephone =  "+telephone);
			
			String mailID= driver.findElement(By.xpath(".//a[@class='phone-text']")).getText();
			System.out.println("mailID =  "+ mailID);
  
	}

}
