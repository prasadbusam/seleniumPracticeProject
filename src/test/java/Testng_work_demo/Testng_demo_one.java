package Testng_work_demo;

import org.testng.annotations.Test;

public class Testng_demo_one {
	
    @Test(priority=1)
	public void openapp() {
		System.out.println("Open application...");
	}
    
    @Test(priority=2)
	public void loginapp() {
		System.out.println("Login application...");
	}
    
    @Test(priority=3)
	public void logoutapp() {
		System.out.println("Logout application...");
	}
}
