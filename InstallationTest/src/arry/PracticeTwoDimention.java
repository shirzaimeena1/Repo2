package arry;

public class PracticeTwoDimention {

	public static void main(String[] args) {
	// Practice  two dimention array
		
		// 10  20  30
		// 40  50   60
		
		
		int x[][]= new int [2][2];
		
		x[0][0]= 1;
		x[0][1]= 2;
		x[1][0]= 3;
		x[1][1]= 4;
		
		System.out.println(x.length);
		System.out.println(x[0]. length);  // this is for colum
	int sum= 0;	
	int max= x[0][0];
	int min = x[0][0];
	int count =0;
	int avg=0;
	for (int m[]: x) {
	 for (int j:m) {
		System.out.println(j);
 if (j>max) {
	 max=j;
 }else if (j<min)
		 min=j;
	sum+=j;
	 }	
	count+=m.length;
	}
	avg= sum/count;
	System.out.println(" sum of all num " + sum);
	System.out.println(" max of all num " + max);
	System.out.println("min of all num " + min);
	
	}
	

}
