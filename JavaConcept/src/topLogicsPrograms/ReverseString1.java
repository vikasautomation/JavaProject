package topLogicsPrograms;

public class ReverseString1 {

	public static void main(String[] args) {
		
		String str = "Selenium with java";
		String[]words=str.split(" ");
		String reverseString = "";
		String reverseWord="";
		for(String s: words) {
			//String reverseWord="";
			for(int i= s.length()-1;i<=0;i--) {
				reverseWord= reverseWord+s.charAt(i);
			}
			reverseString= reverseString+reverseWord+" ";
		}
		
		System.out.println(reverseString);

	}

}
