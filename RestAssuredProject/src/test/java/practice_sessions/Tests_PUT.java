package practice_sessions;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Tests_PUT {

	
	@Test
	public void test_01() {

		Map<String, Object> mapObject = new HashMap<String, Object>();
		mapObject.put("name", "Rama");
		mapObject.put("job", "Engineer_2");
		

		System.out.println(mapObject);

		JSONObject requestObj = new JSONObject();
		requestObj.putAll(mapObject);
		requestObj.toJSONString();
		System.out.println(requestObj);

		RestAssured.given().body(requestObj.toJSONString()).when().put("https://reqres.in/api/users/2").then()
				.statusCode(200).log().all();
	}
}
