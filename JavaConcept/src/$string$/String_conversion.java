package $string$;

public class String_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		//Integer to strings
		int num =100;
	System.out.println(Integer.toBinaryString(num));
	System.out.println(Integer.toHexString(num));
	System.out.println(Integer.toOctalString(num));
	System.out.println(Integer.toString(num));
	//String to integers
	String str1="1100100";
	String str2="64";
	String str3="144";
	String str4="100";
	
	
	
	System.out.println(Integer.parseInt(str1, 2));
	System.out.println(Integer.parseInt(str2, 16));
	System.out.println(Integer.parseInt(str3, 8));
	System.out.println(Integer.parseInt(str4));

	
	
	
	

	}

}
