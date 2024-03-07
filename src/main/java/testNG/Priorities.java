package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priorities {
	WebDriver driver;
	
	@Test(priority=3)
	public void Add() {
		System.out.println("Add");
	}
	@Test(priority=5)
	public void Method2() {
		System.out.println("Method2");
	}
	@Test(priority=-1,enabled=false)
	public void Ba() {
		System.out.println("Ba");
	}
	@Test(priority=0)
	public void Del() {
		System.out.println("Del");
	}
	@Test(priority=2)
	public void Hcl() {
		System.out.println("Hcl");
	}
	}

