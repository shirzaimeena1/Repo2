package inheritance;

public class Mammal extends Animal {

	public Mammal() {
		super();
		System.out.println("Mammal constractor run");
	}

	public Mammal(String name) {
		super(name);
	}
// overrides method: the way we override we should coppy the 
	//same exact signiture of method of parent class.
	// the green aray (terak) show us that it is override. if we get our carser on it.
	public String getname() {
		 return " Mamal class get naem method "+ super.getname();  
	}
}

	
	// the reason we cant access it becasue in animal class the string of name is
	// private. if we make it public then the red color will be removed.


// Inherentance is the relationship between two class.
// it is one way relationship becuase child class inherentance all code from parent class.
// every calss can have just one parent class.
// in java every class we make inherent from objict  class automaticaly . this is come with java. 
// we can not inherent from multiple class.

// the parent class for Mammal is Animal it mean Mammal can access to all method we have creat
// in Animal Class.
// if we see we jsut created one constractor method in Mammal but. we have all other 

// there is two way to use supper. 
//1. super () we are calling the constractor method of super class. 
// super (argument) by this we are calling on pramitarize constractor method.
//(super. ) we are calling objict or method of class.
