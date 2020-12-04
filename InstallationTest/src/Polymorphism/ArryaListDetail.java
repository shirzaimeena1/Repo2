package Polymorphism;
 import java.util.ArrayList;
public class ArryaListDetail {

	public static void main(String[] args) {
		ArrayList<String> data= new ArrayList<String>();// stracture of arrylist
		
		// the way ArrayList Work
		data.add("Fist");   // index 0
		data.add("Second");
		data.add("thirth");
		
		System.out.println(data.get(0));  // 0 is the index number 
		
		
		// insted of using length we use size in array list and it return the size of arraylist of us
		for (int i= 0; i<data.size(); i++) {
			System.out.println(data.get(i));  // we have to use the get method to print otherwise it wont work it is the different between array and array list.
		}

		
		System.out.println( "using for eachloop");
		System.out.println();
		// using for each loop
		
		for (String i : data)
			System.out.println(i);
		
		
		// using ineger in array list
		/*<  > the idea of angel braket in arry list called generic. 
		 * in generic we can only have clases it can not accept the primitive datatype
		 * if we use premitive data type we shoudl use wrapper class of primitive data type
		
		*/
		ArrayList<Integer> x = new ArrayList<Integer>();
		
		x.add(1);
		x.add(2);
		x.add(3);
		x.add(4);
		x.add(5);
		
		System.out.println("using foreachLoop");
		for (Integer b:x) {
			System.out.println(b);
		}
			
		
		System.out.println("using for loop");
		
		
		for (int i = 0; i<x.size(); i++) {
			System.out.println(x.get(i));
			
		}
		
		}
	}
			



