package arry; 
public class 
 {

	public static void main(String[] args) {
		// int i =10; we can not creat same int i =20; it give us error so if want to to that we should just change the value of i from 10 to 20 so it is a big problem
		// when even we  store more than one value we use array.
		// array is the basic form of data collection. data collection mean you are storing a collection of data in once peace of coe
		// array: we are storing a collection of data in peace of code.
		//arry can store only one type of data it can be in or String or any other data type 
		// the length of array is established when array is created.
		// advantage of array: it is used to represent a collection of item of same data type by using only once sigle name.
	
		
		/* dis advantage of array
		 *  static array is fix size to over come this we use dynamic array
		 *  array store only similar dataype for example if we creat array of int we cant store any strin on it. what if we creat a list of employe which contain int, double for salary, char 
		 *  to overcome this challange we creat object array. object is the parrent of all class in java
		 * Object obj []= new Object [4];
		 * obj [0] = " Tom";
		 * obj [1]= 20
		 * obj[2]= 20.2
		 * 
		 */
		
		int number [];
//		
//		// intializaton an array  
	number = new int [2];  // this mean this array has 5 index is 
//		// the size of the arry start from 1 but the index is start from 0 
//		// the good think about array is that we can leave empty the indexe
		number = new int [2];
		number[0]=10;
		number[1]=20;
//		number[2]=30;
//		number[3]=40;
//		number[4]=50;
		
		
		// we should print each of them seperatly to see the result.
		
		System.out.println(0);
		System.out.println(2);
//		System.out.println(3);
//		System.out.println(4);
//		System.out.println(5);
//		
//		int indexNumber=0;
//	System.out.println(number[indexNumber++]);//0
//	System.out.println(number[indexNumber++]);//1
//	System.out.println(number[indexNumber++]);//2
//	System.out.println(number[indexNumber++]);//3
//	System.out.println(number[indexNumber]);//4
//	
//	System.out.println(indexNumber);
	
	// we use loop to process array effecintly. if there is 100 line of code we cant do it manually 
	
//	System.out.println(" printing array using loop-------------------------");
//	int sum =0;  // we should have this out of our loop
//	for (int i=0; i<number.length; i++) {
//		System.out.println(number[i]);
//    sum = sum+number[i];  // this one should be inside the loop
//	 
//	}	
//	System.out. println(" sum of all number " + sum);
//	// we can find the size of array by suing length; length give u the size of array. number in below example is name of our array. 
//	System.out.println(" the size of array by using leght  " + number.length );
//
//	
//	// another kind of intialization of array;
//	int [] set= { 10, 20,30};
//	 System.out.println(" size of the array= " + set.length);
//     for ( int i=0; i<set.length; i++) {
//    	 System.out.println((i+1) + ".  " +set[i]);
//    	 
//    	
//     }
//	
//     for (int i: set) {
//    	 System.out.println(i);
//     }
		
		System.out.println(" using for each loop");
		int max= number[0];  // intializing the max to the starting value in array
		int min= number[0];  // 
	    int sum=0;
	    int avg= 0;
		
		for (int m: number) {
			System.out.println(m);
			if (m>max) {
				max=m;
			}else if (m<min) {  //  wen we scan and find the smalles one  we reassing it to varible  
				min=m;  
			}
		sum+=m;
		}
		
		avg= sum/number.length;
		System.out.println("max:  "+max);
		System.out.println("min: "+min);
		System.out.println("sum" +sum);
		System.out.println(" avg" + avg);
	}

	}
    	 
	
 

