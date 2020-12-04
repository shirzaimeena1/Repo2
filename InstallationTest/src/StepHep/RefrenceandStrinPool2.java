package StepHep;

public class RefrenceandStrinPool2 {

	public static void main(String[] args) {
///equality in stack and hip
		// when we are creating String of litral value (when the value is inside the qutation (")
		//we call it litral value) we have area called string pool inside the memory
		//whic our litral value store there
		// when we are using the equality operator (==) we are comparing the refrence  in stack .
		// when we are using .equal we are seeing is the value is equal in hip
		String st1 = "test";
		String st2 = "test";
		String st3 =  new String("test");
        
		System.out.println( "using the == operator");
		System.out.println(st1==st2);
		System.out.println(st1==st3);
		System.out.println(st2==st3);
		
		// in here we comparing the value in the hip not the refrence and address or the objict. they are loop through each word when they are same it is saying it is equla   
		System.out.println(" using the .equals");
		System.out.println(st1.equals(st2));
		System.out.println(st1.equals(st3));
		System.out.println(st2.equals(st3));
		
		
		
		
		
		
		
		
	}

}
