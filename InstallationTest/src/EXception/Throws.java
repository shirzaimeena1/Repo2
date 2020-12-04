/package EXception;

public class Throws {

	public static void main(String[] args) {
		
		// when we used thtows we pass the message to the peron who call the method to deal it by them self.
		// the benefit is that every person can deal with it diferently. as below 
		// we have to put the throws after the arguments.
		try {
			printDivide(10, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("first implementation");
		}
		
		try {
			printDivide(50, 0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("second");
		}
		

	}

	public static void printDivide(int x, int y) throws Exception {

		System.out.println(x / y);
	}

}

