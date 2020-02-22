package Seleium.JavaDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = Library.launchChrome("https://letskodeit.teachable.com/p/practice");
		
		driver.findElement(By.xpath("//h1"));
		driver.findElement(By.xpath("//h1"));
		//firsttext
		//System.out.println("firsttext");
		
		////legend[text()='Radio Button Example']
		
		//driver.findElement(By.xpath("//legend[text()='Radio Button Example']"));
		
		//input[@id='bmwradio']
		//driver.findElement(By.xpath("//input[@id='bmwradio']"));
		
		////legend[text()='Select Class Example']
		
		driver.findElement(By.xpath("//legend[text()='Select Class Example']"));
		//select[@id='carselect']
		
		
		//WebElement startMonth=driver.findElement(By.name("param[start_month]"));
		//Select selectStartMonth=new Select(startMonth);
		//selectStartMonth.selectByVisibleText("Mar");
		//*
		 //WebElement carselect=driver.findElement(By.xpath("//select[@id='carselect']"));
		// Select selectcar = new Select(carselect);
		
		//selectcar.selectByValue("bmw");
		
		//(//input[@name='cars' and @type='checkbox'])[1]
		driver.findElement(By.xpath("(//input[@name='cars' and @type=''])[1]"));
		driver.findElement(By.xpath("(//input[@name='cars' and @type='checkbox'])[1]"));
		
		
	}

}
