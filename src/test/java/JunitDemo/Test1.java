package JunitDemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test1 {
	@BeforeClass
	public static void beforeClass(){
		System.out.println("this is Test1 beforeClass");
	}
	@Before
	public void before(){
		System.out.println("this is Test1 before");
	}
	@Test
	public void fun(){
		System.out.println("this is Test1 fun");
	}
	@After
	public void after(){
		System.out.println("this is Test1 after");
	}
	@AfterClass
	public static void afetClass(){
		System.out.println("this is Test1 afterClass");
	}
	
	

}
