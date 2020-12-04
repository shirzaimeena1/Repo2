package ClassObjict;

public class PracticeClass {
/*
 *   this is called class or Global Variable. these varible 
 *   is belong to the calss when we creat objict of this class then a copy 
 *   of these varible will be give to each objic 
 *  
 *  
 *
 */
	
	int model;
	int wheel;

	public static void main(String[] args) {
	
		// we are creating the objict of the above class
		// a is the refrense data type 
		//new PracticeClass(); this part is the objict of claas
		PracticeClass a = new PracticeClass(); 
		PracticeClass b = new PracticeClass();
		
		a.model=2004;
		a.wheel=4;
		
		b.model=2005;
		b.wheel=4;
		
		System.out.println(a.model);
		System.out.println(a.wheel);
		System.out.println(b.model);
		System.out.println(b.wheel);

	}

}
