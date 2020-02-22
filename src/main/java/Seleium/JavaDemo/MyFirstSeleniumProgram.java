package Seleium.JavaDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSeleniumProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpaul1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//Launch Chrome driver is a class it is created by selinium
		ChromeDriver driver=new ChromeDriver();
		//Navigate to the site
		String url="https://www.amazon.com/";
		driver.get(url);
		//Get the title of website
		System.out.println(driver.getTitle());
		//Click on menu button
		driver.findElement(By.id("nav-hamburger-menu")).click();
		//Click on Hello Sign in button
		driver.findElement(By.id("hmenu-customer-name")).click();
		
		
		
		driver.findElement(By.xpath("//div[@id='nav-xshop']/a")).click();
		
		//div[@id='nav-xshop']/a[2]
		
		driver.findElement(By.xpath("div[@id='nav-xshop']/a[2]")).click();
		
		driver.findElement(By.xpath("div[@id='nav-xshop']/a[3]")).click();
		
		//h1/div[@class='gbh1-bold']
		driver.findElement(By.xpath("h1/div[@class='gbh1-bold']")).click();
		
		// 
	}

}
