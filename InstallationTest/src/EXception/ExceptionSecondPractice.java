package EXception;

public class ExceptionSecondPractice {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 0;
		
		int z []= {1,2,3,};
		try
		{
			System.out.println(x/z[4]);
		} catch(ArithmeticException a) {
			System.out.println(" there was aritmatic exception");
		} catch(ArrayIndexOutOfBoundsException a) {
		System.out.println(" second catch");
			
			
		} finally {
			System.out.println(" we are good to go");
		}
		
		System.out.println("end");
		


		
		
		
		
	}

}
