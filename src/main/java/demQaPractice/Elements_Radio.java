package demQaPractice;

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

public class Elements_Radio {
	public static WebDriver driver;

	@BeforeTest
	public void setup() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/radio-button");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	@Test(priority = 0)
	public  void button() {
		WebElement element = driver.findElement(By.id("yesRadio"));
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();

	}

	@AfterTest
	public void teardown() {
		driver.quit();
		System.out.println("success program");
	}

}
