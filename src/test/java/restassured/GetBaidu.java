package restassured;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
public class GetBaidu {
	@BeforeClass
	public static void beforeClass(){
		System.out.println("befor eclass only run one time");
	}
	@Before
	public void before(){
		//设置默认跳过ssl验证
		RestAssured.useRelaxedHTTPSValidation();
	}
	@Test
	public void getBaidu(){
		given()
		      .when()
		      .get("https://www.baidu.com").prettyPeek()
		      .then()
		      .statusCode(200);
		
	}

}
