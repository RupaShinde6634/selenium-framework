import org.testng.annotations.Test;

public class NewTest {
	@Beforemethod
	void login() {
		System.out.println("this is login");
	}

	@test(priority = 1)
	void search() {
		System.out.println(" this is search");
	}

	@Aftermethod
	void logout() {
		System.out.println("this is logout");


	}
			  
	  
}

