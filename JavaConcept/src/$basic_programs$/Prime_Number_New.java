package $basic_programs$;

public class Prime_Number_New {

	public static void main(String[] args) {
	//n=7	
	int i, n=18, temp=0;
	for(i=2;i<=n-1;i++) {
		if(n%i==0) {
			temp=temp+1;
		}
	}
	if(temp>0) {
		System.out.println(n+  "  Number is not prime");
	}else {
		System.out.println(n+  "  Number is prime");
	}

	}

}
