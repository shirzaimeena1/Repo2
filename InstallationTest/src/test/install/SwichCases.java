package test.install;

public class SwichCases {

	public static void main(String[] args) {
		
	// Switch:  if several option are avilbel it is recommend to use Switch than Nested if. 
	// because it is much more readible 
		
//	int age = 16;
//	switch (age) 
//	{
//	case 16:
//		System.out.println("you are too young have some tea");	
//		break;
//	case 20:
//		System.out.println("you can have cofee");
//		break;
//		
//	}
	
	//empty switch statment is also valid java syntax case and default are optional but brakit {} is mandetory.
//		
		
		int x = 4;
		switch (x) 
		{
		case 1:
			System.out.println("Helow");
		case 2:
	          System.out.println("Hi");
	          
		case 3:		
		System.out.println("How are you");
		break;
		
		default:
			System.out.println("In valid number");
		
		}
//			
//		
		
	
 // by using switch we can define commone reaction for multiple case it is the advatage of true and false in switch statment.
//		int grade= 5;
//		switch (grade) {
//		
//		case 1:
//		case 2:
//		case 3:
//			System.out.println("you got A+ grade");
//			break;
//		case 4:
//		case 5:
//			System.out.println("you got A grade");
//			break;
//		}
//	int x= 0;
//	switch (x)
//	{
//	default:
//	System.out.println("default");
//	case 0:
//		System.out.println("0");
//	case 1:
//		System.out.println("1");	
//	break;
//	case 2:
//		System.out.println("2");
//		break;
//	}
//		
// print from 1-10 using switch 
		int number =1;
		switch(number) {
		
		case 1:
			System.out.println("1");
		case 2:
			System.out.println("2");
		case 3: 
			System.out.println("3");
			
			
		}
		for (int i=1; i<11; i++) {
			System.out.println(i);
		}
	}
}
