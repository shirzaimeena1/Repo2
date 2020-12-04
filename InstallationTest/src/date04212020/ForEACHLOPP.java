package date04212020;

public class ForEACHLOPP {

	public static void main(String[] args) {

   int number []={ -10, -5, -5, -15 };
//
//		int max = number[0];
//		int min = number[0];
//		int sum = 0;
//		int average = 0;
//		for (int i = 0; i < number.length; i++) {
//			if (number[i] > max)
//				max = number[i];
//			else if (number[i] < min) {
//				min = number[i];
//			}
//			sum = sum + number[i];
//		}
//
//		average = sum / number.length;
//		System.out.println("sum of number: " + sum);
//		System.out.println(" max of number: " + max);
//		System.out.println("min of number: " + min);
//		System.out.println(" average of number" + average);

		// ystem.out.println("-------- using for each loop------------------");
		// different between for and for each loop:
		// in for loop i is the index number. in for each loop i is actual value.
		// there is not alot of coding also we dont need creat condtion increase or
		// decress the value.for

		int max = number [0];
		int min = number [0];
		int sum = 0;
		int avg = 0;
		
		for (int i =0; i< number.length; i++) {
			if (number[i]>max)
				max= number [i];
			else if (number[i]<min) {
				min = number[i];
		}
		sum +=number[i];
	}
		avg = sum/number.length;
		
		System.out.println("max: " + max);
		System.out.println("min: " + min);
		System.out.println("sum: " +sum);
		System.out.println(" avg: " +avg);
		
		
		for (int n: number){
		System.out.println(n);
		}
	}
}
