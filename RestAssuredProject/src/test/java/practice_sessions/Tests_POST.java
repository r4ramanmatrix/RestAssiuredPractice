package practice_sessions;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Tests_POST {
	
	
	
	@Test(enabled = false)
	public void test_01() {

		Map<String, Object> mapObject = new HashMap<String, Object>();
		mapObject.put("id", 7);
		mapObject.put("email", "rama@reqres.in");
		mapObject.put("first_name", "Rama");
		mapObject.put("last_name", "kuma");

		System.out.println(mapObject);

		JSONObject requestObj = new JSONObject();
		requestObj.putAll(mapObject);

		System.out.println(requestObj.toJSONString());

		RestAssured.given().body(requestObj.toJSONString()).when().post("https://reqres.in/api/users").then()
				.statusCode(201);
	}

	@Test
	public void test_02() {

		
		Map<String, Object> mapObject = new HashMap<String, Object>();
		mapObject.put("email", "rama@reqres.in");
		mapObject.put("password", "Rama");

		System.out.println(mapObject);

		JSONObject requestObj = new JSONObject();
		requestObj.putAll(mapObject);

		System.out.println(requestObj.toJSONString());

		RestAssured.given().body(requestObj.toJSONString()).when().post("http://localhost:3000/users").then()
				.statusCode(201);
	}

}
