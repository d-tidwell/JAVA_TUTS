import java.util.HashMap;

public class IDandPasswords {
	
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	IDandPasswords() {
		logininfo.put("Bro", "pizza");
		logininfo.put("Gabriel", "godzilla");
		logininfo.put("Liza","snacks");
		
	}
	protected HashMap getLoginInfo() {
		return logininfo;
	}
}
