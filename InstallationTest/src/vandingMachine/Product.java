package vandingMachine;

public class Product {
	//name
		private String name;
		// price
		private double price;
		// size
		private int size;
		//location
		private int [] location; // this array will have two indexes (0= row, i=col)
		// quantity
		private int quantity;
		
		
		
		//this.name= "" ;// It mean go to the class find this variable and assinge the name for it.
		
	// constractour method;
	 public Product () {
		 this.name = "";
		 this.price = 0.0;
		 this.size = 0;
		 this.location= new int[2];
		 this.quantity= 0;
	 }
	 
		// Parameterized constructor
		public Product(String name, double price, int size, int[] location, int quantity) {
			this.name = name;
			this.price = price;
			this.size = size;
			this.location = location;
			this.quantity = quantity;
		}
	
		// getters
		public String getname() {
		return name;
		}
		public double getprice() {
			return price;
			}
			
		public int getsize() {
			return size;
			}
			
		public int []getlocation() {
			return location ;
			}
		
		public int getquantity() {
			return quantity;
			}
		
		public void setname(String name) {
			this.name = name;
		}
		
		public void setprice(double price) {
			this.price = price;
		}
		
		public void setsize(int size) {
			this.size = size;
		}
		
		public void setlocation(int [] location) {
			this.location = location;
		}
		public void setlocation(int row, int col) {
			// i want to check if the numbers are in range
			 location [0]= row;
			 location [1]= col;
		}
		
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
// THIS METHOD VALIDATE THE LOCATION ENTRY AND RETURNS A BOOLEAN IF ITS IN RANGE
		
	public boolean validateLocationEntry(int row, int col)	{
		boolean validation = false;
	// row 0-6
// col 0-4
	 if (row >=0 && row<=6) {
		 if (col>=0 && col<=4) {
			 validation = true;
		 } else {
			 System.out.println("colum is not in range" );
		 }
		 
	 }else {
		// row is out or range
		System.out.println("Row is not in range!");
		
	}
	return validation; 	
}
}

















