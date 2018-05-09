package JunitDemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test3 {
	@BeforeClass
	public static void beforeClass(){
		System.out.println("this is Test3 beforeClass");
	}
	@Before
	public void before(){
		System.out.println("this is Test3 before");
	}
	@Test
	public void fun(){
		System.out.println("this is Test3 fun");
	}
	@After
	public void after(){
		System.out.println("this is Test3 after");
	}
	@AfterClass
	public static void afetClass(){
		System.out.println("this is Test3 afterClass");
	}
	
	

}
