package $basic_programs$;

public class FcatorialwithAnonymousObject {
	
	void factorial(int n) {
		int i=1, fact =1;
		for(i=1;i<=n;i++) {			
			fact= fact*i;	
		}
		System.out.println("The fact of" +"n " + "is= " +fact);
		
	}
	public static void main(String[] args) {
		new FcatorialwithAnonymousObject().factorial(6);
	}

}
