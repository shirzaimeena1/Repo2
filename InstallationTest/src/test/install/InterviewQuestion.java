package test.install;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class InterviewQuestion {

	public static void main(String[] args) {
		
		Set <String > t = new HashSet<String>();
		t.add("a");
		t.add("B");
		// in order to go through set we use for loop
		
		for (String string : t) {
			System.out.println(string );
		}
// or we can use iterator to go throug it
		
		Iterator <String>it = t.iterator();
		System.out.println(it.next());  // this one just go in the first index
		
		// if we want to pring all of them using iterator we shoudl go the following 
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
