package arry;

public class PlandromPractice {

	public static void main(String[] args) {
		String x= "Mom";
		String k= "brother";
		
		for (int i = k.length()-1; i>=0; i--)
			System.out.print(k.charAt(i));
		System.out.println("\n");
		int l= k.length()-1;
		boolean q= true;
		for (int i = 0; i<k.length(); i++)
			if (k.charAt(i)!= k.charAt(l--))
				q= false;
		System.out.println(q);
		
		
		
		
			
		System.out.println("\n");
for (int i = 0; i<x.length(); i++) {
	System.out.print(x.charAt(i) +"  ");
}
System.out.println("\n");
for (int i= x.length()-1; i>=0; i--) {
	System.out.print(x.charAt(i)+"  ");
	}
		
		System.out.println();
		
	int y = x.length()-1;
	boolean z= true;
	for (int i = 0; i<x.length(); i++) {
		if (x.charAt(i) != x.charAt(y--))
		z=false;
	}
	System.out.println(z);
	}
	
	

	}


