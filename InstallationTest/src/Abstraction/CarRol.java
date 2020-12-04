package Abstraction;

public class CarRol extends Abstract{

	@Override
	public int getAge() {
		
		return 20;
		
	}
	
	/* in this class we extend from  abstract class .
	so here we are required to implement the abstract method .
	and also we can inherint the other method since we used extends.
	

	*/
	
 public static void main(String[]args) {  // we creat this main method to jsut see that we can inherit the other method of abstract calss
	 
	CarRol x = new CarRol();
	x.getvalue();
	System.out.println(x.getvalue());
	}
 
  
}
