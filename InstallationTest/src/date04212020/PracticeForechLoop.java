package date04212020;

public class PracticeForechLoop {

	public static void main(String[] args) {
		// find the min and max and the averag
		// useforeachloop

		int[][] num = { { 12, 12, 23, 5 }, { 1, 12, 34, 2 } };

//		int max = num[0][0];
//		int min = num[0][0];
//		int sum = 0;
//		int average = 0;
//
//		for (int i = 0; i < num.length; i++) {
//			for (int j = 0; j < num[i].length; j++) {
//				if (num[i][j] > max) {
//					max = num[i][j];
//				} else if (num[i][j] < min) {
//					min = num[i][j];
//
//				}
//				sum = sum + num[i][j];
//				average = sum / num.length;
//			}
//		}
//		System.out.println(" max: " + max);
//		System.out.println("min: " + min);
//		System.out.println(" sum: " + sum);
//		System.out.println("avrage: " + average);
		System.out.println("-----using each forLoop________");
		int min = num[0][0];
		int max = num[0][0];
		int sum = 0;
		int count = 0;
		int avg = 0;

		for (int outer[] : num) {
			for (int inner : outer) {
				System.out.print(inner + "  ");

				System.out.println();
				if (inner > max) 
					max = inner;
				 else if (inner < min) {
					min = inner;
				}
				sum += inner;
			}

			count += outer.length;

		}
		avg = sum / count;
		
		System.out.println("max:  "+ max);
		System.out.println(" min:  " + min);
		System.out.println( " sum:  "+sum);
		System.out.println(" count  "+count);
		System.out.println( " avg:  " +avg);

//  for (int outer[]: num) {
//	  for (int value: outer) {	
//		  System.out.print(value + "  ");
//	 if (value<min) {
//		 min=value;
//	 } else if (value>max) {
//		max=value;	 
//		 }
//	  sum +=value;
//	  
//  }
//   count+= outer.length;
//   System.out.println();
//	}
//  avg = sum/count;
//  
//  System.out.println("min:  " + min);
//  System.out.println("max:  " + max);
//  System.out.println("sum:  " + sum);
//  System.out.println("avg:  " + avg);
//  System.out.println("count "  + count);
//  
	}
}
