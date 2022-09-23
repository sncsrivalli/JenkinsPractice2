package testpractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FifthTest {
	WebDriver driver;
	@Test
	public void tc5() {
		
		String browser = System.getProperty("B");
		String url =System.getProperty("U");
		switch(browser) {
		case "chrome": WebDriverManager.chromedriver().setup();
						driver = new ChromeDriver();
						break;
		case "firefox":WebDriverManager.firefoxdriver().setup();
						driver = new FirefoxDriver();
						break;
		default : System.out.println("Invalid Browser");break;
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	}


