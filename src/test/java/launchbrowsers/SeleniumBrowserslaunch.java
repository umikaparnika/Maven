package launchbrowsers;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SeleniumBrowserslaunch {
	WebDriver driver;

	@Test
	public void google() {
		driver.get("https://www.google.com");

		driver.switchTo().alert().accept();
		driver.findElement(By.name("q")).sendKeys("Tirupati");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}
