package Keywords;

public class ReversString {

	public static void main(String[] args) {
	// how to reverse a string.
		
// we have a method in sting builder and buffer called 
// reverse we use that to reverse out string. so firt we have to change the string to string builder 
		
	String x = " Tek School of America";
	
	
	
	for (int i = x.length()-1;i>0;i-- ) {
		System.out.println(x);
	}
	//x=x.toLowerCase(); // if we want to change the value we have to assign it to our variable other wise it wont print and work.
	
	StringBuilder sb = new StringBuilder (x);
	//sb.append(" i like java"); // we use this method to add at the end of our string somthing that we want.
	String z= new String (sb);
	

	System.out.println(x);
	// the reason that the second reverse print the same value of string becuase string is
	//immutable and if we want to change it is value we have to creat a new objict and refer
	//to a new reffrece in stack. we can see that by reverse still th value of sting is not changed.
	System.out.println(sb.reverse());
	System.out.println(sb.reverse());
	System.out.println(z.equals(x));

		
	

	}

}
