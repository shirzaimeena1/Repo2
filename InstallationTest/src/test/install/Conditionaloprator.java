package test.install;

public class Conditionaloprator {

	public static void main(String[] args) {
		
		// conditional operator (?:): or ternary operator . if the condition inside the breaket is true then the result is the first number if no not ture
				// the second number is the result as below	
		
		// NOTE: Conditional operator is the short cut of if statment 
		int x,y;
		
		x= 10;
		y=20;
		 x =( 10<20)? 30: 40;			
		System.out.println(x);
			
		 y = ( 10>20)? 30: 40;  // 10 is not bigger than 20 so it is false the result will be 40
				 System.out.println(y);
	
		int grade = 75;
		String s = "The Student";
				
		s= (75 >60)? "passing.": "failed";
		System.out.println(s);

	}
	
	
	
	

}
