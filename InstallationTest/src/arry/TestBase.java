package arry;

public class TestBase {

	public static void main(String[] args) {
		System.out.println("main method 1");
		
// can we overload main method ? yes we can
// method overloading mean same method with different number 
// of argument or different type of argument. we can not have same method with same argument. it is not allowed it is duplicaiton.
		
/* we override the above manin method but just change the paramater
/ if we run this it jvm just call the main method which has string parameter
	the rest will not run. so we should call the other main method inside
	the actual main method becuase it is static we can it directly.  
		
		
	*/
		
		// 
		//we call the below main method inside our main method.
		main(10);// since it has just one paramater it call the method with one paramater
	main (10,20);  // for second method
	// now if we run it jvm first call the actul method then the rest will run	
	}
	
	
	public static void main(int a) {
		System.out.println("main method 2");
	}
	
	public static void main(int a, int b) {
		System.out.println("main method 3");
	}
}
