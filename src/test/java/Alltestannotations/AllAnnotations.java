package Alltestannotations;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


/*public class Allannotations {
	
	public class Alltest_Annotations {
		@BeforeSuite
		public void bs() {
			System.out.println("This is before suite");
		}
		@AfterSuite
		public void as() {
			System.out.println("This is after suite");
		}
		@BeforeTest
		public void bt() {
			System.out.println("This is before test");
		}
		@AfterTest
		public void at() {
			System.out.println("This is after test");
		}
		@BeforeClass
		public void bc() {
			System.out.println("This is before class");
		}
		@AfterClass
		public void ac() {
			System.out.println("This is after class");
		}
		@BeforeMethod
		public void bm() {
			System.out.println("This is before method");
		}
		@AfterMethod
		public void am() {
			System.out.println("This is after method");	
		}
		@Test(priority=1)
		public void testmethod1() {
			System.out.println("This is test method1");
		}
		@Test
		public void testmethod2() {
			System.out.println("This is test method2");
		}

	}

}*/

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AllAnnotations {

    @BeforeSuite
    public void bs() {
        System.out.println("This is before suite");
    }

    @AfterSuite
    public void as() {
        System.out.println("This is after suite");
    }

    @BeforeTest
    public void bt() {
        System.out.println("This is before test");
    }

    @AfterTest
    public void at() {
        System.out.println("This is after test");
    }

    @BeforeClass
    public void bc() {
        System.out.println("This is before class");
    }

    @AfterClass
    public void ac() {
        System.out.println("This is after class");
    }

    @BeforeMethod
    public void bm() {
        System.out.println("This is before method");
    }

    @AfterMethod
    public void am() {
        System.out.println("This is after method");    
    }

    @Test(priority=1)
    public void testMethod1() {
        System.out.println("This is test method1");
    }

    @Test
    public void testMethod2() {
        System.out.println("This is test method2");
    }
}

