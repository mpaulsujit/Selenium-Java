package Seleium.JavaDemo;

		import org.openqa.selenium.By;
		import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.chrome.ChromeDriverService;
		import org.openqa.selenium.remote.DesiredCapabilities;
		import org.openqa.selenium.remote.RemoteWebDriver;
		public class NewTour {

			public static void main(String[] args) {
				// TODO Auto-generated method stub
		//Automate google search page to verify the serach functionality
			/*	open a chrome browser
			 * go to google.com
			 * search selenium in google
			 * click on search
			 * verify the search result page
			 * close the chrome browser
			 */
				//step 1
				//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mpaul1\\Downloads\\chromedriver_win32\\chromedriver.exe");
				//WebDriverManager.chromedriver().setup(); need this when try to load google automatic way
				//step 2
				//ChromeDriver driver =new ChromeDriver();
				//step 3
				driver.get("https://www.amazon.com");
				//step 4, locators, there are 9 types of locator
				//driver.findElement(By.name("q")).sendKeys("Hello world"+Keys.ENTER);
				//driver.findElement(By.className("q")).sendKeys("Hello World" +Keys.ENTER);
				//step 5, title of search page
				
				//String title = driver.getTitle();
				//String title = driver.getCurrentu
				//System.out.println("Title of search:"+title);
				//driver.close();// close the browser
				//driver.quit();
				 
				//* Write a selenium 
				//WebDriver driver=Library.launchChrome("https://www.mortgagecalculator.org/");
				WebDriver driver = Library.launchChrome("https://newtours.demoaut.com/");
				// Server down soo did not download.
			}

		

	}


