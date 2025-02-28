package TestNG_scripts;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class Assertions_one {
	@Test
	public void add() {
		int d=25;
		int a=10;
		int b=15;
		int c=a+b;
		Assert.assertEquals(d, c);
		
	}

}
