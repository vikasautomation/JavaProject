package $conditional_Statement$;

public class While_loop {

	public static void main(String[] args) {
		// Need to execute when iteration is not fixed
		//While loop will execute only if condition is true .
		int x=100;
//		while(x>20) {
//			x-=5;
//			System.out.println(x);
//			
//		}
		//do-while:- WE use when number of iteration is not fixed also we need execute loop atleast once
		//However conditional is false "do" or loop will execute once.
//		do {
//			x-=5;
//			System.out.println(x);
//		
//		}while(x<20);
		
		//Break Statement: Used to break the loop
		while(x>20) {
			x-=5;
			System.out.println(x);
			if(x==40) {
				break;
			}
		}
		
	//Continue Statement: Used to continue to next iteration and skip the lines written after continue statement
//		while(x>20) {
//			x-=5;
//			
//			if(x==40) {
//				continue;
//			}
//			System.out.println(x);
//			
//
//	}

}
}