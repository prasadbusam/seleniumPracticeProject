package TestNG_New;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Groups1 {
		@Test(groups="smoke")
	public void smoke() {
		System.out.println("This is smoke testing");
	}
	
	@Test(groups="reg")
	public void regression() {
		System.out.println("This is regression testing");
	}
	
	@Test(groups="reg")
	public void regression1() {
		System.out.println("This is regression testing");
	}
	
	@Test(groups="functional")
	public void functional() {
		System.out.println("This is functional testing");
	}
	
	@Test(groups="retesting")
	public void regression3() {
		System.out.println("This is retesting testing");
	}
	
	@Test(groups="uat")
	public void uat() {
		System.out.println("This is uat testing");
	}
	
	



	

}
