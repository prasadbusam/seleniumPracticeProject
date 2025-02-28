package TestNG_scripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_demo {
	@Test
	public void softassert() {
		System.out.println("Test 1");
		System.out.println("Test 2");
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(1, 2); //soft assert
		System.out.println("Test 3");
		System.out.println("Test 4");
		sa.assertAll();
	}

}
