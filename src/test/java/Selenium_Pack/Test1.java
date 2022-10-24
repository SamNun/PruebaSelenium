package Selenium_Pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
public static void main (String[] args)throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","./src/test/resources/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.com/");
		WebElement myElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		myElement.click();
		WebElement correo = driver.findElement(By.name("email"));
		correo.sendKeys("tutorial");
		Thread.sleep(5000);
		driver.quit();
	}
}
