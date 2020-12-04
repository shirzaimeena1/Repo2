package StringPractice;

public class MuteationPractice {

	public static void main(String[] args) {
		
// String is immutable.
// the idea of mutation mean the code is changable.
// the idea of mutation happen in memory we cant see it.
// since we change the objict we are refering to new objict the 
//		previouse objict will be removed.
// mutable: when we are changing the objict we are changing it in same place in memory.		
// immutable: we have to creat new objict and refe to new location.		
// Stringbuffer/ string builder: both generate string. it is differnt from string. it is mutable.
		
//		String st= "test";
//	 StringBuffer sb= new StringBuffer("test");
//		 
//	 for (int i= 0; i<10; i++) {
//		   st.replace('t', 'T');  // it is immutable that is y it did not change. 
		   //since it is a strinG we have to create a new objict and refer our string to new address  lik this
		   
//		  st= st.replace ('t', 'T');
//// in immutable string we have to assing the change to our variable like above.
//		 sb.replace(0, 1, "T");
//		 st+=i+1;
//		 sb.append(i+1);
//	 
//		 System.out.print("st " +st + "\t\t");
//		 System.out.println("sb "+sb);
		 
		 
		 String x= "mom";
		 
		StringBuilder y = new StringBuilder("Mom");
		
		for (int j=0; j<3; j++) {
		x=x.replace("m", "M");
			y.replace(0, 1, "T");
			x+=j+1;
			y.append(j+1);
			System.out.print("x "+x +"\t\t" );
			System.out.println("y "+y );
		}
				 
	 }	 		
		 
	 
		
		

	}


