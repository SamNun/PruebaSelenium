package Selenium_Pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
public static void main (String[] args)throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","./src/test/resources/ChromeDriver/chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.com/");
		//inserta tu código aquí 
		Thread.sleep(5000);
		driver.quit();
	}
}
