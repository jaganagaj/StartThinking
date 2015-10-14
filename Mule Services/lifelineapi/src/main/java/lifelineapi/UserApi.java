package lifelineapi;

public class UserApi {
	
	private UserApi userApi;
	
	public void initialize(){
		userApi = new UserApi();
		System.out.println("*******************************************************************");
		System.out.println("UserApi Class Initialized");
		System.out.println("*******************************************************************");
		userApi.initialize();
	}
	
	public String getUser(String userid){
		
		
		System.out.println("*******************************************************************");
		System.out.println("getUser Called");
		String response = null;
		
		if(userid == "A")
			response = "AAA";
		else if(userid =="B")
			response = "BBB";
		else if(userid == "C")
			response = "CCC";
		
		return response;
		
	}

}
