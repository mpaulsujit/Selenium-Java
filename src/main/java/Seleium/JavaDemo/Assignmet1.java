package Seleium.JavaDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Assignmet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Library.launchChrome("https://www.testandquiz.com/selenium/testing.html");
		
		//First Text Print: This is sample text.
		//WebElement firsttext = driver.findElement(By.xpath("//b[text()='This is sample text.']"));
		//System.out.println(firsttext.getText());
		
		//second text print 'Link : ']
		//WebElement secondtext = driver.findElement(By.xpath("a[text()=//b[text()='Link : '"));
		//System.out.println(secondtext.getText());
		
		//Click on link and expect open a page.]
		
		driver.findElement(By.xpath("//a[text()='This is a link']")).click();
		
		System.out.println(driver.getTitle());
		
		driver.navigate().back();
		
		
		
		// Question. I want to see a particular page is open
		//Verify text ='TextBox : '
		//WebElement boxtext = driver.findElement(By.xpath("//b[text()='TextBox : ']"));
		//System.out.println(boxtext.getText());
		//enter Meghna in text box??
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("meghna");
		
		//WebElement startMonth=driver.findElement(By.name("param[start_month]"));
		//Select obj=new Select(startMonth);
		//obj.selectByVisibleText("May"); on button submit. xpath: //Button[text()='Submit']
		
		driver.findElement(By.xpath("//Button[text()='Submit']")).click();
		
		
		//click on radio button female. //input[@id='female']
		
		driver.findElement(By.id("female")).click();
		
		// Check the box Automation. xpath: //input[@value='Automation']
		driver.findElement(By.xpath("//input[@value='Automation']")).click();
		driver.findElement(By.xpath("//input[@value='Performance']")).click();
		
		//Select from dropdown. //select[@id='testingDropdown']
		
		WebElement dropdown= driver.findElement(By.xpath("//select[@id='testingDropdown']"));
		Select selectdropdown= new Select(dropdown);
		selectdropdown.selectByVisibleText("Database Testing");
		
	}

	
		
	}


