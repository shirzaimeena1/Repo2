package LAP;

public class Reverse {

	public static void main(String[] args) {
//		int num= 123456789;
//		int rev=0;
//		while (num!=0) {
//			int n=num%10;
//			rev= rev*10+n;
//			num=num/10;
//		}
// System.out.println(" reversed is number: " +rev);
 
// int number= 123456789;
// for (int i=9; i>=0; i--) {
//	 System.out.print(i);
// }
 String b = "tacoocat";
 System.out.println(b.charAt(0));
 System.out.println(b.length());
 
 for (int i =0; i<b.length(); i++) {
	 System.out.print(b.charAt(i)+ "  ");
 } 
 System.out.println();

	 for (int i =b.length()-1; i>=0; i--) {
		 
		 System.out.print(b.charAt(i)+ "  ");
	 }
	System.out.println("\n ------- ");
	
	int y = b.length()-1;
	boolean z= true;
	for (int i =0; i<b.length()-1; i++) {
		if (b.charAt(i) != b.charAt(y--)) {
			z=false;
		}
	}
	System.out.println(z);
//	int y = b.length()-1;
//     boolean z= true;
//     for (int i=0 ; i<b.length(); i++) 
//    	 if (b.charAt(i)!=b.charAt(y--)) 
//    		 z= false;
//    	 
//     
//     System.out.println(z);
	
}
	
	
}
