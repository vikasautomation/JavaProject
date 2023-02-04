package $string$;

public class ReverseString3 {

	public static void main(String[] args) {
		String s1= "niharika";
		s1.toLowerCase();
		s1.toUpperCase();
		String dummy="";
		for(int i=0; i<s1.length();i++) {
			dummy= s1.charAt(i)+dummy;
		}
		System.out.println("The Reverse String is "+ dummy);
		String newString=dummy.substring(2);
		System.out.println(newString);
		
		for(int j=0;j<newString.length();j++) {
			dummy=newString.charAt(j)+dummy;
			
		}
		System.out.println("The Reverse String is "+ dummy);
	}
	
}
