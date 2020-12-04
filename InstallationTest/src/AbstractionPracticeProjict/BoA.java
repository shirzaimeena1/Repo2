package AbstractionPracticeProjict;

public class BoA implements Bank {
  double amount = 0.0;
  int fee= 0;
	@Override
	public double intersetrate() {
		
		return 3.5;
	}

	@Override
	public void withdrawlimit(double amount) {
		this.amount= amount;
		System.out.println(" this amount is reducted from you account: "+ amount);
		
	}

	@Override
	public void CheckingAcfee(int fee) {
		this.fee= fee;
		System.out.println(" checking account montly fee:"  + fee);
		
	}

	public static void main(String[] args) {

		
		BoA x = new BoA();
		x.CheckingAcfee(20);
		x.withdrawlimit(3.5);
		x.intersetrate();
		x.name("ahamd");
		System.out.println(x.intersetrate());
	}

	
	}
