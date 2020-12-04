package LAP;

public class LAP {

	public static void main(String[] args) {
 /*

 1. Create below Patterns:
	 A: 
	 *
	 **
	 ***
	 ****
	 *****
	 B: 
	 *****
	 ****
	 ***
	 **
	 *
	 C: 
	 *
	 **
	 ***
	 ****
	 *****
	 ****
	 ***
	 **
	 *
	 2. Reverse Following String in Console:
	 "Test Automation Engineer"
	 3. Specify the greatest Number:
	 int x = 600;
	 int y = 700;
	 int z= 300;
	 4. Reverse following number:
	 1234

 
 
*/
		
  for (int i= 1; i<=5; i++) {
	  for (int j=0; j<i; j++) {
	  System.out.print("*");
	  }
	  System.out.println();
		
  }
		for (int i = 5; i>=0; i--) {
			for (int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
//		for (int i=1; i<=5; i++) {
//			for (int j=0;j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		
//		for (int i=5; i>=0; i--) {
//			for (int j=0;j<i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
		//}
	
	 
	}

}
