package Abstraction;

public class BMW implements Car {
	//2.now we have the method but we can have different implementation 
	//@Override  // this is called annotation it define that this method is override it. it till me we are geting the method from somewher else. if we dont put it still it work.
	// in abstraction we just want that every class should have the same method but different implementation.
	// the implementation that we have for the current below mehtod can be different in our bez class.
	double speed= 10;
	double speedChangeFactors= 0.3;
	
	public void reducedSpeed(double speed) {
	this.speed-=speed*speedChangeFactors;
		
	}

	@Override
	public void increaseSpeed(double speed) {
	this.speed+=speed*speedChangeFactors;
	
	}
public static void main(String[] args) {
	BMW x= new BMW();
	x.increaseSpeed(50);
	System.out.println(x.speed);
}
	
		
	}  
/*
 * 1.when we add the implements Car it mean that we accept the 
 * contract of the car class so we have have its method in this class 
 * otherwise there will be red line under of BMW class. if we take our carser on it option will be 
 * we should select  add unimplemented method. 
 * 2.now we have the method but we can have different implementation 
 * 
 * 
 * 
 * 
 * 
 */

 
