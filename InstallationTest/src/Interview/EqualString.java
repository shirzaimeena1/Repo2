package Interview;

public  class EqualString {

	public static void main(String[] args) {
		//10.Verify whether given two strings are
		//equal?
		String a="Hellow";
		String b= "Hellow";
		a =a.concat("TekSchool of america");
		
		
		System.out.println(a);
		
		StringBuilder sb = new StringBuilder ("TekSchool");
		
		sb.append("aMERICA");
		System.out.println(sb);
		//System.out.println(a==b);
		
		
		if (a.equals(b)) {
			
		}
//
		if (a.equals(b)) {
			System.out.println(" they are equal " + a + b);
		}else {
			System.out.println("they are not equal");
		}
		
		
	}

}
