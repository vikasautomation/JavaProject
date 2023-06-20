package $basic_programs$;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	public static void main(String[] args) {
  
			ArrayList<String> list=new ArrayList();//Creating arraylist  
			list.add("Ravi");//Adding object in arraylist  
			list.add("Vijay");  
			list.add("Ravi");  
			list.add("Ajay"); 
			//Traversing list through Iterator  
			Iterator itr=list.iterator();  
			while(itr.hasNext()){  
			System.out.println(itr.next());  
			}  
			list.remove(2);
			System.out.println(list.toString());
			list.add("Vikas");
			System.out.println(list.toString());
			list.add(1, "Harry");
			list.add(2, "Love");
			list.add(3, "Jassi");
			System.out.println(list.toString());
			list.set(1, "Vikas");
			System.out.println(list.toString());
			String value=list.get(3);
			System.out.println(value);
			list.contains("Vikas");
			System.out.println(list.contains("Vikas"));
			
			
		
			
			}  
			

	}


