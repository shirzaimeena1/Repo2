package MeenaAkramPractice;

public class RunnerSignup {

	public static void main(String[] args) {
		
		// className variable = new class ();
		Signup x = new Signup();
		Signup y = new Signup("Meena", "Sidiqi", "aksidiqi123@gmail.com", "234", "234", 987,"userName");
		x.setfirstName("Marsana");
		y.setfirstName("Akram");
		y.setpasswrod("1234");
	System.out.println(x.getfirstName());
	System.out.println(y.getfirstName());	
	System.out.println(y.getpassword());
	System.out.println(y.getphoneNumber());

	System.out.println(y.getuserName());
	}

}
