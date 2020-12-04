package arry;

public class Plandrom {

	public static void main(String[] args) {


		String x = "tacocat";
	
		System.out.println(x.length());
		System.out.println(x.charAt(0));

		int y = x.length()-1;
		boolean z = true;
		
		for (int i= 0; i< x.length(); i++) {
			if (x.charAt(i)!= x.charAt(y--)){
				z=false;
			}
			
		}
		System.out.println(z);
		
		StringBuilder b = new StringBuilder (x);
		System.out.println(b.reverse());
	}

}
