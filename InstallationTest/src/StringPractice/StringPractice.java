package StringPractice;

public class StringPractice {

	public static void main(String[] args) {
		String x= "Mother";
		String y= "mother";
		
		System.out.println(x.length());
		System.out.println(x.charAt(1));
		System.out.println(x.indexOf('M'));
		System.out.println(x.substring(1));
		System.out.println(x.replace('M', 'S'));
		System.out.println(x.replace('S', 'M'));
		System.out.println(x.toLowerCase());
		System.out.println(x.toUpperCase());
		System.out.println(x.indexOf("the"));
		System.out.println(x.substring(2,5));
		System.out.println(x.substring(x.indexOf("the"), x.indexOf("the") +"the".length()));
		System.out.println(x.toLowerCase());
		System.out.println(x.equals(y));
		System.out.println(x.equalsIgnoreCase(y));
		System.out.println(x.contains("t"));
		System.out.println(x.startsWith("m"));
		System.out.println(x.endsWith("r"));
				

	}

}
