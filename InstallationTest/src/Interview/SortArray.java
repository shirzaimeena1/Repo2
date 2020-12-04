package Interview;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {


		int data [] = {2,4,5,1,3};
		
		
		
		Arrays.sort(data);
		
		for ( int b: data) {
			System.out.println(b);
		}
		
		//System.out.println(Arrays.toString(data));
		
		//Arrays.sort(data);  // this method sort array
	
		//System.out.println(Arrays.toString(data));
		
		// find number of alpha charactr
		String x = " Hello World";
		
		System.out.println(x.trim().length());
		
	String  [] array = x.split("");
	
	System.out.println(array.length);
//		

		
		// this is another way
		
		String relplce = x.replaceAll("[a-z A-Z]","");
		int alp= x.length()-relplce.length();
		System.out.println(alp);
	}

}
