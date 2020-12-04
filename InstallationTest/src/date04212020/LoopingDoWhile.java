package date04212020;

public class LoopingDoWhile {

	public static void main(String[] args) {
	// it called exit cantorl loop.
		// different between  do while and while: in while java first check the condition if condtion was true it will execute the bodyloop
		// do while : java dont check the condition first, it first execute the body then check the condition if condition was true again it execute the body
		//do while grantee at lease one execution. 
	// if we print this it wont run because the condtion is falls 	
		// puting simicalum in do while is mandatory while in other loop we dont put any simicolum.
		
		
		int child= 0;
		while (child>10) {
			System.out.println(" you have enough children " +child);
			++child ;
	}
			
	do {
		child++;
		System.out.println(" you have enough children  "+ child);
	} while (child>10);
			
		int age = 10;
		while(age>20 && age<20) {
			age++;
			System.out.println(" you can drive" + age);
		
		}
		
		do {
			age++;
			System.out.println(" you can drive" +age);
			
	}while(age>20 && age<150);  // cotation is necesarry.
		
		
		// while loop
		int grade =0;
		
		while (grade>0) {
			grade++;
			System.out.println(" you ate the best");
		}
			
		// it wont print because the condition is not true
		int ticket= 30;
		while (ticket<30) {
			
			System.out.println(" you can go for it");
			++ticket;
		}
				
		// if a change it to do while it will execute it.
		
		int i =1;
		
		 do {
			 ++i;
				System.out.println(" you can go for it" + i ); 
		 } while (i<30);	
		
		 
		 
			 
	}
				
 
		
	}
		
	


