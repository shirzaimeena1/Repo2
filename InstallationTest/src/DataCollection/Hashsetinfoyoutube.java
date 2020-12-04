package DataCollection;

import java.util.HashSet;
import java.util.LinkedHashSet;
public class Hashsetinfoyoutube {


	public static void main(String[] args) {
		
		/* 
		 * Hashset: underlying data stracture for hashset is hashtable
		 * duplicate are not allowed. if we insert duplicate value we dont get
		 * runtime or compile time error we. the add method return will be fail 
		 * insertion oder will not be perserved. print will not be inorder.
		 * hetrogoneius objict are allowed. mean we can add both int, string and nul in hash.
		 * hash set is best choice if our frequent operatio is search operation.
		 * Hash set value is uniqe
		 * 
		 */
		
		HashSet <Object> A = new HashSet<Object>();
		A.add("A");
		A.add("A");
		A.add("c");
		A.add(10);
//		A.remove("b");  // this method remov the value
//		System.out.println(A);
//		System.out.println(A.size());// this return the size of hashset
//		System.out.println(A.contains("A"));// it return true if A was in our hashset
//		System.out.println(A.isEmpty());// it return true if hashset was empty
	System.out.println(A.add("A"));// THIS RETURN FALS BECASE DUPLICATE
		
		
		for (Object i: A) {
			System.out.println(i);
		}
		
		/*
		 * LikedHashSet: the only different between linkedhashse and hast is below
		 * underlying data for hashset is table while for linkedhashset is linklis.
		 * order is not perserved in hashset. order is perserved in linkedhash set.
		 
		 */
 // // when we use linkedhashset? wen  we have tasked to present
	//	a groupe of individual that order should be consider. we go for linkedhashset.
		
	System.out.println("________________linkedHashset");	
		LinkedHashSet <String> M = new LinkedHashSet<String>();
		M.add("A");
		M.add("b");
		M.add("c");
		
		
		System.out.println(M);
		
		
		
		// in the result we can see that it print in order.
		
		
		
		
		
		
		
	}

}
