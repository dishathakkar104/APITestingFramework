package Endpoints;
import org.testng.annotations.Test;

import Payloads.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.util.*;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class UserEndpoints {
	@Test
	
	public static Response getusers()
	{
		Response response=given()
		 .when()
		   .get(Routes.user_get_url_singleuser);
		return response;  
	}
	@Test
	public static Response usernotfound()
	{
		Response response=given()
				.when()
				.get(Routes.user_get_url_singleusernotfound);
		return response;
	}
	@Test
	public static Response createuser(User payloads)
	{
		Response response= given()
		   .contentType(ContentType.JSON)
		   .accept(ContentType.JSON)
		     .body(payloads)
		
		.when()
		     .post(Routes.user_post_url_create);
		    return response;
	}
	@Test
	public static Response listuser()
	{
	    Response response=given()
	    		.when()
	    		 .get(Routes.user_get_url_listuser);
		return response;
	}
	@Test
	public static Response updatedrecord (User payloads) {
		Response response = given()
				.contentType(ContentType.JSON)
				   .accept(ContentType.JSON)
				     .body(payloads)
				    .when()
				     .put(Routes.user_put_url_user);
		return response;
		
	}
	@Test
	public static Response patchuser(User payloads)
	{
		Response response=given()
				.contentType(ContentType.JSON)
				   .accept(ContentType.JSON)
				     .body(payloads)
	            .when()
	            .patch(Routes.user_patch_url_user);
      return response;
		
	}
	
	@Test
	public static Response deleteuser()
	{
		Response response=given()
	    		.when()
	    		 .delete(Routes.user_delete_url_user);
		return response;
	}
}
