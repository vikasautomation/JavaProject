package $conditional_Statement$;

public class Fibbonaci_Series_For_loop {

	public static void main(String[] args) {
		//Fibbonaci series 0,1,1,2,3,5,8,13,21,34.
		int n1= 0;
		int n2= 1;
		System.out.println("Fibbonaci series------> "+n1);
		System.out.println("Fibbonaci series------> "+n2);
		
		for(int i=1; i<=18; i++) {
		int	n= n1+ n2;
			n1=n2;
			n2=n;
			System.out.println("Fibbonaci series------> "+ n);
		}

	}

}
