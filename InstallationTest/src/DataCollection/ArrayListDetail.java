package DataCollection;
import java.util.ArrayList;
public class ArrayListDetail {

	public static void main(String[] args) {
		
		
		ArrayList<Integer>mylist=new ArrayList<Integer>(5);
		mylist.add(2);   // by calling this method we can add value to our array.
		mylist.add(3);
		mylist.add(4);
		mylist.add(555);
		for (Integer x: mylist)
			System.out.println(x);
      System.out.println("size: " + mylist.size());
     
      System.out.println("______________");
      mylist.remove(3); // this method remove the value of index that we are mentioning here.
      mylist.set(1, 222);  // this method used to change the value
      mylist.clear();  // this method clear all our array.
      mylist.add(2);
      for (Integer x: mylist)
			System.out.println(x);
   
    System.out.println("size: " + mylist.size());
   
System.out.println(  "---- generic arraylist");
   
//generic arraylist can hold any objic like string, interger anyother type
  
ArrayList<Object>myarray= new ArrayList<Object>();
myarray.add(12);// this is int
myarray.add("Meena"); // this is string type
myarray.add(2.3);  // double
System.out.println(myarray.get(0));
System.out.println(myarray.get(1));


      
for (int i=0; i<myarray.size(); i++);
System.out.println(myarray);

for (Object d: myarray) {
	System.out.print(d);
	
}
      
      
      
      
   /*
    *  by calling size method we can find out about the 
    size of array but this sizse dont reppreasent the inetial sizse which 
    we have decleatd in our syntax which is 5 in the above.
     this size method  represent the number of value that 
     we have in array list since in the above it is 3 that is why in result it shoudl 3.
	*/
	}

}
