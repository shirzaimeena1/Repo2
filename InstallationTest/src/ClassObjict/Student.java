package ClassObjict;

public class Student {
     // this is just the class a blue print. we are just designing our class here. 
	// we dont creat any method here.
	// to not creat method when we creat class we shold not mark the first box.
	
	//public String name;// if we put public to this variable it is accessble throug out the program
	// if we want the variable to just be accessble inside the class we put private.
	// encapsulation making the variable private. it hide the varible
	// Access Modifier: it define the level of access to variable 
	// we have four access modifier ( public, private, protected, default)
	// private mean the variable is just accessable inside the classs.
	// public mean the variable is accessable throug out of the program.
	
	// Structure of variabel: Access modifier datatype identifier = value
	// example:  private String name = "Meena"
	//  constractor method:
	
	// we made the below variable encapsolation and we cant access it outside of the class.
	// for example if we sysout in the Runner like this sysout (st2.name) it wont work bacus we made it private here
    private String name;// these are the variable in our class
	private int age;  // variable
	// default constractive method  // we need this becuase it help us to creat objict
	public Student(){
		name ="";     // the job of constractor method is to intialize the variable that is why we are intializte the variable inside it as below.
		age =0;
	}
	
	// parameterized constructor method:  structure is same just the only different is we put value inside the printises. 
	public Student (String newName, int newAge) {
		name = newName;
		age= newAge;
		
	}
	//(String newName, int newAge) the above part is temporaty variable that we are assigning them to our veriable name and age.
	
//	this part public Student(String newName)called definiation or signiture of methodpublic.
//  the body called implementation 
	public Student(String newName) {
	 name= newName;
	 age = 0;
	
	 
	 // syntax of creating objict:
	 // className identifier = new class(argument);
	}
	
	// this is the syntax for  general method.
	//syntax for general method
	// Access Modifier Return datatype identifier () {     return anything we want
	//}
	
	// this is called getter or accessor method
	// we use these method for every variable in our class because we encapsulate them.
	public String getName () {
		return name ;  // the reason we mentioned return here  becasue it is general method and it has return datataype. since we want to get name we mentioned  return name.
	}
	
	
	// this is called mutator or setername	
	public void setName(String NewName) {
		name=NewName;
	}
	
	public int getAge() {
	 return age;
}
	public void setAge(int Newage) {
		age= Newage;
	}
}



