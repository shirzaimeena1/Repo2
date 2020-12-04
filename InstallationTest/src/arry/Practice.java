package arry;

public class Practice {

	public static void main(String[] args) {
		
		
		//creat a single dimention array of int. have the value of 10 15
				// run a loop print all.
				// if you like challange try to get teh average of the number in the array

		int number[]= new int [2];
		
		number [0]= 10;
		number[1]= 20;
		
	//System.out.println(number[0]);
	
//		for (int i:number)
//			System.out.println(i);
//		System.out.println(number.length);
//		int sum= 0;
//		int min= number[0];
//		int max= number[0];
//		for (int i = 0; i<number.length; i++) {
//			System.out.println(number[i]);
//		sum = sum +number[i];
//		if (number [i]>max) {
//			max=0;
//		} else if(number [i]<min) {
//			min=0;
//		}
//		}
//	System.out.println("max of num" + max);
//		System.out.println("min of num "+ min);	
//	System.out.println(" sum of all number " +sum);
	
	int sum= 0;
	int min= number[0];
	int max= number[0];
	int avg = 0;
	int count =0;
	for (int num: number) {
    if (num>max) {
    	max=0;
    } else if(num<min) {
    	min=0;
    } 
	sum = sum+num;
	}
	avg = sum/number.length;
	
	
	System.out.println(" max " + max);
	System.out.println(" min " +min);
	System.out.println(" sum " +sum);
	System.out.println("avg " +avg);
}
	
}