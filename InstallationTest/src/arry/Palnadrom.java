package arry;

public class Palnadrom {

	public static void main(String[] args) {
	// palindrom is a word, number or phrase which is same from both way.
	 
	//we will you give you a value and show it that weather it is palindrom or not

		
		String x = "tacocat";
	
		
		 // x.charAt return caracter of String.
				 
	// inside the printises () we put number of indix so for t number of indix is 0	 
		 System.out.println(x.charAt(0)); 
	System.out.println( x.length()); // her the length is a method while in array it is variable.
				 // when we use lenght in string we should have () infront of it
	
		
		System.out.println(" actual loop____Farword____________");
		for (int i= 0; i<x.length(); i++) {	
			System.out.print(x.charAt(i)+ "  ");
		}
		
// in the below since we are going from end so that is why we shoudl decrease it 
		System.out.println();
		
		System.out.println(" actual loop____Backword____________");
		for (int i= x.length()-1; i>=0; i--)	{
			System.out.print(x.charAt(i) +  "  ");
		}
		// anotherway of reverse
		StringBuilder b= new StringBuilder(x);
		System.out.println(b.reverse());
		System.out.println("\n -----so what we are doing ____________");
		
		int y = x.length()-1;
		boolean z= true;
		for  (int i= 0; i<x.length(); i++) {
			if (x.charAt(i)!= x.charAt(y--)) {
				z=false;
			}
		}
		System.out.println(z);
	}

}
