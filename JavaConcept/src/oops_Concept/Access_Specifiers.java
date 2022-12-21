package oops_Concept;

public class Access_Specifiers {
	//public=> Access same/other class of same/other package(Any where in Projects)
	//Default=> Access same/other of same package only 
	//Private=> Access only in same class
	
	public void doThisPublic() {
		System.out.println("public method");
	}
	
	void doThisDefault() {
		System.out.println("Default method");
	}
	
	private void doThisPrivate() {
		System.out.println("Private method");
	}
	
	
	
	

}
