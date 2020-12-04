package DataCollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map.Entry;

public class PracticeDataCollection {

	public static void main(String[] args) {
	
		ArrayList <String> M = new ArrayList <String>();
		M.add("Meena");
		M.add("Meena");
		M.add("MARSANA");
		M.remove(2);
		//M.clear();
		M.set(1, "Akram");
		System.out.println(M);
		
		System.out.println(M);
		
		for (String t:M) {
			System.out.println(t);
		}

		
	LinkedList <Integer> A	= new LinkedList<Integer>();
	A.add(1);
	A.add(2);
	A.add(3);
	System.out.println(A);
	System.out.println("size of list" +"   "+   A.size());
	
	for (int i: A) {
		System.out.println(i);
		
	}
	
	HashSet <String> AK = new HashSet<String>();
	AK.add("CAR");
	AK.add("TRAIN");
	
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	map.put(1, "Java");
	map.put(2, "Selenium");
	
	System.out.println(map.get(1));
	System.out.println(map.keySet());
	System.out.println(map.values());
	
	for (Entry n: map. entrySet()) {
		System.out.println(n.getKey());
		
		
	}
	}

}
