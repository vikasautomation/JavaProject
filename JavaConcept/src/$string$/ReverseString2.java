package $string$;

public class ReverseString2 {

	public static void main(String[] args) {
		String s1 = new String("Jasmeet");
		System.out.println(s1);
		 int length= s1.length();
		 System.out.println(length);
		 String temp= "";
		for(int i=0; i<s1.length();i++) {
			temp=s1.charAt(i)+ temp;
		}
			System.out.println(temp);
			if(s1.equalsIgnoreCase(temp)) {
				System.out.println("Strings are not reversed");
			}else {
				System.out.println("Strings are reversed");
			}
		}

	}



