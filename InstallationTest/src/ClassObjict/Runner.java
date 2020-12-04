package ClassObjict;

public class Runner {

	public static void main(String[] args) {
		// how to creat objict of class?
		// here we are creating objict of the class student. in the runner we just design the class.
		// when we are creating an objict of the class it is same as creating variable
        // objict refrence: is the name of the objict in the below name of objict is (st1,st2,st3)
		// if i need to get to objict Jack we say i need st2 because it is the name of objict.
		
		
		// syntax of creating objict:
		 // className identifier = new class(argument)
		//new Student (); this part is the objict of class Student
		// new keyword is used to creat objict
		// sti, st2,st3  is objict refrence we can not have duplicate objict refrence  
		Student st1 = new Student ();// structure of creating objict.

		Student st2 = new Student ("jack", 21);
		int x = 10;
		Student st3 = new Student("jack",21);
		
		//System.out.println(st2);
		// if we just sysout System.out.println(st2); it will print just give a reference of the method. in order to print the objic. 
		// we should  put . then select or write the name of method. 
		
		System.out.println(st2.getName());
		System.out.println(st2.equals(st3));
		
	}

}
