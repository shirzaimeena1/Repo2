package arry;

public class PracticesHomeArray {

	public static void main(String[] args) {
		
		
//		int number []= new int [2];
//		number[0] = 10;
//		number[1]=20;
//		
//		int sum=0;
//		for (int i=0; i<number.length; i++) {
//			System.out.println(number[i]);
//		sum = sum+number[i];
//		}
//		System.out.println("sum of all number=    "+ sum);
//		System.out.println(" lenght of array =   " + number.length);
//		double average = sum/number.length;
//		System.out.println("The average of the number is= "+ average); 
//		
		 int m[][]= new int [2][2];
		 
		 m[0][0]=10;
		 m[0][1]=20;
		 m[1][0]=30;
		 
//		 System.out.println( m[0][0] + " " +m[0][1]);
		  int sum=0;
		 for (int i=0; i<m.length; i++) {
		 for (int z=0; z<m[i].length; z++) {
			 
			 System.out.print(m[i][z] + "  ");
			sum= sum+m[i][z];
		 }  
		 System.out.println();
		 
		 
		 }
		 
		 
		 System.out.println( "sum of all numner= "+ sum);
	
		 
		
	}
	
				 
	
	

}
