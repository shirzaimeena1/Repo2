package date04212020;

public class LoopingForAdvance {

	public static void main(String[] args) {

//		for ( int counter=0; counter <51; counter+=3) 
//               System.out.println(counter);

//  we have a range of number between x-y
// print all even number first and then all of odd number the range
		// 1-10
		// 2 4 6 8

		// for these type of question we should creat int x and int y
		/*
		 * WE CAN RENAME THE NAME of our varibale ( refactor them) all at once. it will
		 * refactore it in all the places that we have have used this name. we use
		 * alt+shift+r
		 * 
		 * 
		 */

//		for ( int i=0; i<30; ++i)
//			System.out.println(i++);

//		for (int i =1; i<=30; i++)
//			System.out.println(i++);
//				
//		int x = 1;
//		int y = 10;
//
//		String even = "even number in the range are:";
//		String odd = " odd number in the range are:";
//
//		for (int i = x; i <= y; i++) {
//			if (i % 2 == 0)
//				even += i; // the reson we wrote like this becasue our next even number is i+2
//
//			if ((i + 2) <= y)
//				even += " ,";
//
//			else
//				odd += i;
//			if ((i + 2) <= y)
//				odd += " ,";
//
//			System.out.println(even);
//			System.out.println(odd);
//		}


//		String even = " even number in the range are:";
//		String odd =" odd number in the range are:"	;	
//				
//		 int x=0;
//		 int y=10;
//	 for (int i =x; i<y; i++) {
//		if (i%2==0) {
//			even += i + " ,";
//	          System.out.println(even);
//		}else 	{
//	         odd += i + " ,";
//	          System.out.print(odd);
//		}	
//	 }
//	}
//	for (int i=x; i<y; i++) 
//		if (i%2==0) 
//			System.out.println(i +"  " + "is even" );
//		else 
//				System.out.println(i+ "  " + "is odd");
//			

//
//		System.out.println(x + y + "test");// it do first the sum and it is becuase of flow of execution.
//		System.out.println("test" + x + y );
//		
//    for (int i=x; i<y; i++) 
//    	if (i%2==0)
//    		System.out.println(i + "is even");
//    	else
//    		System.out.println(i + "is odd");

   for (int out=1; out<=5; out++)
   {
	   for (int in=1; in<=out; in++)
	   {
		   System.out.print(in + " ");
	   }
    System.out.println();
   }
	
 
	}
	   }
	
 
 
 
