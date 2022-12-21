package special_Classes;

public class String_Builder {

	public static void main(String[] args) {
		//String Builder class: It is use to create mutable(modified) string
		//methods:-append, replace, insert, delete, reverse
		String s1= "I";
		s1= s1+ " Like";
		s1= s1+ " Java";
		System.out.println(s1);
		StringBuilder sb1= new StringBuilder("I");
		sb1.append(" Love");
		sb1.append(" JAVA");
		System.out.println(sb1);
		

	}

}
