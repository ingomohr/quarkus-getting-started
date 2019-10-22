package org.acme.quickstart;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class GreetingResourceTest {

	@Test
	void helloEndpoint() {
		given().when().get("/hello").then().statusCode(200).body(is("Hello"));
	}

	@Test
	void greetingsEndpoint() {
		given().when().get("/hello/greeting/Joe").then().statusCode(200).body(is("Hello Joe"));
	}

}