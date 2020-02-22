package Seleium.JavaDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		
	// Verify user can register in facebook
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpaul1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url = "https://www.facebook.com";
		driver.get(url);
		//User information
		driver.findElement(By.id("email")).sendKeys("abc@fb.com");
		driver.findElement(By.id("pass")).sendKeys("abc@123");
		driver.findElement(By.id("u_0_m")).sendKeys("Meghna");
		driver.findElement(By.id("u_0_o")).sendKeys("Paul");
		driver.findElement(By.id("u_0_r")).sendKeys("732 947 0211");
		driver.findElement(By.id("u_0_w")).sendKeys("Coolkids#1");
		
		driver.findElement(By.id("Month")).sendKeys("Nov");
		driver.findElement(By.id("day")).sendKeys("13");
		driver.findElement(By.id("year")).sendKeys("1990");
		driver.findElement(By.id("u_0_a")).sendKeys("Male");
		// Get Title of the book
		System.out.println(driver.getTitle());
		 //Click on sign in and expect error message if required field is missing
		driver.findElement(By.id("u_0_13")).click();
	}

}
