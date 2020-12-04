package Interview;


public class Swap {

	public static void main(String[] args) {
//		 int a = 2;
//		 int b = 4;
//		 
//		 a= a+b;
//		 b = a-b;
//		 a=a-b;
//		 System.out.println(a);
//		 System.out.println(b);

		 
		 String x = "Hellow";
		 String y = "Hi";
		 
		
		 
		 x = x+y;
		 y=x.substring(0,(x.length())- y.length());
		 x= x.substring(y.length());

		 System.out.println("this is value of x" +x);
		 System.out.println("this is value of y " + y);
		
	}

}
