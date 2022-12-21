package $string$;

public class Operation_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Equal
		String str1= "VIKAS";
		String str2= "VIKAs";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		//Compare
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
		//Match
		String str3= "[A-Z]{1,}";
		System.out.println(str1.matches(str3));
	}

}
