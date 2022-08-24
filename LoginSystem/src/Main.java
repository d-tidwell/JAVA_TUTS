
public class Main {

	public static void main(String[] args) {
		// Basic Login Life Cycle w/o db
		//**hashmaps**
		
		IDandPasswords idandPasswords = new IDandPasswords();
		
		//returns our l/p HashMap
		LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
	}

}
