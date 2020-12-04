package Keywords;

public class BreakContinue {

	public static void main(String[] args) {
//	// break: we use this keyword  to end the loop. 
//		for (int i=0; i<10; i++) {
//			if(i==5) {  // when it reach to 5 since we used break it will get out of loop.
//		break;
//			}else {
//				System.out.println(i);
//		
//			}
//			}
//		System.out.println(" this is after the loop ended");
//	// continue	: we use this keyword  escape the iteration of the loop 
//		
//		for (int i=0; i<10; i++) {
//			if(i==5) {  // when it reach to 5 since we used continue it escape from 5 then continue loop.
//		continue;
//			}else {
//				System.out.println(i);
//		
//			}
//			}
//	
		// i have an array of strings {"test", "automation", "job", "test",
				// "automation2", "job2", "test2"}
				// is there a duplicate

				String data[] = { "job", "automation", "test", "job", "test2" };

				// create a for loop and go through the length of the array
				// if the current iteration value is equal to i then break

				 outter : for (int i = 0; i < data.length; i++) {
					inner : for (int j = i + 1; j < data.length; j++) {

//						 System.out.println(" array of outter loop\t\t" + i);
//						 System.out.println("array of inner loop\t\t" + j);
						if (data[i].equals(data[j])) {
							// there is a duplicate
							System.out.println("there is a duplicate in the array");
							//.out.println("value of j =" + data[j]);
							System.out.println("value of i = " + data[i]);
							//System.out.println("index j = " + j);
							//System.out.println("index i = " + i);
							System.out.println("indexs = " + i + "  " + j);
							break outter;  // by mentioning outer after break it mean that once it find the first duplicat the loop should stop and dont find any other duplicate.
						}
                          
					}
				}

//				int count = 0;
//				outter: for (String outter : data) {
//					for (String inner : data) {
//						if (outter.equals(inner)) {
//							count++;
//							if (count > 1) {
//								System.out.println(inner + " value of the array is duplicate");
//								break outter;
//							}
//						}
//
//					}
//					count = 0;
//				}

 
 
	}
}



