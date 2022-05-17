package practice_sessions;

import org.hamcrest.Matchers;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Tests_GET {

	@Test(enabled = false)
	public void test_01() {
		Response response = RestAssured.get("http://localhost:3000/users");
		System.out.println("Headers:: " + response.asString());
		System.out.println("Body:: " + response.getBody());
		System.out.println("Headers:: " + response.getHeaders());
		System.out.println("Status Line:: " + response.getStatusLine());

		Assert.assertEquals(response.getStatusCode(), 200, "Status code mismatched!!");
	}

	@Test
	public void test_02() {
		// RestAssured.given().get("https://reqres.in/api/users?page=2").then().statusCode(200).log().all();

		RestAssured.given().get("https://reqres.in/api/users?page=2").then().statusCode(200)
				.body("data.id[2]", Matchers.equalTo(9))
				.body("data.first_name", Matchers.hasItems("Michael", "Lindsay", "Tobias"));
		
		
	}

}
