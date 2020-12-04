package test.install;

public class Interview11 {

	// by using static keyword we can print without main method.
	static {
		System.out.println("Hellow marsana");
	}
	
	public static void main(String[]org) {
		
		
		String a = "Hellow";
		String b = "Hellow";
		
		System.out.println(a.concat("Afghanistan"));
		StringBuilder sb = new StringBuilder("Hellow tek school");
		
		a = a.concat("TekSchool");  // concat is megring two array or two string
		System.out.println(a);
		sb.append("Amarica");
		System.out.println( sb);
		
	}
}
