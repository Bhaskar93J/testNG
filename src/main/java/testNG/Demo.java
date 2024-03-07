package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	WebDriver driver;
	@Test
	public void Myntra() {
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.myntra.com/");
			
	}
	@Test
	public void FlipKart() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}
	@Test
	public void Ajio() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
				
	}

}
