package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	
	
	@DataProvider (name = "data-Provider")
	public Object [] [] getData(){
		return new Object[][] {
			{"Rupa", "Shinde@123","rupa@g mail.com"},
			{"Jeet", "Dongle@123","jeet@gmail.com"}
		};
	}
	
	@Test(dataProvider = "data-Provider" )
	public void Login(String username, String password,String url) {
		System.out.println("1.Username: "+username);
		System.out.println("2. Password: "+password);
		System.out.println("3. url: "+url);
		
		System.out.println("=============================================");
		
	}

}
