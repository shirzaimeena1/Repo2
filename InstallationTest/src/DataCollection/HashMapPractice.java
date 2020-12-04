package DataCollection;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapPractice {

	public static void main(String[] args) {
 // Map is interface and it implemented by HashMap.
// hashMap is a class which implement MaP INTERFACE.
// we have store data in HashMap based on key and values.
// different betwee hasMap and arryalist Map store data based on key and values
// but list store data based on index number
	//Map<Key, value>	 M= new HashMap<Key, value>();
		
/* HashMap can accept duplicate value but dont accept duplicate key.
 * HashMap store data base on key and value
 * HashMap can have one Nul Key but multiple nul value
 * HashMap maintain no order
 * 
 * 
 * 
 */
		Map<Integer, String> data = new HashMap<Integer, String>();
		
		data.put(1, "Jack");
		data.put(2, "Ben");
		data.put(3, "Marsana");
		data.put(4, "Marsana");  // value is dupilcate but it accept and print.
		data.put(4, "Meena"); // it wont print this becaseu key is duplicate.
		
		System.out.println(data);
//		System.out.println(data.get(2));  // if we want to print the value we shuould just get the key vale then it print the value 
//		// the above sysout pring Jack for us.
//		
//		System.out.println(data.keySet());
//		System.out.println(data.values());
//		System.out.println(data.size());
//		System.out.println(data.get(5));// this will returl Null becaseu key 4 is not exist.
//		
//		System.out.println(data);
//		
//		// how to iterate HashMap? by using entrySet
//	System.out.println("----using for loop---------");	
//		for (Entry m : data.entrySet()) { //it store all the value which is avilbel in HashMap
//			System.out.println(m.getKey());
//			
//		}
//		
//		data.remove(3);
//		System.out.println(data);
//		
//		
//		Map<String, ArrayList<String>> hm = new HashMap<String, ArrayList<String>>();
//		
//		ArrayList<String> m2020 = new ArrayList<String>();
//		m2020.add("Jack");
//		m2020.add("Ben");
//		m2020.add("Kevin");
//		
//		
//		hm.put("Feb2020", new ArrayList<String>());
//		hm.put("May2020", m2020);
//		
//		hm.get("Feb2020").add("first Student");
//		hm.get("Feb2020").add("second Student");
//		
//		System.out.println(hm);
//		
//		System.out.println(hm.get("Feb2020"));
//		System.out.println(hm.get("May2020"));
//		
//		for (String i : hm.get("May2020")) {
//			System.out.println(i);
//		}
//		
//		System.out.println("************************");
//		for (String outter: hm.keySet()) {
//			
//			for (String inner : hm.get(outter)) {
//				System.out.println(inner);
//			}
//		
//	}
//		
		
	}

}
