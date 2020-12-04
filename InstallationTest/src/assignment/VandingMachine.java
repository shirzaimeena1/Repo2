package assignment;

import java.time.LocalDate;
import java.time.LocalTime;

public class VandingMachine {

	public static void main(String[] args) {

//		•	Create a char variable with name slectedCategory
//		•	Create an int variable with name slectedOption
//		•	If the option selected is valid, print out the receipt for that item (check below to get ideas for the format of the receipt)
//		•	If the item selection is not valid, print out the message that the item selection is not valid (You can format a good looking message)

		int selectedOption = 3;
		char selectedCategory = 'A';
		String ID = "#2345";
		LocalDate date = LocalDate.now();
		LocalTime time = LocalTime.now();
		String item1 = "Starburst";
		String x = "admin admin";

		if (selectedOption == 1 && selectedCategory=='A' ) {
       
			System.out.println("\tReceipt");
			System.out.println();
			System.out.println("ID:\t " + ID + "\nDate:\t " + date + "\nCashier: " + x + "\nTime:\t " + time
					+ "\nITEM\t" + item1 + "\nRival\t-24\nField\t$45.00\nMassenger");
		} else if (selectedOption == 2) {
			System.out.println("\tReceipt");
			System.out.println();
			System.out.println("ID:\t#B201456\nDate:\t " + date + "\nCashier: admin admin\nTime:\t " + time
					+ "\nITEM\tbabyRuth\nRival\t-24\nField\t$45.00\nMassenger");
		} else if (selectedOption == 3) {
			System.out.println("\tReceipt");
			System.out.println();
			System.out.println("ID:\t#B201456\nDate:\t " + date + "\nCashier: admin admin\nTime:\t " + time
					+ "\nITEM\tSwetart\nRival\t-24\nField\t$45.00\nMassenger");

		} else {
			System.out.println(" it is not a valid selection Please try again ");
		

	}
	}
}
