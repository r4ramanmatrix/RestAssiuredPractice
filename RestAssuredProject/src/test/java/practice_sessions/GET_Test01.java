package practice_sessions;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class GET_Test01 {

	@Test
	public void test_01() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		System.out.println("RESPONSE " + response.asString());
		System.out.println("Response Body:: " + response.getBody());
		System.out.println("Status Code:: " + response.getStatusCode());
		System.out.println("Status Line:: " + response.getStatusLine());
		System.out.println("Header :: " + response.getHeader("content-type"));

		Assert.assertEquals(response.getStatusCode(), 200, "Status Code mismatched!!");
	}

	@Test
	public void test_02() {
		RestAssured.given().get("https://reqres.in/api/users?page=2").then().statusCode(200).body("data.id[0]",
				Matchers.equalTo(7));
	}
}
