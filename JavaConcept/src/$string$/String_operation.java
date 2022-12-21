package $string$;

public class String_operation {

	public static void main(String[] args) {
		//SubString
		//Split
		
		String str1= "ABCDEFGH";
		System.out.println(str1.substring(3));
		System.out.println(str1.subSequence(2, 5));//Here starting index is included but not end index
		//Split
		
		String str2="A_B_C_D_E";
	//	String str3="B";
		String str3="_";
		String[] arr= str2.split(str3);
		for(String x: arr) {
			System.out.println(x);
		}
	
		
				
	}

}
