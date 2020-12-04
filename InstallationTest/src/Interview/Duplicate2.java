package Interview;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Duplicate2 {

	public static void main(String[] args) {
	//	33.Here is the arrayList, how can I remove all duplicates from it?
				List<String> al = new ArrayList<String>();
		al.add("Ajay");
		al.add("Becky");
		al.add("Chaitanya");
		al.add("Ajay");
		al.add("Rock");
		al.add("Becky");
		
	HashSet hs = new HashSet();
	
	for (int i=0; i<al.size(); i++) {
		hs.add(al.get(i));
	}System.out.println(hs);
		
		
		
		
		
//		HashSet hs=new HashSet();
//		for (int i=0; i<al.size(); i++) {
//		hs.add(al.get(i));
//		}System.out.println(hs);

	}

}
