package date04212020;

import java.util.ArrayList;

public class PracticeForEachLoop {

	public static void main(String[] args) {
		
		int data[]= {1,2,3};
		
		for (int i: data) {
			System.out.println(i);
		}
		
		ArrayList<String>number= new ArrayList<String>();
		number.add("Meena");
		number.add("Marsana");
		number.add("Akram");
		
		for (String x:number)
			System.out.println(x);
		
		
		System.out.println(" using for loop");
		for (int i= 0; i<number.size(); i++) {
			System.out.println(number.get(i));
		}
	}

}
