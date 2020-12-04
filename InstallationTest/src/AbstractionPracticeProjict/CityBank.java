package AbstractionPracticeProjict;

public class CityBank implements Bank {

	@Override
	public double intersetrate() {
		
		return 4;
	}

	@Override
	public void withdrawlimit(double amount) {
		System.out.println(" the amount has been reducted from your account + amount");
	}

	@Override
	public void CheckingAcfee(int fee) {
		System.out.println(" the monthly fee for checking acount is 20$");
		
	}

	@Override
	public void name(String name) {
		// TODO Auto-generated method stub
		
	}

	
		
	}


