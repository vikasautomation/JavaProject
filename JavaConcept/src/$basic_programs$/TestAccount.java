package $basic_programs$;

public class TestAccount {
	//Creating a test class to deposit and withdraw amount  
	public static void main(String[] args){  
		BankAccountTransaction a1=new BankAccountTransaction();  
	a1.insert(91407856,"Vikas",1000);  
	a1.displayDetails();
	a1.checkBalance();  
	a1.depositAmount(40000); 
	a1.checkBalance();  
	a1.WithrawnAmount(15000);
	a1.checkBalance();  
	}}  


