package DataCollection;

import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
	
		/*
		 *  Linked list is a special data collection WHICH STORE DATA BASE ON TWO THINK ONE IS ACTUAL DATA 
		 *  //AND ANOTHER IS the refrense of another data
		 *   which implement the list interface and Q, 
		 *  it is a liner data stracture where each element is an objict we call each element nud.
		 *  it store data based on two things ( actual data and refrence number of nex nud)
		 *  nud devided in to two parts ( data and  refrence number)
		 *  there is two thing in linkedlist one is head which is not a nud it
		 *  is the start point of linked list which point to first data in the nud.
		 *  the second one is Nul where out last refrene in nud refer to Null value cus
		 *  // there is not any data that it refer for it.
		 *   SINGLY LinkedList: mean that each element store the refrence on next element.
		 * in term of adding and removing data liknedlist is faster but in term of getting 
		 *data it is slow while in term of adding and removing
		 * array list is slowere.
		 * 
		 * 
		 * 
		 * 
		 */
		
		LinkedList<String>ll= new LinkedList<String>();
		ll.add("test");
		ll.add("meena");
		ll.add("Marsana");
		
		System.out.println("content of linkedlist:" + ll);
		
		// addfirst
		ll.addFirst("Akram"); // by this method we can add at the first of linkedlist.
		// addlast:
		ll.addLast("Mother");// we can add last element.
		System.out.println("content of linkedlist:" + ll);
		//  add get: we can get method 
		System.out.println(ll.get(0));
		// set method
		ll.set(0, "mother");
		System.out.println(ll.get(0));
		// remove first and last:
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("content of linkedlist:" + ll);
		
		// if we want to remove any value we have to mention its index number
		
		ll.remove(2);
		System.out.println("content of linkedlist:" + ll);
		//ll.size();
		System.out.println("sizse of linkedList" +"  " +    ll.size());
		
		
		// There is different way to print linked List
		// how to print all content of linkedlist
		// for loop
		// advance for lool;
		// iteration
		// while loop
		
  for ( int i= 0; i<ll.size(); i++);{
 System.out.println(ll);
  }
 System.out.println(" using for each loop");
 
 for (String n: ll)
	 System.out.println(n);
 
System.out.println(" using while loop to print linkedlist");

int y = 0;
while(ll.size()>y) {
	System.out.println(ll.get(y));
	y++;
}

	}

}
