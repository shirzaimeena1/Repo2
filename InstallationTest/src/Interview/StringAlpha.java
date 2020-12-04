package Interview;

public class StringAlpha {

	public static void main(String[] args) {

		//Find out how many alpha characters present in a string?
		
		
		System.out.println(" ab12323232");
		String given = " ab12323232";
		String replace = given.replaceAll("[a-zA-Z]", "");
		int alph = given.length()-replace.length();
		System.out.println(alph);
		
		
		
		
		
		
		
//		String replace = given.replaceAll("[a-zA-z]", "");
//		int apla = given.length()-replace.length();
//		System.out.println(apla);
//
//		
//		System.out.println("Hellow world");
//		
	String x = "Hellow World";
	String y = "hellow world";
		
	System.out.println(x.indexOf("World"));
	System.out.println(x.charAt(7));
	System.out.println(x.length());
	System.out.println(x.substring(7));
	System.out.println(x.toLowerCase());
	System.out.println(x.toUpperCase());
	System.out.println(x.equalsIgnoreCase(y));
	System.out.println(x.startsWith("w"));
	System.out.println(x.replace("World", "mother"));
	
	
	}

}
