package Polymorphism;

public class Bmv extends Car {
	
	    
	    private int numberOfCylenders;
	    private String engineModel;
	    
	    Bmv (){
	    	
	    }
	    
	 public Bmv(int numberOfCylenders, String engineModel,String name, String modul, int  year, int numberOfdoors) {
		super(name,modul, year, numberOfdoors);
		this.numberOfCylenders= numberOfCylenders;
		this.engineModel= engineModel;
		 
	 }
	 
	/* 
	  below is example of runtime polymorphism. overriding method.  
	  the below method will behave 
	  differently for bmv. while it has diifernt return type in parent class.
	  same method with different behavior in child class called overriding.
	  */
	 public String getmodul() {
	 return "* the modul for Bmv is not avilbel pleaase chech with the staff";
	    
	 }
	  
	 public String getname() {
		 return " i want to buy Bmv"+ "  " + super.getname();
	 }
	 }
	    
	    
	



