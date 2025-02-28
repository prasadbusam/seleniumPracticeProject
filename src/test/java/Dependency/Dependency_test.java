package Dependency;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependency_test {
	@Test(priority=1)
	public void OpenApp()
	{
		Assert.assertTrue(true);
	}
	@Test(priority=2, dependsOnMethods= {"OpenApp"})
	public void Login() {
		Assert.assertTrue(true);
	}
	@Test(priority=3, dependsOnMethods= {"Login"})
	public void Search() {
		Assert.assertTrue(true);
	}
	@Test(priority=4, dependsOnMethods= {"Login","Search"})
	public void Advsearch() {
		Assert.assertTrue(true);
	}
	@Test(priority=6)
	public void Logout() {
		Assert.assertTrue(true);
	}

}
