import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


import static io.restassured.matcher.RestAssuredMatchers.*;
import static  org.hamcrest.Matchers.*;
public class test02_GET {

	
	@Test
	void test02() {
		given()
			.get("https://reqres.in/api/users?page=2")
		.then()
			.statusCode(200)
			.body("per_page", equalTo(6))
			.body("data.id[2]", equalTo(9));
		
	}
}
