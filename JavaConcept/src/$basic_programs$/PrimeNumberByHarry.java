package $basic_programs$;

public class PrimeNumberByHarry {

	public static void main(String[] args) {
		int number = 15;
		int status =0;
		if(number == 0 || number == 1) {
			status = 1;
		}else {
					
			for(int i =2;i < number;i++) {
						
				if(number % i == 0) {
					status = 1;
					break;
				}
			}
				}
				
				if(status == 0) {
					
					System.out.print("prime number");
				}else {
					System.out.print("Not prime number");
				}
	}

}
