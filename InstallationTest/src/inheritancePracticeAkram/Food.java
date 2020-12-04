package inheritancePracticeAkram;

public class Food {

	private String name;
	private int price;
	
	
	public Food() {
		this.name="";
	    this.price =0;
	}
	
	public Food (String name, int price) {
		this.name= name;
		this.price= price;
		System.out.println("name and price of food: "+ "  " + name + "price is:" + price ) ;
	}
 
  public String getname() {
	  return name;
	 
  }
  
  public int getprice () {
	  return price;
  }
  public void satename (String name) {
	  this.name= name;
	  System.out.println("i want this: "+ name  ) ;
  }
  public void sateprice (int price) {
	  this.price = 0;
	  System.out.println(" the price is: " + price ) ;
  }
 }
