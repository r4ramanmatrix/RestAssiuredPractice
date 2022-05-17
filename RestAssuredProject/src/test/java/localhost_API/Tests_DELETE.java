package localhost_API;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Tests_DELETE {

	@Test
	public void test_01() {
		RestAssured.baseURI = "http://localhost:3000/";

		RestAssured.when().delete("users/6").then().statusCode(200).log().all();
	}

}
