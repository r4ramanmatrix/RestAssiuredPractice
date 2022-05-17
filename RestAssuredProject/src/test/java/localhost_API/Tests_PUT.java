package localhost_API;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Tests_PUT {

	
	@Test
	public void test_01() {

		RestAssured.baseURI = "http://localhost:3000/";

		JSONObject requestPost = new JSONObject();

		requestPost.put("firstname", "firstname_01");
		requestPost.put("lastname", "lastname_01");
		requestPost.put("subjectId", 2);
		requestPost.put("jobId", 105);
		requestPost.put("id", 11);

		RestAssured.given().contentType(ContentType.JSON).accept(ContentType.JSON).body(requestPost.toJSONString())
				.when().put("users/7").then().statusCode(200).log().all();
	}
	
}
