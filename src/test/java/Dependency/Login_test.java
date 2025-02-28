package Dependency;

import org.testng.annotations.Test;

public class Login_test {
	@Test(priority=1,groups= {"sanity"})
	public void Loginbyemail() {
		System.out.println("This is login by email");
	}
	@Test(priority=2,groups= {"sanity"})
	public void Loginbyfacebook() {
		System.out.println("This is login by facebook");
	}
	@Test(priority=3,groups= {"sanity"})
	public void Loginbytwitter() {
		System.out.println("This is login by twitter");
	}
	

}
