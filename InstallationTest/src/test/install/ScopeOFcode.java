package test.install;

public class ScopeOFcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// scope to the code is the place where code is accessable.
  // Scope: the idea of scoping is that when we writing code it
//can go out of the scope the variable which is inside the blcok java cant read it..
 // where we should put the variable ? a good norm is to put the variable at 
		//the top of our class or method.	
		
		
		int myNumber = 10;
		if (myNumber>1) {
			int notGoodNumber = 5;  // this is inside the room java even cant see it. so shoudl be on the top that java can read it.
			
		}	else {
		}
		
	//	System.out.println(notGoodNumber);
		System.out.println(myNumber);   //  it is out of scope 
		
	
	
	int num = 1;
	switch (num) {
	case 1: 
		System.out.println(1);
	case 2: 
		System.out.println(2);
	
	case 3:
		System.out.println(3);
		break;
	default:
		System.out.println(" you are great ");
	
	
	}
	
	
	
	
	
	
	
	}


	
	
}









