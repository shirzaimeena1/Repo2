package MeenaAkramPractice;

public class Signup {
	private String firstName;
	private String lastName;
	private String emailAddress;
	private String password;
	private String passwordConfirmation;
	private int phoneNumber;
	private String userName;

	// constractor method

	public Signup() {
		this.firstName = "";
		this.lastName = "";
		this.emailAddress = "";
		this.password = "";
		this.passwordConfirmation = "";
		this.phoneNumber = 0;
		this.userName = "";

	}

	// primetirze method

	public Signup(String firstName, String lastName, String EmilaAddress, String password, String passwrodConfirmation,
			int phoneNumber, String userName) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.password = password;
		this.passwordConfirmation = passwordConfirmation;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
	}

	public String getfirstName() {
		return firstName;
	}

	public String getlastName() {
		return lastName;
	}

	public String getemailAddress() {
		return emailAddress;
	}

	public String getpassword() {
		return password;

	}

	public String getpasswordConfirmation() {
		return passwordConfirmation;
	}

	public int getphoneNumber() {
		return phoneNumber;
	}

	public String getuserName() {
		return userName;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public void setpasswrod(String password) {
		this.password = password;
	}

	public void setpasswordConfirmation(String passwordConfirmation) {

		this.passwordConfirmation = passwordConfirmation;

	}

	public void setphoneNumber(int phoneNumber) {

		this.phoneNumber = phoneNumber;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public boolean enteruserName(String userName) {
		boolean validation = true;

		if (validation) {

			return true;
		} else {
			System.out.println("wrong username please try again");
		}

		return false;

	}

	public boolean enterpassword(String password) {
		boolean validation = true;

		if (validation) {

			return true;
		} else {
			System.out.println("wrong password please try again");
		}

		return false;

	}

}
