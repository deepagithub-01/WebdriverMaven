package webdriverMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class LoginTest {
	
	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void login()
	{
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("nav-cart-count")).click();
		
		
	}
	
	@AfterSuite
	public void tearDown()
	{
		driver.quit();
	}

}
