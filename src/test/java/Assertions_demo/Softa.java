package Assertions_demo;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softa {
	@Test
	public void test1() {
		System.out.println("hello");
		Assert.assertEquals(10, 5);
		Assert.assertEquals("abc", "abc");
		System.out.println("hi");
	}
	@Test
	public void test2() {
		SoftAssert sf=new SoftAssert();
		System.out.println("hello");
		Assert.assertEquals(10, 5);
		Assert.assertEquals("abc", "abbc");
		System.out.println("hi");
		sf.assertAll();
	}

}
