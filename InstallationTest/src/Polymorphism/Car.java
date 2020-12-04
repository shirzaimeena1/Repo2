package Polymorphism;

public class Car {
	
	private String name;
	private String modul;
	private int year;
	private int numberOfdoors;
	
	//  two constractor method can be an example of compile time molyphormis and method oveloading  same as getter and setter.
	
	public Car() {
		name="";
		modul= "";
		year= 0;
		numberOfdoors= 0;
	}
		public Car (String name, String modul, int  year, int numberOfdoors) {
			
			this.name= name;
			this.modul = modul;
			this.year= year;
			this.numberOfdoors= numberOfdoors;
			
		}
		
		public String getname() {
			return name;
		}
		public String getmodul () {
			return modul;
				
		}
	
    public int getyear() {
    	return year;
    }
    
    public int getnumberOfdoors() {
    	return numberOfdoors;
    }
    
    public void setname( String name) {
    	this.name = name;
    }
    public void setmodul(String modul) {
    	this.modul= modul;
    }
    public void setyear(int year) {
    	this.year= year;
    	
    }
    public void setnumberOfdoors(int numberOfdoors ) {
    	this.numberOfdoors= numberOfdoors;
    
    }
}
