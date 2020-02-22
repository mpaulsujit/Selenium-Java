package Seleium.JavaDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MortgageCalculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://www.mortgagecalculator.org/";
WebDriver driver = Library.launchChrome(url);//

//label[text()=' Home Value: ']//following-sibling::input
//WebElement Homevalule= driver.findElement(By.TagName"//label[text()=' Home Value: ']//following-sibling::input");
//driver.clear();
driver.findElement(By.xpath("//label[text()=' Home Value: ']//following-sibling::input")).clear();
driver.findElement(By.xpath("//label[text()=' Home Value: ']//following-sibling::input")). sendKeys("1200");

	//locator by id
	driver.findElement(By.id("downpayment")).clear();
	driver.findElement(By.id("downpayment")). sendKeys("1500");
	//locator by name
	driver.findElement(By.name("param[principal]")).clear();
	driver.findElement(By.name("param[principal]")). sendKeys("400000");
	// Locator by label and this is the standard one
	driver.findElement(By.xpath("//label[text()=' Interest Rate: ']//following-sibling::input")).clear();
	driver.findElement(By.xpath("//label[text()=' Interest Rate: ']//following-sibling::input")). sendKeys("4.0");
	//locator by input and by index
	driver.findElement(By.xpath("(//input[@class='right-cell'])[5]")).clear();
	driver.findElement(By.xpath("(//input[@class='right-cell'])[5]")). sendKeys("10");
	//Start Date
	
	WebElement startMonth=driver.findElement(By.name("param[start_month]"));
	Select obj=new Select(startMonth);
	obj.selectByVisibleText("May");
	
	//(//input[@class='right-cell'])[10]
	//Property tax
	
	//driver.findElement(By.xpath("(//input[@class='right-cell'])[7]")).clear();
	//driver.findElement(By.xpath("(//input[@class='right-cell'])[7]")). sendKeys("450");
	//Same code write in diferent way
	WebElement propertytax = driver.findElement(By.xpath("(//input[@class='right-cell'])[7]"));
	propertytax.clear();
	propertytax.sendKeys("450");
	//pmi
	WebElement pmi = driver.findElement(By.xpath("(//input[@class='right-cell'])[8]"));
			pmi.clear();
	
	pmi. sendKeys(".7");
	
	//home insurance
	
	WebElement homeInsurance = driver.findElement(By.xpath("(//input[@class='right-cell'])[9]"));
	homeInsurance.clear();
	homeInsurance. sendKeys("50");
	
	driver.findElement(By.xpath("(//input[@class='right-cell'])[10]")).clear();
	driver.findElement(By.xpath("(//input[@class='right-cell'])[10]")). sendKeys("100");
	
	WebElement loanType=driver.findElement(By.name("param[milserve]"));
	Select selectLoanType=new Select(loanType);
	selectLoanType.selectByIndex(1);
	//selectLoanType.selectByVisibleText("FHA");
	//selectLoanType.selectByValue("2");
	//selectLoanType.selectByIndex(index);

	WebElement buy=driver.findElement(By.name("param[refiorbuy]"));
	Select selectbuy=new Select(buy);
	selectbuy.selectByIndex(0);
	//WebElement creditrating =driver.findElement(By.name(""));
	//Select selectbuy=new Select(buy);
	//selectbuy.selectByIndex(0);
	
	
	
	//input[@name='cal']
	WebElement calculate=driver.findElement(By.xpath("//input[@name='cal']"));
	
	calculate.click();
	// this is hard stop
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	try {
		Thread.sleep(5000);
	} catch (InterruptedException e)
	
	WebElement monthlyPayment=driver.findElement(By.xpath("//div[@class='repayment-block']//h3"));
	String mPay=monthlyPayment.getText();
	System.out.println("Your monthly payment is: "+mPay);
}

	

	}

