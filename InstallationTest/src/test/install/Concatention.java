package test.install;

public class Concatention {

	public static void main(String[] args) {
		
		// concatenation: 
		
		// if + is between a text and another value it is concatanation
		// if + sing is between two number it is addition.  below is example
		
		
		int x= 1;
		int y= 10;
		
		//
		System.out.println(x + y + "test");// it do first the sum and it is becuase of flow of execution.
		System.out.println("test" + x + y );
		int age = 12;
		
		while (age<21) {
			System.out.println("probably new year, " + age +" maybe");  // + is here concotanation. 
			++age;
		}
		
		System.out.println("you can have cocola");
		

		
		int grade = 20;
		
		do {
		
			System.out.println("you are pased the exam " + grade);
			++grade;
		}	while (grade<20); 
		}
	}


