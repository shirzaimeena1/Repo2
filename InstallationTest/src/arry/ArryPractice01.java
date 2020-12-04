package arry;

public class ArryPractice01 {

	public static void main(String[] args) {
	
		//creat a single dimention array of int. have the value of 10 15 20
		// run a loop print all.
		// if you like challange try to get teh average of the number in the arra

		
		
		                                                                                      rtdff                    vvv
		int num [] = new int [3];
		
		num[0]= 10;
		num[1]=15;
		num[2]=20;
		
	
		//System.out.println(num [3]); ArrayIndexOutOfBoundsException
		int sum= 0;
		int avg=0;
		int max= num[0];
		int min = num[0];
		
		for (int m : num) {
			System.out.println(m);
		if (m>max) {
			max=m;
		}else if (m<min)
		
			min=m;
		sum= sum+m;
		}
		avg = sum/num.length;
		System.out.println(" sum of all num " + sum);
		System.out.println(" min of all " + min);
		System.out.println(" max of all " + max);
		System.out.println(" avg of all num " + avg);
		
	
		for (int i = 0; i<num.length; i++) {
			System.out.println(num[i]);
			sum = sum+num[i];
		if (num[i]>max)
			max= num[i];
		else if(num[i]<min)
			min=num[i];		
			
		
		
		
		
		}	
		avg = sum/ num.length; 
		System.out.println(" max of all num " + max);
		System.out.println(" min of all num " + min);
		System.out.println(" avg of " + avg);
		System.out.println(" sum " + sum );
	}
}