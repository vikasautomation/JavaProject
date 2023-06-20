package topLogicsPrograms;

public class ReverseEachWordInStrings {

	public static void main(String[] args) {
		String str= "My Name Is Vikas";
		String[] words=str.split(" ");
		String reverseStr= "";
		for(String s:words) {
			String reverseWord="";
			for(int i=s.length()-1;i>=0;i--)//My
			{
				reverseWord= reverseWord+s.charAt(i);
			}
			
			reverseStr= reverseStr+reverseWord+" ";//ym
		}
		
		System.out.println(reverseStr);
	}

}
