package Seleium.JavaDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintADdress {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//retrive address, telephone 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpaul1\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String url= "http://shop.demoqa.com/";
		driver.get(url);
		driver.findElement(By.xpath("/html/body/p/a")).click();
		// why don't say here webelement instate of string
		
		String address= driver.findElement(By.tagName("address")).getText();
		String telephone= driver.findElement(By.tagName("")).getText();
		
		System.out.println("Address="+address);
		
	
	}

}
