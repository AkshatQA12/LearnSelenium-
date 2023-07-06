package Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pageobjects.DemoLoginOR;
import stepdefinition.hook;

public class DemoLoginMethod {
	public static WebDriver driver;

	public DemoLoginMethod() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

	}
	@Test
	public static void  LoginPage() {
		driver.get("https://demoqa.com/login");
	}

	@Test
	public static void userName() {
		WebElement element = driver.findElement(DemoLoginOR.USRNAME);
		element.sendKeys("Akshat12");
	}

	@Test
	public static void password() {
		WebElement element = driver.findElement(DemoLoginOR.PASSWRD);
		element.sendKeys("Akshat@1234");

	}

	@Test
	public static void submit() {
		WebElement element = driver.findElement(DemoLoginOR.LOGIN_BTN);
		element.click();

	}

}
