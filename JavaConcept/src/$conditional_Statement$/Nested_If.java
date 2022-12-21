package $conditional_Statement$;

public class Nested_If {

	public static void main(String[] args) {
		/*Create a program just to find grades
		 * marks>=90 =>  Grade A
		 * marks>=75 => Grade B
		 * marks>=60 => Grade c
		 * marks>=40 => Grade D
		 * marks<40 => Fail
		 */
// Just try with simple if 
//		int marks = 95;
//		if(marks>=90) {
//			System.out.println("A Grade");
//			
//		}
//		if(marks>=75) {
//			System.out.println("B Grade");
//			
//		}
//		if(marks>=60) {
//			System.out.println("C Grade");
//		}
//		if(marks>=40) {
//			System.out.println("D Grade");
//		}
//		if(marks<40) {
//			System.out.println("FAil");
//		}
		/* Output is :-
A Grade
B Grade
C Grade
D Grade	
Just to overcome this we use nested-if 	
		 */
		int marks = 49;
		if(marks>=90) {
			System.out.println("A Grade");
		}else if (marks>=75) {
			System.out.println("B Grade");
			
		}else if (marks>=60) {
			System.out.println("C Grade");
			
		}else if(marks>=40) {
			System.out.println("D grade");
			
		}else {
			System.out.println("Fail");
		}
		
		
		
	}

}
