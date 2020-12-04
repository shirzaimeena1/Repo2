package inheritance;

public class Runner {

	public static void main(String[] args) {
		Mammal x= new Mammal();
		x.setname("zibra");
		
		Dog y= new Dog();
		y.setname("white dog");
		System.out.println(y.getname());
		y.setname("black dog");
		System.out.println(y.getname());
				
		
System.out.println(x.getname());  // it execute the override of method in mammal.
		
	}

}
