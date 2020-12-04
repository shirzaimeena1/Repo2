package Interview;

public class Aplacharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// print from a- z, Z-A
		
		char uppercase= 'A';
		char lowercase= 'a';
		
		for (char i = 0; i<=26; i++) {
			System.out.println(uppercase + "  " + lowercase);
			uppercase++;
			lowercase++;
		}
	}

}
