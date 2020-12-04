package AbstractionPracticeProjict;

public interface Bank {
	
	public String name(String name);
	public double intersetrate(); 
	
	public void withdrawlimit (double amount);
	public void CheckingAcfee(int fee);
	public default void name() {
		
	}
	
	}
	

	 

