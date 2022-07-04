import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class test01_GET {
	

	
	@Test
	void test01_GET() {
		Response response = RestAssured.get("https://reqres.in/api/users?page=2");
		response.getBody();
		response.getStatusCode();
		System.out.println(response.getBody().asPrettyString());
		System.out.println(response.getStatusCode());
		System.out.println(response.getHeader("content-type"));
		Assert.assertEquals(response.getStatusCode(), 200);
	}

}
