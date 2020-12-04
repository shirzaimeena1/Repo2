package StringPractice;

import java.util.Arrays;

public class InterviewQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// swaping 
		int a = 10;
		int b = 20;
		
		a = a+b;
		b=a-b;
		a= a-b;
		
		System.out.println(" the value of a: " + a);
		System.out.println("the value of b:" +b );
		
		
		String x = "Meena";
		String y= " Akram";
		
		x = x+y;
		y= x.substring(0,x.length()-y.length());
		x= x.substring(y.length());
		System.out.println(x);
		System.out.println(y);
		
		
		String given = "abcdef123456&&&&";
		String replaced = given.replaceAll("[a-z A-Z]", "");
		int allcharacter= given.length()-replaced.length();
		System.out.println(allcharacter);
		
		
		
		 int m = 23;
		 
		 if (m%2==0) {
			 
			 System.out.println(" this is odd number " + a);
		 }else 
			 System.out.println(" this is even number" + a);
	
		 
	String z = " TekSchoolof maraica";
	System.out.println(z.substring(12));
		 
	
	//8.  Write a program to sort array in ascending order?//1 method
	
	int data [] = {1,2,3,4};
	
	Arrays.sort(data);
	System.out.println(Arrays.toString(data));
	
	
	
	// how to converty string to array
	
	String str = "Meena jan ";
	
	char [] array = str.toCharArray();
	
	for (char c: array) {
		System.out.println(c);
		
	}
	
	// converting array to string
	System.out.println(array.toString());

	
	
	//  is this two string is equal?
	
	
	String st1 = "Hellow";
	String st2 = "Hellow";
	
	if (st1.equals(st2)) {
		System.out.println(" they are equal");
	}
	
	//System.out.println(st1.equals(st2));
	
	//Write a program to sort array in ascending order?
	
	int k []= {2,4,3,1};
	
	// arrays.toString () if we want to pring array in cousul we should use this method.
	
	System.out.println("array before soring" + Arrays.toString(k));
	
	Arrays.sort(k);// if we want to sort array we shoudl call this method.
	System.out.println(Arrays.toString(k));
	
	
	}
}
