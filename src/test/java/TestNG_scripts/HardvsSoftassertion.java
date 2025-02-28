package TestNG_scripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class HardvsSoftassertion {
	/*@Test
	public void hardassertions() {
		System.out.println("Test1...");
		System.out.println("Test2...");
		Assert.assertEquals(1, 2);
		System.out.println("Test3...");
		
		System.out.println("Test4...");
	}*/
	@Test
	public void softassertions() {
		System.out.println("Test1...");
		System.out.println("Test2...");
		
		  SoftAssert sa=new SoftAssert(); 
		  sa.assertEquals(1, 4);
		  System.out.println("Test3...");
		 
		 System.out.println("Test4...");
		 sa.assertAll();
		 
	}

}
