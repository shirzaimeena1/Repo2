package Interview;

public class PartOfString {

	public static void main(String[] args) {
		//How to find out the part of the string from a string? What is 
		//substring? Find number of words in string?

		
		String x = " welcome to Tek school";
		System.out.println(x);
		System.out.println(x.toUpperCase());
		System.out.println(x.indexOf('t'));
		System.out.println(x.substring(9,11));
		
		//System.out.println(x.length());
		
//		System.out.println(x.indexOf('g'));
//		System.out.println(x.substring(11,16));
//		
		String y [] = x.split("");
		
		System.out.println(y.length);
//		for (String z: y) {
//			System.out.println(z);
//		}
	}
	}


