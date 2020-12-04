package StepHep;

import ClassObjict.Student;

public class StepHep {

	public static void main(String[] args) {
		//equality in stack and hip
	 
		// when we are using  the comprison (==) we are checking to see where the value is equal in stack.
		Student st1 = new Student ();// structure of creating objict.

		Student st2 = new Student ("jack",21);
		int x = 10;
		Student st3 = new Student ("jack",21);
		
		System.out.println(st2==st3);  // they are not equal becaue in stack the will be store in differnt area.
	}
  
}
