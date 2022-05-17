package localhost_API;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Tests_PATCH {

	@Test
	public void test_01() {

		RestAssured.baseURI = "http://localhost:3000/";

		JSONObject requestPost = new JSONObject();

		requestPost.put("lastname", "Demo_01");

		RestAssured.given().contentType(ContentType.JSON).accept(ContentType.JSON).body(requestPost.toJSONString())
				.when().patch("users/7").then().statusCode(200).log().all();
	}

}
