package $string$;

public class String_Replace {

	public static void main(String[] args) {
		// Replace
		//Repalce all- Regex
		String str1= "Follow Your 1234ream";
		String str2= "1234";
		String str3="D";
		System.out.println(str1.replace(str2, str3));
		
		String str4="Contrl ^%Your $M^ind $%   $or#i%t will control#y*our mind(*))(*";
		String patt="[^A-Za-z0-9||s]";
		System.out.println(str4.replaceAll(patt, ""));

	}

}
