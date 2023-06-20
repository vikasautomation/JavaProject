package $basic_programs$;

public class CountPunctuation {

	public static void main(String[] args) {
		int counter=0;
		String test = "He said, 'The mailman... loves you.' I heard  ' it with my own ears";
		for(int i =0;i< test.length();i++) {
			
			if(test.charAt(i)==',' || test.charAt(i) == '\'' || test.charAt(i) == '.' ) {
				counter +=1;
			}
		}
		System.out.println("The count is "+ counter);
		
	}
	

}
