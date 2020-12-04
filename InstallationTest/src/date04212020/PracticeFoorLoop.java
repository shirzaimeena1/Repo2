package date04212020;	

public class PracticeFoorLoop {

	public static void main(String[] args) {

		/*
		write a loop like below using for loop
		
		10
		
		9
		
		8
		
		7
		
		6
		
		5
		
		4
		
		3
		2
		1
		 enough 
		 
		
		*/
		
		for(int i= 10; i>=1; i--) {
			System.out.println(i +"\n");
		}
			
		System.out.println("enough");
		
		
		
		
		
		
		
		
		
		
		
		
		
	 for (int i=10; i>=1; i--) {
		 System.out.println(i +"\n");
	 }
	
	System.out.println(" enouph");
	
/*write a program that count by 2 from 0 to 16 as below
 the count number is : 0
 the count number is : 2
 the count number is : 4
 
 
 
 
 
 the count number is : 16
 
 */ 
  

	xzx
 for  (int count =0; count<=16; count+=2) {
	// if (count%2==0)
		System.out.println("the count number is: " + count );
		
		
	}
 
 // creat a boolen variable called bool. if bool is equal assing value of true and loop for time.
 
   boolean bool;
   bool= false;
   if (bool==true) 
    for (int z = 0; z<=4; z++) {
    		
    	System.out.println( "the value os variable is: "+ bool);
    }
     
    if (bool==false) {
    	for (int m= 0; m<4;m++) {
    		System.out.println(" the size of variable is: "+bool);
    	}
    }
   /*print from a to z using loop as follow
    
    A  a
    B  b 
    Z  z
    */
   char  upperCase, lowerCase;
   upperCase= 'A';
   lowerCase= 'a';

   for (int i=0; i<26; i++) {
	 System.out.println(upperCase + "   " +lowerCase);
	  upperCase++;
	  lowerCase++;
   }
   
   
   System.out.println();
   System.out.println( "print from z to a");
   for(int n=26; n>=0; n--) {
	   System.out.println(upperCase  + "\t\t" + lowerCase);
	   upperCase--;
	   lowerCase--;
   }
   
   
    
    	
    }
	}

	


