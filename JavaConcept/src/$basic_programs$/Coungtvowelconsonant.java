package $basic_programs$;

public class Coungtvowelconsonant {

	public static void main(String[] args) {
		int vcount=0;
		int cCount=0;
		String str= " i love my niharika";
		str = str.replace(" ", "");
		System.out.println(str);
		for(int i=0; i<str.length();i++) {
			if(str.toUpperCase().charAt(i) == 'A' || str.toUpperCase().charAt(i) == 'E'||str.toUpperCase().charAt(i) == 'I' ||str.toUpperCase().charAt(i) == 'O' ||str.toUpperCase().charAt(i) == 'U') {
				vcount++;
			}
			else {
			cCount++;
			}
			
		}
		System.out.println("vowel countv is "+ vcount );
		System.out.println("Cosonant countv is "+ cCount );
	}
	

	}


