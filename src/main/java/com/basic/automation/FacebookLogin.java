package com.basic.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookLogin {
	public static WebDriver driver;

	@Test
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@Test
	public void Facebook() throws InterruptedException {

		WebElement element = driver.findElement(By.id("email"));
		element.sendKeys("chadhaakshat@gmail.com");
		Thread.sleep(600);
		WebElement pass = driver.findElement(By.id("passContainer"));
		pass.sendKeys("Akshat@123");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		WebElement loginbutton = driver.findElement(By.id("u_0_5_nT"));
		loginbutton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@AfterTest
	public void teardown() {
		driver.quit();

	}
}