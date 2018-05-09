package restassured;

import static io.restassured.RestAssured.given;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;

public class GetSina {
	@BeforeClass
	public static void beforeClass(){
		System.out.println("befor eclass only run one time");
	}
	@Before
	public void before(){
		System.out.println("This is sina before");
	}
	@Test
	public void getGetSina(){
		given()
		      .when()
		      .get("http://www.sina.com.cn").prettyPeek()
		      .then()
		      .statusCode(200);
		
	}

}
