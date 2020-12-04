package EXception;

public class ExceptionDetail {

	public static void main(String[] args) {
		
		
		// this  one is unchecked exception becuase it happen during run time
		/* in order to not crash the system we use try and catch to
		handle with the exception. since the above variable give exception. we use try and catch block 
		*/
////		try {
////			System.out.println(x/y);  // we write the code i mean the sysout of the cod
////			
////		}catch(ArithmeticException a) {  // a is a declarition for our exception it can be any letter.
////		System.out.println( "there is an aritmatic exception ");
////		}
////		System.out.println(x/y);
////		System.out.println("end");  // it wont print this because the system will crash.
////		// this is exception out of bandries.		
  
	//int x = 10  this is checked exception.
		int x= 10;
		int y= 0;
	//	System.out.println(x/y); this is also aritmatic exception.
		int data [] = {1,2,3};  // we can have multiple catch statment.
		  try {
			  System.out.println(x/y);  // this is not arrayout of boundaris.that is why the first catch will not print the second catch will print.
				
		  } catch (ArrayIndexOutOfBoundsException e){
			  System.out.println( " first catch");
			  
		  } catch (Exception e) {
			  System.out.println(" second catch");
			 try {System.out.println(x/y);
				 
			 } catch (ArithmeticException d) {
				 System.out.println("the first catch has cause aritmatic exception");
			   
		  } finally{                  // execute anyway it is for clean up the cod.
			  System.out.println(" finally ");
		  
		
	// if we put the word Exception ( since it is the parent for all exception) at the fist chech the second catch will be unreachable so that is why we don put it that at the begining.
	
//		  try {
//			  System.out.println(data[4]);
//				
//		  } catch(Exception a){
//			  System.out.println( " first catch");
//			  
//		  } catch (ArrayIndexOutOfBoundsException e) {  // this one give rror becuase we put the exception in firt block.
//			  System.out.println(" second catch");
//			  
//		  } finally{
//			  System.out.println(" finally ");
//		  }

   
  
 
  
  System.out.println("end");
		  }
	}
	}
  // inorder to find the proble we can copy the cosole part and past it in good and find the solution.
	


}