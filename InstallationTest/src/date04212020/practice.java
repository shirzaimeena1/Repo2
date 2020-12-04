package date04212020;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number []={ -10, -5, -5, -15 };
		
		number [0] = -10;
		number [1] = -5;
		number [2] = -5;
		number [3] = -15;
	
		int max = number[0];
		int min = number[0];
		int sum = 0;
		int avg = 0;
		
		for (int x: number) {
			System.out.println(x);
			
			if (x>max) {
				max=x;
				
			}else if (x<min) {
				min=x;
			}
			sum +=x;
		}
 avg = sum/number.length;
 System.out.println(" sum of all num: " + sum);

 System.out.println("max" +max);
 System.out.println("min: " +min);
 System.out.println("avg:" +avg);
 
 
 
 
 // print A-Z
 
 
 char uppercase= 'A';
 char lowercase = 'a';
 
 for(char i= 0; i<=26;i++) {
	 System.out.println(uppercase +"   " + lowercase);
	 uppercase++;
	 lowercase++;
 }
 
 
 for (int i = 0; i<=10;i++) {
	 System.out.println(" i love afg " + i);
 }
 
 for(int i =0; i<=30; i++) {
	 
	 if (i%3==0 && i%5==0) {
		 System.out.println("fizbuzz");
	 }else if (i%3==0) {
		 System.out.println("fizz");
	 }else if(i%5==0) {
		 System.out.println("buzz");
		 } else {
			 System.out.println(i);
		 }
		 }
 


 }
	}


