package $string$;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1= "Vikas";
		//System.out.println(str1.charAt(0));
		
		System.out.println(str1.length());
		String temp= "";
		for(int i=0; i<=str1.length()-1;i++) {
			temp= str1.charAt(i) + temp;
			
		}
		System.out.println(temp);
	}

}
