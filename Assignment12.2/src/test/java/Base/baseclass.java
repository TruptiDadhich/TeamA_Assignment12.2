package Base;

import static io.restassured.RestAssured.given;

import Utility.utility;

public class baseclass {
	
	public static void get() {
		given().log().all().baseUri(utility.URL1()).get("/posts").then().assertThat().statusCode(200).log().all();
		}
	
	public static void get1() {
		given().log().all().baseUri(utility.URL1()).queryParam("postId","1").get("/comments").then().assertThat().statusCode(200).log().all();
		}
	
	public static void post() {
	given().log().all().baseUri(utility.URL2()).body(utility.body("abc","123@123"))
	.post("/api/2.2/auth/signin HTTP/1.1").then().assertThat().statusCode(403).log().all();
	}
}