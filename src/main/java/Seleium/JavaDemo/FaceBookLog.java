package Seleium.JavaDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookLog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpaul1\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
String url = "https://www.facebook.com";
driver.get(url);
driver.findElement(By.id("email")).sendKeys("paulmeghna@yahoo.com");
driver.findElement(By.id("pass")).sendKeys("Tangai");
driver.findElement(By.id("u_0_b")).click();
	}

}
