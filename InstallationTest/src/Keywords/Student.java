package Keywords;

public class Student {
	/* static : it is class level varible which
	  store in specific area in the memory called
	 * static memory.
	 every variable we create it is objict level variable.
*/
	public String name;
	public int age;
	public static  int NumberOfStudent;
	
	public Student() {
	this.name = "";
	this.age=0;
	NumberOfStudent++; // because everytime the objict that call our method the static variable increase by 1.
	}		
	
	
	

}
