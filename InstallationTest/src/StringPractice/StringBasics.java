package StringPractice;

public class StringBasics {

	public static void main(String[] args) {
		
       String st1 = "elephante";
       String st2=  new String ("test");
       String st3 = " TekSchool of AmeriCa how are you";
       System.out.println(st1.substring(1,2));
       System.out.println(st3.indexOf('A'));
       System.out.println(st3.substring(14,19));
       // lenght (): this method return the size of  string/ number of characters.
      System.out.println(st1.length());
      // charAt: this method return a character at the  speficied index
      System.out.println(st1.charAt(3));
      //indexof " it return the index number of first occurence of the character.
      System.out.println(st1.indexOf('e'));
      System.out.println(st1.indexOf('e', 3)); // the 3 mean here that i count from index 3.
      System.out.println(st1.indexOf("ant"));
      // substring:will return a specified section of the string.
      System.out.println(st1.substring(3));// this one print after the mentioned index to the end.
      System.out.println(st1.substring(1,2));
      
      // i want you to return "ant" from String St1 without any har coded value
      // except " ant"
      System.out.println(st1.substring(5,8));
 System.out.println(st1.substring(st1.indexOf("ant"),st1.indexOf("ant") + "ant".length()));
     
 // tolowercase and touppercase change the capatilization of character.
      
      System.out.println(st1.toLowerCase());
      System.out.println(st1.toUpperCase());
      
 //equal comparing two string while considering the case of character.
      System.out.println(st1.equals(st2));
 // equalsignorecase: comparing two string without considering case of character.    
      System.out.println(st1.equalsIgnoreCase(st2));
      
 //startwith: will check to see if the string start with the specified string.    
      
     System.out.println(st1.startsWith("e"));
     System.out.println(st1.endsWith("e"));
     
     // it check that whether the string contain the specified character.
     System.out.println(st1.contains("p"));
    //
     // this method replace the char of string which is specified 
     System.out.println(st1.replace('e', 'a'));
     System.out.println(st1.replace("pha", "new"));
    // MEHTOD CHAININNG: in here we are chaining the method one after another the result of one method will be added to anouther method.
     System.out.println(st1.substring(st1.indexOf("ant"),st1.indexOf("ant") + "ant".length()).toUpperCase());
     // terim remove the space between and after string.
     
     
     System.out.println(st1.trim());
	}

}
