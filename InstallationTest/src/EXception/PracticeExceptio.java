package EXception;

public class PracticeExceptio {

	public static void main(String[] args) {
		int x[]= null;
		try {
		
		System.out.println(x[4]);
		} catch (ArrayIndexOutOfBoundsException e) {  // since it is not arryout of boudl
			System.out.println(" array out of bound exception");
		} catch (Exception a) {
			System.out.println(" null pointer exception");
		}finally{
			System.out.println(" everyting is good to go");
		}
	}

}
