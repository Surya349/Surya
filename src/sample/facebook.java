package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook {

	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SuryA\\eclipse-workspace\\Surya\\org.sample\\Driver\\chromedriver.exe");
	
WebDriver driver = new ChromeDriver();

driver.get("https://www.facebook.com/");

	WebElement dri =driver.findElement(By.id("email"));
	dri.sendKeys("9032564781");
	
	System.out.println("Executed");

	//driver.quit();
	
	}
}
