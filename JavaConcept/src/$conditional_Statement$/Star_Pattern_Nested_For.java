package $conditional_Statement$;

public class Star_Pattern_Nested_For {

	public static void main(String[] args) {
//		*
//		**
//		***
//		****
//		*****
//		******
//outer loops define rows
//inner loop print stars
		
//		for(int i=1;i<=10;i++) {
//			for(int j=1; j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println("\n");
//		}
		
		// just to reverse pattern need to make change in inner loop
		for(int i=1;i<=10;i++) {
			for(int j=10; j>=i;j--) {
				System.out.print("*");
			}
			System.out.println("\n");
		}
		
		
	}

}
