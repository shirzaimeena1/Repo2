;ppackage test.install;

public class Escaping {

	public static void main(String[] args) {
		

		// escaping Sequence: it mean to not see the doblue cotatio " actual functionality. 
//		String myText = "test 01";
//				System.out.println(myText);
			
		
		// if we want to print the 01 inside the double cotation like this "01" 
		// we should use from backword slash to ignor the qutation. we are saying java to escape the double code '' 
//			//	String myText = "test \"01\"";	
//			//	System.out.println(myText);
				
		// \n\n \n it mean go to the next line based on number of n it will go to the line
//				
//				String myText = "test \n\n\n\"01\""; // 01 will be print in line 3 based on number of n 
//				System.out.println(myText);
		//  t mean space in escaping 
//				String myText = "test \n\n\n\t\"01\"";
//						System.out.println(myText);
		String myName = "Meena\n\"Shirzai\"";
		System.out.println(myName);
		String myFatherName= "Haji\t\"Habib\"";
		System.out.println(myFatherName);
		
		// Concatanation : the idea of concatination is to add multiple variable toghather.
		
//		int myNumber = 1;
//		int yourNumber = 2;
//		String myText = "test\"03\"   ";
//		System.out.println(myText + myNumber +yourNumber); // here int will be mixed with string 
//		System.out.println(myText + (myNumber +yourNumber)); // we shoud take in inside the pritises ()
////  Practice  
//		String x1= "myDaughter\"Marsana\"";
//		String x2= "I love you";
//		System.out.println(x1+ "  "+x2);  // if we want use space in between we should use cutation "
		
		String x1= "myLife";
		String x2= "myDaughter\t\"Marsana\"";
		 System.out.println(x1+ "  " +x2);
		
		
		
		String z = "Test \"01\"";
		System.out.println(z);
		
		
		String b= "Test \"02\"";
		System.out.println(b);
		
		
		
		
		String m = "book\t\"001\"";
		String n = "book\"test\"";
		System.out.println(m + "  " + n);
		
		
		
		String lk= "test\t\n\"01\"";
		System.out.println(lk);
		String color = "white";
		String car = " toyoutua\t\"2002\"";
		System.out.println(car+ "  " + color);
		System.out.println(car+ "  " +color );
		
		
	}
		
		
		
		
		
		
		
	}


