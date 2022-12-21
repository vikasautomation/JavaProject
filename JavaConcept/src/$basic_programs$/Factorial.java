package $basic_programs$;

public class Factorial {
	//factorial concept
	

	public static void main(String[] args) {
		int i;
		int fact= 1;
		int number= 5;
		for(i=1;i<=5;i++) {
			fact= fact*i;
			
		}
		System.out.println("The factorial of  " +number +" is "+ fact);

	}

}
