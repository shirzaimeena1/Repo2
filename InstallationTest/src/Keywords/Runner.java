package Keywords;

public class Runner {

	public static void main(String[] args) {
	/* if we want to access the static variable we 
		have to mention the name of class bcz it class
		leve variable. as below
		
	*/
 Student x = new Student (); 
 
 System.out.println(Student.NumberOfStudent);// example of above.
 
 
Student y = new Student (); 
 
 System.out.println(Student.NumberOfStudent);
 
	}

}
