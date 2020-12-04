package Keywords;

public class Duplicate {

	public static void main(String[] args) {
		
		String x [] = { "job", "work", "job", "student", "job", "work"};
		
		// find duplicate
		
		
		
		
		
		
		
		
		
		
		
	outer:	for (int i= 0; i<x.length; i++) {
	inner:		for (int j= i+1; j<x.length; j++) {
			
				if (x[i].equals(x[j])) {
					
					System.out.println(" there is a duplicate");
					System.out.println("value " + x[i]);
					System.out.println("index " + i + "  " + j);
					break outer;
				}
			}
		}
//		
		
		String y []= {"meena", "meena", "Marsana", "Marsana"};
		System.out.println("size of array: " + y.length);
		
	outer: for (int n = 0; n<y.length; n++) {
		inner: for (int m=n+1; m<y.length;m++) {
			 if (y[n].equals(y[m])){
				 System.out.println(" there is a duplicate in array");
				 System.out.println("value : "+ y[n]);
				 System.out.println("index " + n +"  "+ m);
				 break ;
			 }
			 
		 }
		 
		
		 
	 }

	}

}
