package Endpoints;

public class Routes {
	
	public static String baseURL="https://reqres.in/";
	
	// URLS FOR USERS
	
	public static String user_get_url_listuser=baseURL+"api/users?page=2";//done
	public static String user_get_url_singleuser=baseURL+"api/users/2";//done
	public static String user_get_url_singleusernotfound=baseURL+"api/users/23";//done
	public static String user_post_url_create=baseURL+"api/users";//done
	public static String user_put_url_user=baseURL+"api/users/2";//done
	public static String user_patch_url_user=baseURL+"api/users/2";
	public static String user_delete_url_user=baseURL+"api/users/2";
	
	

}
