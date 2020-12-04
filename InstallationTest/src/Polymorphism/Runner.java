package Polymorphism;

public class Runner {

	public static void main(String[] args) {
		
		
		/* upcasting: we are declaring objict of parent class and intializing the objict of child class.
     // benefit of upcasting is that the code can be adobtable to the thing that we need.
		// we store the objict of child class in the refrence objict of parent class.
		// any class that we instantiate we have access to the all method of that class.
		// in below technically we call method of child class becuae we 
		*/
		
		
		Car x= new Bmv(2, "new", "crola", "lm", 2204, 4);
		Car x2 = new Bmv();// upcasting
		Bmv y = (Bmv)x2;  // downcasting
		System.out.println(x.getmodul());
		System.out.println(x.getname());
		System.out.println(x.getnumberOfdoors());
		
		
		Car [] arrayOfCar= new Car[10];
		arrayOfCar [0]= new Bmv();  // upcasing 
		
		
		// since we all class inherent from objic
		Object[] z= new Object[10];
		
		z[0]= 1;
		z[1]= "String";
		z[2]= true;
		
		
	}

}
