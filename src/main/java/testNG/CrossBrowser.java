package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class CrossBrowser {
	WebDriver driver;

	@Parameters("browserName")
	@Test
	public void bt(String browserName) {

		switch (browserName) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;

		default:
			System.out.println("Browser is invalid");
			break;
		}

		driver.manage().window().maximize();
	}

	@AfterTest
	public void at() {
		//driver.close();

	}

	@Parameters("url")
	@Test
	public void launchapp(String url) throws Throwable {

		driver.get(url);
		Thread.sleep(2000);
	}

	@Parameters({ "username" })
	@Test
	public void user(String username) {
		driver.findElement(By.name("q")).sendKeys(username);

		String ab = driver.getTitle();
		System.out.println(ab);

	}

}
