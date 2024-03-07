package testNG;

import org.testng.annotations.Test;

public class Groups {
	@Test(groups="Smoke")
	public void M1() {
		System.out.println("Smoke -1");
	}
	@Test(groups="Smoke")
	public void M2() {
		System.out.println("SMoke -2");
	}
	@Test(groups="Sanity")
	public void M3() {
		System.out.println("Sanioty -1 ");
	}
	@Test(groups="Sanity")
	public void M4() {
		System.out.println("Sanity -2");
	}
	@Test(groups="Regression")
	public void M5() {
		System.out.println("Regression");
	}

}
