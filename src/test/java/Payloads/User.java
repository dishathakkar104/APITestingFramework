package Payloads;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;


public class User {

	public static String name;
	public static String job;
	
	
	public String getName() {
		return name;
	}
	@JsonCreator
	public void setName(@JsonProperty("name")String name) {
		User.name = name;
	}
	public String getJob() {
		return job;
	}
	@JsonCreator
	public  void setJob(@JsonProperty("job")String job) {
		User.job = job;
	}
}
