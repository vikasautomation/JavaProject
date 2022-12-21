package $string$;

public class Search_String {
	public static void main(String args[]) {
		String str1="I love java and java selenium";
		String str2="java";
		System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));
		
		System.out.println(str1.startsWith("I"));
		System.out.println(str1.endsWith("selenium"));
		System.out.println(str1.indexOf('l'));
		System.out.println(str1.indexOf("java"));
		System.out.println(str1.indexOf("java", 10));
		System.out.println(str1.lastIndexOf("java"));
		
		
	}
	
	
	
	
}
