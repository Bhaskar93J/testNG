package testNG;

import org.testng.annotations.Test;

public class invoc {
	@Test(invocationCount=1)
	public void method1() {
		System.out.println("Jupally Bhaskar");
	}
	@Test(enabled=false)
	public void Method2() {
		System.out.println("Kurnool");
	}

}
