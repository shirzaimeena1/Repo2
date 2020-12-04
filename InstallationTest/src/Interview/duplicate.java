package Interview;

import java.util.HashSet;

public class duplicate {

	public static void main(String[] args) {
	
		// find duplicate 
		
		String data[]= { "Meena", "Masana", "Meena", "Akram", "Akram"};
		
		
		HashSet <String> M = new HashSet< String>();
		
		M.add("Meena");
		M.add("Marsana");
		M.add("Meena");
		
		System.out.println(M.add());
		
		
		
		
		
		for ( int i = 0; i<data.length; i++) {
			for (int j= i+1; j<data.length; j++) {
				
				if ( data [i].equals(data[j])) {
					
				System.out.println(" there is a duplicate");
				System.out.println(" vaule of  "+ data [i]);
				System.out.println(" index number " + i + " " + j);
		
		
		
		
				}

//		for (int i=0; i<data.length; i++) {
//			for (int j = i+1; j<data.length; j++) {
//				
//				if (data[i].equals(data[j])) {
//					System.out.println(" there is a duplicatio");
//					System.out.println(" value: " + data[i]);
//					System.out.println(" index number"+ "  " + i + "  " + j);
//				}
//			}
//			
//		}
//		
			}	
	}
}
	}
