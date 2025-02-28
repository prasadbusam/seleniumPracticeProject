package Dependency;

import org.testng.annotations.Test;

public class Signup {
	@Test(priority=1, groups= {"regression"})
	public void signupbyemail() {
		System.out.println("This is signup by email");
	}
	@Test(priority=1,groups= {"regression"})
	public void signupbyfacebook() {
		System.out.println("This is signup by facebook");
	}
	@Test(priority=1,groups= {"regression"})
	public void signupbytwitter() {
		System.out.println("This is signup by twitter");
	}

}
