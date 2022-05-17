package localhost_API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Tests_GET {

	@Test
	public void test_01() {
		RestAssured.baseURI = "http://localhost:3000/";

		RestAssured.given().get("users").then().statusCode(200).log().all();

	}

	@Test
	public void test_02() {
		
		RestAssured.given().param("name", "Admin").get("jobstype").then().log().all();
	}

}
