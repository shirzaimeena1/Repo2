package Abstraction;

public interface Car {
	
	 /*
	//  the way we creat interface is like class we just selct interface under the car.
	 * in interface we just declear the method we dont have they body method.
	 * we can not creat objict of interface.
	 * in interfce we can not have static method.
	 * enterface  is 100% abstraction. it mean that we can have just the definiation of method not the implementation. 
	 * but ther is one exception whihc is default keyword. 
	 */
     static int t = 10;
	int numberOfdoors= 4; // wen we are intializting a variable in interface it is final the value of it will be same in all other class.
	public void reducedSpeed( double speed);  // we have only the difination of method.
	
	public void increaseSpeed(double speed);
	

	
	/*
	 * default keyword: it enable us to implement the method in interface without
	 *  any complain from other class.
	 *  if we have a banch of classes that implement the interface and if we add a new method in
	 *  interface that all other class must implement the new method by doing this they system will crash.
	 *  that is why we use the defual keyword. which give all the class the defult implementation of method without forcing them.
	 *  default: to summarize defult will enable us to add new functionality to existance interface 
	 *  without breakeing the other implementation 
	 */
	
	
	public default void depo() {
		System.out.println(" the defalut implementation");
	}
	
	// wen we creat static memory in interface we have creat it is body as well.
	//becuase static method will be store in static memory whcih
	//all the class can have access to it.
		public static void demo() {
			System.out.println(t);
		}
	
}

