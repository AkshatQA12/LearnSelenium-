package com.basic.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePickerPractice {
	public static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);

		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}

	@Test(priority = 1)
	public void DatePick() {
		WebElement element = driver.findElement(By.className("react-datepicker-wrapper"));
		Actions actions = new Actions(driver);
		actions.moveToElement(element).click().build().perform();

		Select month = new Select(driver.findElement(By.className("react-datepicker__month-select")));
		month.selectByIndex(8);
		Select year = new Select(driver.findElement(By.className("react-datepicker__year-select")));
		year.selectByIndex(6);

	}

	@Test(priority = 0)
	public void Hobbies() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		WebElement element = driver.findElement(By.id("hobbies-checkbox-2"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();

	}
	@AfterTest
	public void teardown() {
		driver.quit();
	}
}
