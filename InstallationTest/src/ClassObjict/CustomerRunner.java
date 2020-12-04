package ClassObjict;

public class CustomerRunner {

	public static void main(String[] args) {
		// we call the method when we need this

		Customer x = new Customer();
		x.setfirstName("Meena");
		System.out.println(x.getfirstName());
		x.setlastName("shirzai");
		
		System.out.println(x.getlastName());
		Customer y = new Customer("Marsana", "sidiqi", "shirzai", 990, 2000.00);

		System.out.println(y.getbalance());
		y.withdraw(100);
		System.out.println(y.getbalance());
		y.deposite(4000);
		System.out.println(y.getbalance());
		y.withdraw(500);
		System.out.println(y.getbalance());

	}

}
