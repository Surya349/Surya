package Surya;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample_greens {
public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\SuryA\\eclipse-workspace\\Org.course\\Driver\\chromedriver.exe");
	WebDriver driver = new FirefoxDriver();
	
	driver.get("http://www.greenstechnologys.com/");
	
	WebElement txt =driver.findElement(By.linkText("CONTACT US"));
	txt.click();
	
	WebElement txt1 =driver.findElement(By.id("InputName"));
	txt1.sendKeys("Surya");
	
	
	WebElement txt2 =driver.findElement(By.id("InputEmail1"));
	txt2.sendKeys("Surya@gmail.com");
	
	
	WebElement txt3 =driver.findElement(By.id("InputSubject"));
	txt3.sendKeys("1234567890");
	
	WebElement txt4 =driver.findElement(By.name("courses"));
	txt4.sendKeys("C++");
	
	WebElement txt5 =driver.findElement(By.name("branch"));
	txt5.sendKeys("OMR");
	
	
	WebElement txt6 =driver.findElement(By.name("time"));
	txt6.sendKeys("Immediately");
	
	WebElement txt7 =driver.findElement(By.name("comments"));
	txt7.sendKeys("1234567890");
	
	WebElement btn =driver.findElement(By.name("submit"));
	btn.click();
	
	
	}

		
}
