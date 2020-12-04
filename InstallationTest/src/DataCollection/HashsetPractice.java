package DataCollection;

import java.awt.RenderingHints.Key;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashsetPractice {

	public static void main(String[] args) {
	//	how can i find a duplicate in array?

	String data [] = { "job", "work", "job", "student", "job", "work"};
		
		// find duplicate
		
	outer:	for (int i= 0; i<data.length; i++) {
	inner:		for (int j= i+1; j<data.length; j++) {
			
				if (data[i].equals(data[j])) {
					
					System.out.println(" there is a duplicate");
					System.out.println("value " + data[i]);
					System.out.println("index " + i + "  " + j);
					break outer;
				}
	}

	}
	
	  System.out.println("***** using hashset to find duplicat ***");
	  
	  Set<String> temp = new HashSet<String>();
		
		
		int count = 0;
		for (String i : data) {
			if (!temp.add(i)) {
				count++;
				if (count > 1) {
					System.out.println("the second duplicate found using set = " + i);
					break;
				}
			}
		}
		if (count < 2) {
			System.out.println("there is 0 - 1 duplicated in the data set");
		}
		

	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  Map<Integer, String>H= new HashMap<Integer, String>();
	  H.put(1, " i like Loop topic");
	  H.put(2, " i like if statment topic");
	  H.put(3, " i like java basic topic");
	  H.put(4, " i dont like dataStracture");
	  H.put(5, " i dont like Exception concept");
	  
	 
	  System.out.println(H);
	  
	  
	  
	}
	}
