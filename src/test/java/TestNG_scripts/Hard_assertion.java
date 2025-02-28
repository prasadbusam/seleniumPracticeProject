package TestNG_scripts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_assertion {
	@Test
	public void hard() {     //hard assertions are the methods which we can directly access from the assert class. When i run the code if assertion got failed rest of the won't execute 
		//Assert.assertEquals("prasad", "prasad");
		//Assert.assertEquals(123, 234);
		//Assert.assertNotEquals(123, 125);
		//Assert.assertTrue(false);//static methods directly access through classes no object required
		//Assert.assertFalse(false);
		//Assert.assertTrue(1==2);
		//Assert.assertFalse(1==2);
		//Assert.fail();  //this mehod will do directly failed my test method
		
	}

}
