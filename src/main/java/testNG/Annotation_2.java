package testNG;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation_2 {
	WebDriver driver;

	@BeforeSuite
	public void BeforeSuite() {
		System.out.println("This is Before Suite Annotation");

	}

	@BeforeTest
	public void BeforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@BeforeClass
	public void BeforeClass() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void BeforeMethod() {
		System.out.println("This is Before Method");
		driver.get("https://www.google.co.in/");
	}

	@Test(priority = 2)
	public void Test1() {
		System.out.println(" This is Test-1");
		driver.switchTo().activeElement().sendKeys("Selenium");
		List<WebElement> options = driver.findElements(By.xpath("//span[text()='selenium']"));
		for (WebElement e : options) {
			System.out.println("Elements = " + e.getText());
		}

	}

	@Test(priority = 1)
	public void Test2() {
		System.out.println(" This is Test-2");
		driver.switchTo().activeElement().sendKeys("Annotation");
		List<WebElement> options = driver.findElements(By.xpath("//span[text()='annotation']"));
		for (WebElement e : options) {
			System.out.println("Elements = " + e.getText());
		}
	}

	@AfterMethod
	public void AfterMethod() throws Throwable {
		System.out.println("This is After Method");
		Thread.sleep(2000);
	}

	@AfterTest
	public void AfterTest() {
		driver.close();
	}

	@AfterClass
	public void Class() {
		System.out.println("After Class");
	}

	@AfterSuite
	public void Suite() {
		System.out.println("After Suite");
	}

}

