package Keywords; 

public class BreakContinuePractice{

	public static void main(String[] args) {
		for (int i = 0; i<10; i++) {
			if (i==4) {
				break;
			}else 
				System.out.println(i);
				
			}
		System.out.println(" --- using continue.");
		for (int i = 0; i<10; i++) {
			if (i==4) {
				continue;
			}else 
				System.out.println(i);
		}
	}

}
