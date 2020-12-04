package test.install;

public class InterviewQuestio {

	public static void main(String[] args) {
	int x = 10;
	int b = 20;
	int z = x+b;
	System.out.println(z);
	
	
	// how to find out the part of the string from string?
	String shoping = "i want manto";
	System.out.println(shoping.indexOf("manto"));
	System.out.println(shoping.substring(7));
	System.out.println(shoping.length());
	String []words =shoping.split("");	
	System.out.println(words.length);
	System.out.println(shoping);
//	for (String string: shoping) {
	//	System.out.println(string);
	//}
	
	// revesr
	
	String a = "Hellow Afghanistan";
	
	StringBuilder sb = new StringBuilder(a);
	System.out.println(sb.reverse());
	System.out.println(sb.reverse());
	
	
	
	int k = 1234;
	
	String number = String.valueOf(k);
	StringBuilder n = new StringBuilder(number);
	System.out.println(n.reverse());
	
	
	
	int num = 123456;
	int reversnum= 0;
	
	while (reversnum!=0) {
		
		reversnum= reversnum*10 +num%10;
		num = num/10;
		System.out.println(reversnum);
		
	
	}
	
	}
	

}
