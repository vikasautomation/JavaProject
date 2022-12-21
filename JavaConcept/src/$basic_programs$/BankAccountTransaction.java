package $basic_programs$;

public class BankAccountTransaction {
	//Java Program to demonstrate the working of a banking-system  
	//where we deposit and withdraw amount from our account.  
	//Creating an Account class which has deposit() and withdraw() methods
	long acc_number;
	String name;
	double amount;
	
void insert(long acc, String user, double amt) {
	acc_number=acc;
	name= user;
	amount=amt;
}
void depositAmount(double amt) {
	amount= amount+ amt;
	System.out.println("Amount Deposited successfully");
}

void WithrawnAmount(double amt) {
	if(amount<amt) {
		System.out.println("Insifficient balance");
	}else {
		amount= amount-amt;
		System.out.println("Amount Withdrawn Successfully");
		
	}
	
}
void checkBalance() {
	System.out.println("The account balance is "+amount);
}
void displayDetails() {
	System.out.println(name + amount + acc_number);
}

}

 


