package test.install;

public class Slection5day {

	public static void main(String[] args) {
		
		
		// we can define  multiple variable of same data type to one data type. as follow
		 
//	int age, shoes, clothes; 
	
	// also we can assign value for them as follow
	//int age = 2, shoes=4, clothes = 10;
	
	boolean passed = false;
//			if (passed)
//			{
//				System.out.println("you passed the class");
//			} 
//			else   {
//				System.out.println("you fialed the class");
//			}
	
		// NOTE : (=)one equal is called assignment perator. while (==) equality operator.
		int x,y;
		x= 15;
		y= 5;
		
		if (x==y) {
			System.out.println(" x is equal to y");
		} else if (x>y) {
			System.out.println("x is bigger than y ");
		} else if (x<y) {
	         System.out.println(" y is bigger");
		}
		
	
		char firtsLetter = 'a';
		char secondLetter = 'b';
		boolean passed = firtsLetter > secondLetter;
		System.out.println("true");
	
		
	//logical operator: WE can only use it with primitive data type not with objict and string.
// Note: conditional operator: we have equality ===, relational which is >, <, ==>, we have logicL operato,which is && and || or, not !=
		
		
		// and operator both side should be ture. for result to be true
//		if (x >10 && y < x) {
//			System.out.println("all is good");
//		}
		// or operator: one side be true for result to be true
		
		if (x >10 || y > x) {
			System.out.println("all is good");
		}
		//
		
		//( !) not operator: reverse the state of boolean. it mean if is ture java make it fall if fall it make it true.
		
		
		if (!passed) {
			System.out.println(" you are great");
		}
		if (x!=y) {
			System.out.println("you are the best");
		}
		
	//zor operatore = both side should be diffrent to take true result.
	
	
		
		
		
	
		
	}
	
	
	
	

}
