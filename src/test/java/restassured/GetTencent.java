package restassured;

import static io.restassured.RestAssured.given;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GetTencent {
	@BeforeClass
	public static void beforeClass(){
		System.out.println("befor eclass only run one time");
	}
	@Before
	public void before(){
		System.out.println("This is tencent before");
	}
	@Test
	public void getTencent(){
		given()
		      .when()
		      .get("http://www.qq.com").prettyPeek()
		      .then()
		      .statusCode(200);
		
	}
	

}
