\kage arry;\

public class Array2dimention {

	public static void main(String[] args) {
		
	// multiple of one dimention is called two dimention. in two dimention we have row and colum.
		// if we want to stor a vlue like table we use two dimention array.
	// there should be two loop for two dimention.
	// if we want to use excel 
	// in the second loop we should mention the value of the first
		//name with the name of array before length.
	int number2x2[][] = new int[2][2]; // because it to index we write 
	//2x2 at the right side it number of row and colum.

		number2x2[0][0] = 1;
		number2x2[0][1] = 2;
		number2x2[1][0] = 3;
		number2x2[1][1] = 4;
System.out.println(" size of array" +number2x2.length);
		System.out.println(number2x2[0].length);// it give us the total number of cloum
		System.out.println(number2x2[0][1]);
		
		System.out.println(number2x2[0][0] + "  " + number2x2[0][1]);
		System.out.println(number2x2[1][0] +"   "+number2x2[1][1] );
		
		System.out.println();
		System.out.println(" The Length of array = " + number2x2.length);
		System.out.println(" using loop to do two dimention array__________________");

        for (int i=0; i<number2x2.length; i++) {
        for (int m=0; m<number2x2[i].length; m++) {  // we have to right the value of [i] in the second line other wise it wont work if the number of col and row is not equal.
        	System.out.println(number2x2[i][m] + "  ");
        }
        System.out.println();
        }
        	
		int number [][]= new int[2][3];// the reason we take it 2x3 because there was 2 row and 3 colum
		
		number [0][0]= 10;
		number [0][1]= 20;
		number [0][2]= 30;
		number [1][0]= 40;
		number [1][1]= 50;
		number [1][2]= 60;
		
		System.out.println(number [0][0] + "  " +number [0][1]);
		System.out.println(number [0][2] + "  " +number [1][0]);
		System.out.println(number [1][1] + "  " +number [1][2]);

		
		System.out.println(" using loop to do three dimention _______________");

		for (int row=0; row<number.length; row++) {
		for ( int col=0; col<number [row].length; col++) {// in the second loop we should mention the value of the first name with the name of array before length.
			System.out.print(number[row][col] + "   ");
	    
		}
		System.out.println();
		}
  System.out.println("---using for each loop-------");
  int max= number[0][0];
  int min= number[0][0];
  int sum= 0;
  int avg= 0;
  int count = 0;
 for (int i[]:number) {  // it scan each row 
	 for (int j:i) {  //  j  scan the numbers that is inside i and  print each elemint 
		 System.out.print(j +"   ");
		if (j>max) {
			max=j;
		}else if (j<min) {
			min=j;
	 }	
		sum+=j;
		count+=i.length; 
 }
	avg= sum/count;
System.out.println();
		System.out.println("max:  "+max); 
		System.out.println("min: " +min);
		System.out.println("sum: "+sum);
		System.out.println("count: "+count);
		System.out.println(" average: "+avg);
	 
	 System.out.println();
 
 }
	}

}
