package JunitDemo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Test4 {
	@BeforeClass
	public static void beforeClass(){
		System.out.println("this is Test4 beforeClass");
	}
	@Before
	public void before(){
		System.out.println("this is Test4 before");
	}
	@Test
	public void fun1(){
		System.out.println("this is Test4 fun1");
	}
	@Test
	public void fun2(){
		System.out.println("this is Test4 fun1");
	}
	@After
	public void after(){
		System.out.println("this is Test4 after");
	}
	@AfterClass
	public static void afetClass(){
		System.out.println("this is Test4 afterClass");
	}
	
	

}