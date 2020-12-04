package Interview;

public class MinandMax {

	public static void main(String[] args) {


		int data [] = new int [2];
		data[0]= 1;
		data[1]=2;
		
		int max = data [0];
		int min= data [0];
		int sum = 0;
		int avg = 0;
		
		for (int i: data) {
			System.out.println(i);
		 if (i>max) {
			max=i;
		}else if (i<min) {
			min = i;
		}
		sum+=i;
		}
		
		avg = sum/data.length;
//		int max = data[0];
//		int min = data[0];
//		int sum = 0;
//		int avg = 0;
//		
//		
//		for (int i: data) {
//			System.out.println(i);
//			 if (i>max) {
//				 max=i;
//			 }else if (i<min) {
//				 min= i;
//				 
//			 }
//			 sum+=i;
//		}
//avg = sum/data.length;
//
//System.out.println(" sum" + sum);
//System.out.println(" min:" +min);
//System.out.println("max:" + max);
//System.out.println("avg: " +avg);
	}

}
