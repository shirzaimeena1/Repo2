package EXception;

public class PracticeException {

	public static void main(String[] args) {
		
		int x= 10;
		int y [] = { 2,4,4};
		//System.out.println(x/y);  // here the system crash and wont print our las sysout.
		
		try {
			System.out.println(x/y[12]);
		} catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println(" first catch");
			
			try {
				System.out.println(" second catch");
			} catch(Exception r) {
				 System.out.println(" there is problem with fist catch");
			}
		
		}finally {
			System.out.println(" we are done with excption ");
		} 
		
		
		
		
		System.out.println("end");
		
	}

}
