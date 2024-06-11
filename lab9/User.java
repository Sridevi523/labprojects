

class User{
	void  authenticate(String username, String password) {
		System.out.println(username+" YOUR login successful.");
	}
	 void authenticate(String email, long phoneno) {
		System.out.println(email+"  YOUR  login successful using EmailId.");
	}
	void  authenticate(long phoneno,int pin) {
		System.out.println(phoneno+" YOUR login successful using phoneNo.  ");
	}
	void authenticate(String email, int pin) {
		System.out.println(email+"  YOUR  login successful using EmailId.");
	}
	 void authenticate(long phoneno,String password) {
		System.out.println(phoneno+"  YOUR  login successful using PhoneNo.");
	}



	public static void main(String[] args) {
User u =  new User();
		u.authenticate("Sri@gmail.com", 1234);
		u.authenticate("Sri@gmail.com",845678);
		u.authenticate("Sri1234@gmail.com", "12345");
		u.authenticate("Sri@gmail.com", 895632);
		u.authenticate(630168780, "1234");

	}
 }
