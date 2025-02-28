package Testng_work_demo;

import org.testng.annotations.Test;

public class Timeout_demo {
	// @Test(invocationTimeOut=4000)
	@Test(enabled = false)
	public void test() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("hello world");
	}

	@Test
	public void Log() {
		System.out.println("Log test");
	}

	@Test
	public void Login() throws InterruptedException {

		System.out.println("Login test");
	}

	@Test
	public void Logout() {
		System.out.println("Logout test");
	}

}
