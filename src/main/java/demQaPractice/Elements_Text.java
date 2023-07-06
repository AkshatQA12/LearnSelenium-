package demQaPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

class Element_Text {
	public static WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test
	public  void text() {
		WebElement element = driver.findElement(By.id("userName"));
		element.sendKeys("Akshat chadha");

		WebElement email = driver.findElement(By.id("userEmail"));
		email.sendKeys("Akshat@1233");

		WebElement add = driver.findElement(By.id("currentAddress"));
		add.sendKeys("mohali 2122 flat");

		WebElement padd = driver.findElement(By.id("permanentAddress"));
		padd.sendKeys("Amritsar gali hall agte ");

		driver.findElement(By.id("submit")).submit();
	}

	@AfterTest
	public void teardown() {
		driver.quit();
		System.out.println("success program");
	}

}