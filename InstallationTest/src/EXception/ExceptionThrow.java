package EXception;

public class ExceptionThrow {

	public static void main(String[] args) {
		
		// throw: it mean make exception happen.
		//throws: used for method chanaling 
		 int x = 10;
		 int y[]= {2,3,4};
		 
		 try { 
			 System.out.println(x/y[22]);
		 } catch(ArrayIndexOutOfBoundsException e) {
			 throw e;  // if we use word throw here it mean execute the exception.
			// System.out.println("array out of bandries");
		 }

		 System.out.println(x/y[0]);
	}

}
