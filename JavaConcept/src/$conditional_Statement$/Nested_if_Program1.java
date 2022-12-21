package $conditional_Statement$;

public class Nested_if_Program1 {

	public static void main(String[] args) {
		// Create a program to find largest number
		// let suppose number are 100, 200, 400
		
		int x =10 ;
		int y =10 ;
		int z =10 ;
		
		if(z>y && y>=x) {
			System.out.println("Number is largest"+z);
			
		}else if(x>y && y>=z){
			System.out.println("Number is  largest"+x);
			
		}else if(y>x && x>=z){
			System.out.println("Number is  largest"+y);
		}else {
			System.out.println("ALL are same");
		}

	}

}
