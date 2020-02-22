package Seleium.JavaDemo;

import org.openqa.selenium.chrome.ChromeDriver;

public class Pinksideautomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Mpaul1\\Downloads\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver =new ChromeDriver();
driver.get("https://www.google.com");
		String url = "https://www.shop.demoqa.com";
driver.get(url);
	}

}
