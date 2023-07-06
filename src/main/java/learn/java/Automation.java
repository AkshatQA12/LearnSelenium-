package learn.java;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

class Automation {
	public static WebDriver driver;

	@Before 
	public void setup() {
		
		WebDriverManager.chromedriver().setup();
		// Above line we used to setup the conenction between selenium and installed browser automatically
		ChromeOptions cr = new ChromeOptions();
		cr.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(cr);
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();
		driver.quit();
	}
}
