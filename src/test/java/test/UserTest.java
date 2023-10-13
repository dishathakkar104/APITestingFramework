package test;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import Endpoints.UserEndpoints;
import Payloads.User;
import io.restassured.response.Response;

public class UserTest {
	
	Faker faker;
	User user;
	@BeforeClass
	public void setupdata() {
		faker = new Faker();
		user =new User();
		
		user.setName(faker.name().name());
		user.setJob(faker.job().title());
	}
	
	@Test
	public void Testgetuser()
	{
		Response response=UserEndpoints.getusers();
		response.then().log().all();
		
		Assert.assertEquals(response.statusCode(),200);
	}
	
	@Test
	public void Testcreateuser()
	{
		Response response=UserEndpoints.createuser(user);
		response.then().log().all();
		
		Assert.assertEquals(response.statusCode(),201);
	}
	
	@Test
	public void Testupdateuser() {
		Response response= UserEndpoints.updatedrecord(user);
		response.then().log().all();
		Assert.assertEquals(response.statusCode(),200);
	}
	
	@Test
	public void Testlistusers()
	{
		Response response= UserEndpoints.listuser();
		response.then().log().all();
		Assert.assertEquals(response.statusCode(),200);
	}
	
	@Test
	public void Testusernotfound()
	{
		Response response= UserEndpoints.usernotfound();
		response.then().log().all();
		Assert.assertEquals(response.statusCode(),404);
	}
	@Test
	public void Testpatchuser()
	
	{
		Response response= UserEndpoints.patchuser(user);
		response.then().log().all();
		Assert.assertEquals(response.statusCode(),200);
	}
	
	@Test
	public void Testdeleteuser()
	{
		Response response= UserEndpoints.deleteuser();
		response.then().log().all();
		Assert.assertEquals(response.statusCode(),204);
	}

}
