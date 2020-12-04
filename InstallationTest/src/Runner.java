import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class Runner {

	public static void main(String[] args) {
		
		Employee x = new Employee ();
		
		x.setName("Ahmad");
		x.setAge(30);
		x.setDepartment("English");
	
		System.out.println(x.getName());
		System.out.println(x.getAge());
		System.out.println(x.getDepartment());
		
		ArrayList <Object> data= new ArrayList<Object>();
		data.add("Ahamd");
		data.add(30);
		data.add("English");
		
		
		HashMap<String, String> countryCity = new HashMap<String,String>();
		
		countryCity.put("us", "va");
		
		for (Entry<String, String> i : countryCity.entrySet()) {
			System.out.println(i);
		}
		



		
		

	}

}
