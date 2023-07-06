package com.basic.automation;

import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MenuPractice {
	public static WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("allow-all-origins");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/");
		driver.findElement(By.cssSelector("left-pannel div:nth-child(4) ul li:nth-child(8)")).click();

	}

	@Test
	public void menu() {

		WebElement element = driver
				.findElement(By.cssSelector("#nav li:nth-child(2) ul li:nth-child(3) li:nth-child(2)"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();
	}

	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
