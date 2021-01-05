package webDriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {
	
	public static WebDriver driver;
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
	}
	
	@Test
	public void doLogin() {
		driver.get("http://gmail.com");
		driver.findElement(By.id("Email")).sendKeys("gunit07thapar@gmail.com");
		driver.findElement(By.id("password")).sendKeys("sasdffds");
		driver.findElement(By.id("SignI")).click();
	}
	
	@AfterSuite
	public void tearDown() {
		driver.quit();
	}

}
