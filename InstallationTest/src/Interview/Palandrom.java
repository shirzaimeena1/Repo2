package Interview;

public class Palandrom {

	public static void main(String[] args) {
	
		
		String x = "moom";
		
		int y = x.length()-1;
		boolean z = true;
		
		for ( int i = 0; i <x.length(); i++) {
			if (x.charAt(i)!=x.charAt(y--)) {
				z= false;
			}
		}
		
		System.out.println(" they plandrom");
		
//		int y = x.length()-1;
//		boolean z = true;
//		
//		for (int i = 0; i<x.length(); i++) {
//			if (x. charAt(i)!= x.charAt(y--)) {
//				z= false;
//				
//			}
//		}
//		System.out.println(" they are plandrom"+ "   " +z);
	}

}
