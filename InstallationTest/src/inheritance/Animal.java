package inheritance;

public  class Animal {
private String name;
  public Animal () {
	 name = "";
System.out.println(" Mammal cosntractor run");
 }
 public Animal (String name) {
	 this.name= name;
 }
 
 public String getname() {
	 return name;
 }
 public void setname (String name) {
	 this.name= name;
 }
}
