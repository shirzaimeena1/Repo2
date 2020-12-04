package ClassObjict;

public class FunctionInJava {

	public static void main(String[] args) {
		
		FunctionInJava a = new FunctionInJava();
  a.test();
 int i = a.age();
System.out.println(i);
	}
	//
	// in order to run non static method 
	// we have to create the objict of the class.
	//when we creat the objict  a copy all not static method will be given to it.
	
	
	// creating  non static method:
	public void test() {  // withoud input and output 
		System.out.println("test");
	}
	public int age() {    // this method is without input but some output
		System.out.println("age method");
		int a= 10;
		int b=20;
		int c=a+b;
				
		return c;
		
	}
	
	public int devision(int x, int y) { // this one with input and output
	 x = 10;
      y=5;
	int d = x/y;
	return d;
	}
	
	
}
