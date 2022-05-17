package localhost_API;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Tests_POST {

	@Test
	public void test_01() {

		RestAssured.baseURI = "http://localhost:3000/";

		JSONObject requestPost = new JSONObject();
		requestPost.put("firstname", "Demo_1");
		requestPost.put("lastname", "Demo_2");
		requestPost.put("subjectId", 2);
		requestPost.put("jobId", 105);
		requestPost.put("Id", 11);

		RestAssured.given().contentType(ContentType.JSON).accept(ContentType.JSON).body(requestPost.toJSONString())
				.when().post("users").then().statusCode(201).log().all();
	}

}
