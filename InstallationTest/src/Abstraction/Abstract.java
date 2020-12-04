package Abstraction;

public abstract class Abstract {
	/*
	   abstract class is like other class. we can creat it like other classes 
	    but with the different that it accept both abastract method and other methoeds.
	 
	 we can not creat constractor method in abstact classes
	  becuase we cant creat its objict.
	  
	  if we creat another class and extends (inherint)from abstract class. under our class name we get  red
	  line and we take our carse on it  it ask us to add (unimplemented method).
	*/

public abstract void setName(String name);
	public abstract int getAge();  // abstract method
	
	public int getvalue() {   // other method 
		return 10;
	}

}
