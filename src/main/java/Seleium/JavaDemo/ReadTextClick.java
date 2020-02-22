package Seleium.JavaDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ReadTextClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpaul1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

String url= "http://shop.demoqa.com/";
driver.get(url);
//find text 
WebElement message=driver.findElement(By.xpath("/html/body/p"));
	// Print Text
System.out.println(message.getText());

//click on link

	driver.findElement(By.xpath("/html/body/p/a")).click();

	}

}
