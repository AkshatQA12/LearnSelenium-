package com.basic.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NameTextBox {
	public static WebDriver driver;

	@BeforeTest
	public void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}
@Test(priority = 0)
	public void name() {
		driver.findElement(By.id("userName")).sendKeys("Akshat Chadha");
	}
@AfterTest
	public void teardown() {
		driver.quit();
	}
}
