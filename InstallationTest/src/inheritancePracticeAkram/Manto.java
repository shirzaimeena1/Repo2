package inheritancePracticeAkram;

public class Manto extends Food {
	
	String SelectOption;
	public Manto() {
		super();
		System.out.println(" Manto Method");
	}
	
	public Manto ( String SelectOption, String name, int price) {
		super(name, price);
		this.SelectOption = SelectOption;
		
		System.out.println(" i love Manto: " + name + price);
		
	}
	
	public void SelectOption (String SelectOption) {
		this.SelectOption = SelectOption;
		System.out.println(" i want to order this food: " + SelectOption);
	}

	public String SelectOption () {
		return SelectOption;
	}
		
	 public String getname() {
		  return " i hate this food:"+ super.getname();
		
		 
	  }	
		
		
		
}
