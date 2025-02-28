package TestNG_scripts;

import static org.testng.Assert.assertFalse;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Assert_demo {
	@Test
	public void testtitle() 
	{
		String exp_title="facebook";
		String act_title="facebook";
	
	if(exp_title.equals(act_title))
	{
		System.out.println("test passed");
		Assert.assertTrue(true);
	}
	else
	{
		System.out.println("test failed");
		Assert.assertFalse(false);
	}
		//Assert.assertEquals(exp_title, act_title);
		
		

}
}
