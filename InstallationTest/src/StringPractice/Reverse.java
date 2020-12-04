package StringPractice;

public class Reverse {
  // string builder is fast than string buffer.
 // if we want to reverse it we have to change to string builder and then change it.
	public static void main(String[] args) {
	String x=" Tek School of America";
	StringBuilder sb= new StringBuilder(x);
	System.out.println(sb.reverse());  // we have to  use reverse to reverse it.

	
	String y = "Meena Marsana and Akram";
	StringBuilder t= new StringBuilder (y);
	System.out.println(t.reverse());
	System.out.println(y);
	
	
	String m = "Selenium";
	
	int ln = m.length();
	String rev ="";
	for (int i = ln-1; i>=0; i--) {
		rev= rev+m.charAt(i);
	}
	
	System.out.println(rev);
	}

}
