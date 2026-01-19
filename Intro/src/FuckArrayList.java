import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FuckArrayList {

	public static void main(String[] args) {
		
				//Array List for dynamically grow the size of an array 
				ArrayList<String> var = new ArrayList<String>();
				//Create object of the class - object.method
				var.add("allen");
				var.add("James");
				var.add("Lluvido");
				System.out.println(var);
				
				
				//Iterating over this loops 
				//length for normal array 
				//size for arraylist 
				for (int i=0; i<var.size(); i++) 
				{
					System.out.println(var.get(2));
				}
				
				for(String val: var) {
					System.out.println(val);
				}
				 //for checking
				System.out.println(var.contains("Buquiron"));
		
				//converting array to array list 
				String [] names = {"miska" , "muska", "mouse"}; //Normal Array
				List <String> nameArrayList = Arrays.asList(names); //converted to arrayList
				System.out.println(nameArrayList);

	}

}
