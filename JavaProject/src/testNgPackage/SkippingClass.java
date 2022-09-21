package testNgPackage;

import static org.testng.Assert.assertEquals;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkippingClass {
  
	@Test
	public void test1() {
		System.out.println("I am test 1 and I will pass");
	}
	@Test
	public void test2() {
		System.out.println("I am test 2 and I will skip");
		throw new SkipException("I am skipping");
	}
	
	@Test
	public void test3() {
		
		System.out.println("I am at test3 and I will fail");
		assertEquals(true,false);
	}
	
	@Test(enabled= false)
	public void bar() {
		System.out.println("This will be skipped");
		
	}
	
}
