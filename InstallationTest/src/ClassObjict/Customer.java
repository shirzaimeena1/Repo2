package ClassObjict;

public class Customer {
	
	private String firstName;
	private String lastName;
	private String midName;
	
	private int phonenumber;
	private double balance;
	
	// default constractor method
	public Customer() {
		firstName= "";
		lastName = "";
		midName = "";
		phonenumber= 0;
		balance = 0.0;
	}
	
	
	// primitarize constractor method

	public Customer(String fristName, String lastName, String midName, int Phonenumber, double balance) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.midName = midName;
		this.phonenumber = phonenumber;
		this.balance = balance;

	}


	// getter method

 public String getfirstName() {
	 return firstName;
 }

	public String getlastName() {
		return lastName;
	}

	public String getmidName() {
		return midName;
	}

	public int phonenumber() {
		return phonenumber;
	}

	public double getbalance() {
		return balance;
	}

	public String getFulName() {
		return firstName + " " + lastName + "  " + midName;
	}

	// Setter or accessor:

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public void setmidName(String midName) {
		this.midName = midName;
	}

	public void setphoneNumber(int phoneNumber) {
		this.phonenumber = phoneNumber;
	}
	
	// it is called custome method. 
	// this one is for balance because throuh the above method we cant access to it.
	
	public boolean deposite (double amount) {
	boolean validation = true;
	if (validation ) {
    balance += amount;
		return true;
	} else {
		System.out.println(" credintail is not corret: amount is not deposite ");
	}
	
	
	return false;
	}

	
	// validation cod this one check the validaton, the security of deposit
		
	
	public boolean withdraw (double amount) {
		boolean withdraw = true;
		if (balance > amount) {
			balance-=amount;
		
			System.out.println(" amount + $ withdraw from your account");
			return true;
		}else {
			System.out.println(" you dont have sufficint balance");
		}
		return false;
	}
	
	
	
	
	
	
	
	
	

}
	

	
	


	
	

	

	
