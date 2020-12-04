package vandingMachine;

public class VM {
	// name
		private String name;
		// price
		private double price;
		// size
		private int size; // we can have two sizes(1 small) (2 large)
		// location
		private int[] location; // this array will have 2 indexes (0 = row, 1 = col)
		// quantity
		private int quantity;
	​
		// default constructor
		public Product() {
			this.name = "";
			this.price = 0.0;
			this.size = 0;
			this.location = new int[2];
			this.quantity = 0;
		}
	​
		// Parameterized constructor
		public Product(String name, double price, int size, int[] location, int quantity) {
			this.name = name;
			this.price = price;
			this.size = size;
			this.location = location;
			this.quantity = quantity;
		}
	​
		// getters
		public String getName() {
			return name;
		}
	​
		public double getPrice() {
			return price;
		}
	​
		public int getSize() {
			return size;
		}
	​
		public int[] getLocation() {
			return location;
		}
	​
		public int getQuantity() {
			return quantity;
		}
	​
		// setters
		public void setName(String name) {
			this.name = name;
		}
	​
		public void setPrice(double price) {
			this.price = price;
		}
	​
		public void setSize(int size) {
			this.size = size;
		}
	​
		// location
		public void setLocation(int[] location) {
			this.location = location;
		}
	​
		public void setLocation(int row, int col) {
			location[0] = row;
			location[1] = col;
		}
	​
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
	​

	








}
