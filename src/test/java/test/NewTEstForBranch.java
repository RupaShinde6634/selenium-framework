package test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTEstForBranch {
	@Test (priority=1,invocationCount = 4)
	public void test1() {
	Assert.fail();
		System.out.println("P1 four times");
		
	}
	@Test (priority=1, dependsOnMethods = "test1",alwaysRun = true)
	public void test2() {
		System.out.println("P2");
	}

}
