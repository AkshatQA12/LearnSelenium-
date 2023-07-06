package com.basic.automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoQa {
	public static WebDriver driver;

	public static void main(String[] args)  {

		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/text-box");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		// exception
		driver.manage().window().maximize();
		driver.findElement(By.id("userForm")).sendKeys("Akshat");
		driver.findElement(By.id("userEmail")).sendKeys("chadhaakshat7@gmail.com");
		driver.findElement(By.id("currentAddress")).sendKeys("H.no:2122 sector 110, Mohali");
		driver.findElement(By.id("permanentAddress")).sendKeys("H.no:2122 sector110, Mohali");
		driver.findElement(By.id("submit")).submit();

		driver.quit();
	}

}
