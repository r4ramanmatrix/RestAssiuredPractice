package practice_sessions;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Tests_DELETE {

	@Test
	public void test_01() {

		RestAssured.when().delete("https://reqres.in/api/users/2").then().statusCode(204).log().all();
	}

}
