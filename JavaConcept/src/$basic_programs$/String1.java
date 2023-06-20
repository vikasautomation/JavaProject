package $basic_programs$;

public class String1 {


	public static void main(String[] args) {
		//Java Program to count the total number of characters in a string
		String data = "jassi love's harry";
		int counter =0;
		
		for(int i=0;i<data.length();i++) {
			
			if(data.charAt(i) !=' ') {
				counter++;
			}
		}
		
//		int b;
//		if(counter > 10) {
//			if(counter > 5) {
//				b =3;				
//			}else {
//				b =6;
//			}
//
//		}else {
//			b = 0;
//		}
	   //int a = counter > 10	? counter > 5 ? 3: 3 :1; 
		System.out.print("counter >>> "+counter);
	}

}
